import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ArtikelService } from '../../../../services/artikel.service';
import { Artikel } from '../../../../interfaces/artikelInterfaces/artikel';

@Component({
  selector: 'app-artikel-builder',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './artikel-builder.component.html',
  styleUrls: ['./artikel-builder.component.scss']
})
export class ArtikelBuilderComponent {
  title = '';
  content = '';

  titleValid = true;
  contentValid = true;

  @Output() newArticle = new EventEmitter<Artikel>();

  constructor(private router: Router, private artikelService: ArtikelService) {}

  validateForm() {
    this.titleValid = this.title.trim().length > 0;
    this.contentValid = this.content.trim().length >= 10;
    return this.titleValid && this.contentValid;
  }

  onSubmit() {
    if (this.validateForm()) {
      const newArtikel: Artikel = {
        title: this.title,
        content: this.content
      };

      // HTTP-Aufruf zum Speichern des neuen Artikels
      this.artikelService.createArtikel(newArtikel).subscribe({
        next: (createdArtikel) => {
          console.log('Artikel erfolgreich erstellt:', createdArtikel);
          // Weiterleitung oder Statusaktualisierung nach erfolgreicher Erstellung
          this.router.navigate(['/artikelmenu'], { 
            queryParams: { 
              titel: createdArtikel.title, 
              artikelText: createdArtikel.content 
            } 
          });
        },
        error: (err) => {
          console.error('Fehler beim Erstellen des Artikels:', err);
        }
      });
    }
  }
}
