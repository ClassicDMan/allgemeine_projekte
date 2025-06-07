import { Component, EventEmitter, Input, Output } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-artikel',
  imports: [RouterLink],
  templateUrl: './artikel.component.html',
  styleUrl: './artikel.component.scss'
})
export class ArtikelComponent {

  @Input() titel: string = '';
  @Input() artikelText: string = '';
  @Input() mehrLesenButton: string = '';
  @Input() postId: number = 0;  // postId wird erneut aktualisiert wenn die id von artikelmenu Component übergeben wird


  @Output() mehrLesenClicked: EventEmitter<number> = new EventEmitter<number>(); // Korrekte Typisierung des EventEmitter

  onMehrLesen() {
    this.mehrLesenClicked.emit(this.postId);  // Die ID des Artikels wird beim Klick übergeben
  }

}
