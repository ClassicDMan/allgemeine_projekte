import { Component, OnInit } from '@angular/core';
import { Logo } from '../../interfaces/logo';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-navigation-bar',
  imports: [],
  templateUrl: './navigation-bar.component.html',
  styleUrl: './navigation-bar.component.scss'
})
export class NavigationBarComponent implements OnInit{
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
