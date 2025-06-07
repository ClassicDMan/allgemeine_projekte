import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ButtonModule } from 'primeng/button';
import { CardModule } from 'primeng/card';
import { TableModule } from 'primeng/table';
import { NavigationBarComponent } from "./components/navigation-bar/navigation-bar.component";
import { SideBarComponent } from "./components/side-bar/side-bar.component";
import { FooterComponent } from "./components/footer/footer.component";
import { MainComponent } from "./components/main/main.component";
import { HttpClient } from '@angular/common/http';
import { FaviconService } from './services/favicon.service';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet ,ButtonModule, CardModule, TableModule, NavigationBarComponent, 
     FooterComponent, RouterOutlet, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {
    isSidebarCollapsed = false;

  constructor(
    private http: HttpClient,
    private faviconService: FaviconService
  ) {}

  ngOnInit(): void {
    this.loadFavicon();
  }
  
  loadFavicon(): void {
    this.http.get<{ jlogo: string; lionlogo: string }[]>('/../assets/data/data_source.json').subscribe(
      (data) => {  
        if (data && data.length > 0 && data[0].lionlogo) {
          this.faviconService.setFavicon(data[0].lionlogo);
        } else {
          console.warn('default Logo eingesetzt');
        }
      },
      (error) => {
        console.error('Fehler beim Laden der Favicon-Daten:', error);
      }
    );
  }
  
  toggleSidebar(): void {
    this.isSidebarCollapsed = !this.isSidebarCollapsed;
  }
  
}
