import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NavbarComponent } from "./components/navbar/navbar.component";
import { FooterComponent } from "./components/footer/footer.component";
import { RouterOutlet } from '@angular/router';

interface Logo {
  logo: string;
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [NavbarComponent, RouterOutlet, FooterComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'blog';
  logoUrl ='';

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http.get<Logo>('http://localhost:3000/logo').subscribe({
      next: (data: Logo) => {
        console.log("Logo received:", data); // Debugging
        this.logoUrl = `http://localhost:3000/${data.logo.trim()}`;
        console.log(this.logoUrl.trim())
      },
      error: (err) => {
        console.error("Error loading logo:", err);
      }
    });
  }
}