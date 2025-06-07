import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { WidgetComponent } from "./components/widget/widget.component";
@Component({
  selector: 'app-root',
  imports: [WidgetComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'error-handler-aufgabe02';
}
