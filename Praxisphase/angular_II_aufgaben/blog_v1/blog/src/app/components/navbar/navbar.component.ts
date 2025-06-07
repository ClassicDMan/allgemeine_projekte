import { HttpClient } from '@angular/common/http';
import { Component, Input, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';

interface Logo {
  logo: string;
}

@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.scss'
})
export class NavbarComponent implements OnInit{
  logoPath: string = '';  // Variable zum Speichern der vollständigen URL für das Logo, das brauche ich, um es in der HTML-Datei zu verwenden

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    // Logo-URL aus der JSON-Datei abrufen, die ich im Projekt erstellt habe
    this.http.get<Logo[]>('http://localhost:3000/logo-info').subscribe({
      next: (data) => {
        console.log("Logo received:", data); // Debugging, um sicherzustellen, dass die Daten korrekt übertragen werden
        // Logo-URL aus dem JSON extrahieren, 
        if (data && data.length > 0) {
          // frage: Wie kann ich die URL aus dem Array extrahieren? in dem ich die [key] suche
          this.logoPath = data[0].logo; // Hole die Logo-URL aus der ersten (und einzigen) JSON-Datenstruktur
          console.log("Logo URL:", this.logoPath);
        }
      },
      error: (err) => {
        console.error("Error loading logo:", err);
      }
    });
  }
}
