import { Component } from '@angular/core';
import { AdressComponent } from './contactRelevanteCompo/adress/adress.component';

@Component({
  selector: 'app-contact',
  standalone: true,
  imports: [AdressComponent],
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.scss'
})
export class ContactComponent {

}
