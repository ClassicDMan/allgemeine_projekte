import { Component } from '@angular/core';
import { CardModule } from 'primeng/card';
import { ButtonModule } from 'primeng/button';
import { HttpClient } from '@angular/common/http';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
import { ThemeService } from '../../services/themes/theme.service';



@Component({
  selector: 'app-main',
  standalone: true,
  imports: [CardModule, ButtonModule],
  templateUrl: './main.component.html',
  styleUrl: './main.component.scss'
})
export class MainComponent {
  imageUrl: string | undefined;
  imageText: string = 'Willkommen zu unserem eCommerce Shop';


  constructor(private http: HttpClient) {}
  ngOnInit(): void {
    this.loadImage();
  }

  toggleDarkMode() {
    const element = document.querySelector('html');
    element?.classList.toggle('dark');
}

  loadImage(): void {
    this.http.get<{ jlogo: string; lionlogo: string; eCommerce: string }[]>('/../assets/data/data_source.json').subscribe(
      (data) => {  
        if (data && data.length > 0 && data[0].eCommerce) {
          this.imageUrl = data[0].eCommerce;
        } else {
          console.warn('Standardbild wird verwendet.');
        }
      },
      (error) => {
        console.error('Fehler beim Laden der Bilddaten:', error);
      }
    );
  }
}
