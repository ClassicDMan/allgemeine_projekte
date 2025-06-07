import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';
import {RouterLink } from '@angular/router';
import { Artikel } from '../../../../interfaces/artikelInterfaces/artikel';
import {  } from '@angular/common/http';

@Component({
  selector: 'app-artikel',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './artikel.component.html',
  styleUrl: './artikel.component.scss'
})
export class ArtikelComponent implements OnChanges{

  @Input() titel: string = '';
  @Input() artikelText: string = '';
  @Input() postId: number = 0;
  @Input() datum: string = '';
  
  @Input() mehrLesenButton: string = '';
  @Input() artikelBearbeitenButton: string = '';
  @Input() artikelLoeschenButton: string = '';

  @Output() mehrLesenClicked: EventEmitter<number> = new EventEmitter<number>(); // Korrekte Typisierung des EventEmitter
  @Output() artikelUpdated: EventEmitter<Artikel> = new EventEmitter<Artikel>();

  // Debugging: --> Level 03 --> Values finden
  ngOnChanges(changes: SimpleChanges): void {
    console.log('Empfangene Daten in ArtikelComponent:', {
      postId: this.postId,
      titel: this.titel || 'FEHLER: titel undefined!',
      artikelText: this.artikelText || 'FEHLER: artikelText undefined!',
      datum: this.datum || 'FEHLER: datum undefined!'
    });
  }

  updateArticle(updatedArtikel: Artikel) {
    console.log('Aktualisierte Artikel-Daten:', updatedArtikel);
    this.artikelUpdated.emit(updatedArtikel);
  }
}

  


