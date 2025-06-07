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
  id?: number;
  title: string = '';
  content: string = '';
  date: string = ''; 

  titleValid: boolean = true;
  contentValid: boolean = true;

  @Output() newArticle = new EventEmitter<any>();

  constructor(private router: Router, private artikelService: ArtikelService) {}

  ngOnInit() {
    this.date = new Date().toISOString().split('T')[0];
  }

  validateForm() {
    this.titleValid = this.title.trim().length > 0;
    this.contentValid = this.content.trim().length >= 10;
    return this.titleValid && this.contentValid;
  }

  onSubmit() {
    if (this.validateForm()) {
      const newArtikel: Omit<Artikel, 'id'> = {
        title: this.title,
        content: this.content,
        date: this.date  
      };

      this.artikelService.createArtikel(newArtikel).subscribe({
        next: (createdArtikel) => {
          console.log('Artikel erfolgreich erstellt:', createdArtikel);
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
