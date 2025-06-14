import { Component } from '@angular/core';
import { FooterComponent } from "./components/footer/footer.component";
import { RouterOutlet } from '@angular/router';
import { NavbarComponent } from './components/navbar/navbar.component';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [NavbarComponent ,RouterOutlet, FooterComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent{
  title = 'blog';

}