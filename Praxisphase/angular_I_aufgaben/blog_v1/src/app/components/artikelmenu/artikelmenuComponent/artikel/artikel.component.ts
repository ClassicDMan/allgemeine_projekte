import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-artikel',
  standalone: true,
  imports: [],
  templateUrl: './artikel.component.html',
  styleUrl: './artikel.component.scss'
})
export class ArtikelComponent {

  @Input() titel: string = '';
  @Input() artikelText: string = '';
  @Input() mehrLesenButton: string = '';

}
