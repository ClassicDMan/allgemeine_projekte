import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ArtikelService } from '../../../../../services/artikel.service';
import { Artikel } from '../../../../../interfaces/artikelInterfaces/artikel';


@Component({
  selector: 'app-artikel-bearbeiten-formular',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, FormsModule],
  templateUrl: './artikel-bearbeiten-formular.component.html',
  styleUrl: './artikel-bearbeiten-formular.component.scss'
})
export class ArtikelBearbeitenFormularComponent implements OnInit {
  artikelForm!: FormGroup;
  id: number = 0;
  titel: string = '';
  artikelText: string = '';
  datum: string = ''; 

  titleValid: boolean = true;
  contentValid: boolean = true;

  validateForm() {
    this.titleValid = this.titel.trim().length > 0;
    this.contentValid = this.artikelText.trim().length >= 10;
    return this.titleValid && this.contentValid;
  }

  @Output() artikelUpdated: EventEmitter<Artikel> = new EventEmitter<Artikel>();

  constructor(
    private route: ActivatedRoute,
    private fb: FormBuilder,
    private router: Router,
    private artikelService: ArtikelService
  ) {}

  ngOnInit(): void {
    this.id = Number(this.route.snapshot.paramMap.get('id'));

    this.artikelForm = this.fb.group({
      titel: ['', Validators.required],
      artikelText: ['', [Validators.required, Validators.minLength(10)]],
      datum: ['', Validators.required]
    });

    this.artikelService.getArtikelById(this.id).subscribe((existingArticle: Artikel) => {
      this.artikelForm.setValue({
        titel: existingArticle.title || '',
        artikelText: existingArticle.content || '',
        datum: existingArticle.date || ''
      });
    }, (error) => {
      console.error('Fehler beim Abrufen des Artikels:', error);
    });
  }

  onSubmit(): void {
    if (this.artikelForm.valid) {
        const updatedArtikel: Artikel = {
            id: this.id,
            title: this.artikelForm.value.titel,
            content: this.artikelForm.value.artikelText,
            date: this.artikelForm.value.datum
        };

        this.artikelService.updateArtikel(this.id, updatedArtikel).subscribe(
            (response) => {
                console.log('Artikel erfolgreich aktualisiert:', response);
                
                this.artikelUpdated.emit(updatedArtikel);
                this.router.navigate(['/artikelmenu']);
            },
            (error) => {
                console.error('Fehler beim Aktualisieren des Artikels:', error);
            }
        );
    }
}
}