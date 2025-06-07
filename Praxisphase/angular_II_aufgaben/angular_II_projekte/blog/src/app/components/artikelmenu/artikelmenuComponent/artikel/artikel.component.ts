import { Component, Input } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-artikel',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './artikel.component.html',
  styleUrl: './artikel.component.scss'
})
export class ArtikelComponent {

  @Input() titel = '';
  @Input() artikelText = '';
  @Input() mehrLesenButton = '';
  @Input() postId = 0;  // Neue Input-Eigenschaft für die Post-ID


  // @Output() mehrLesenClicked: EventEmitter<number> = new EventEmitter<number>(); // Korrekte Typisierung des EventEmitter

  // onMehrLesen() {
  //   this.mehrLesenClicked.emit(this.postId);  // Die ID des Artikels wird beim Klick übergeben
  // }

}
