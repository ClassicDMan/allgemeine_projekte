import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { WidgetComponent } from "./components/widget/widget.component";
import { MatToolbarModule } from '@angular/material/toolbar';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, WidgetComponent, MatToolbarModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'error-handler-aufgabe-02';
}
