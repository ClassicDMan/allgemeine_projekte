import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Artikel } from '../../../../interfaces/artikelInterfaces/artikel';
import { CommonModule } from '@angular/common';
import { JsonData } from '../../../../interfaces/data-source/json-data';

@Component({
  selector: 'app-artikel-details',
  imports: [CommonModule],
  templateUrl: './artikel-details.component.html',
  styleUrl: './artikel-details.component.scss'
})
export class ArtikelDetailsComponent implements OnInit {
  artikelBearbeitenText: string = '';
  artikelLoeschenText: string = '';
  jsonFilePath = 'assets/data/data_source.json';
  artikel: Artikel | null = null;

  constructor(private route: ActivatedRoute, private http: HttpClient, private router: Router) {}

  ngOnInit(): void {
    const artikelId = this.route.snapshot.paramMap.get('id');
    console.log("Artikel ID aus Route:", artikelId); // Debugging
    if (artikelId) {
      const id = Number(artikelId);
      console.log("Umgewandelte ID:", id);
      if (id > 0) {
        this.loadArticle(id);
      } else {
        console.error('Ungültige ID:', id);
      }
    } else {
      console.error('ID nicht gefunden');
    }
    this.loadJsonData();
  }
  
  loadArticle(id: number): void {
    this.http.get<Artikel>(`http://localhost:3000/posts/${id}`).subscribe({
      next: (data) => {
        this.artikel = data;
      },
      error: (error) => {
        console.error('Fehler beim Laden des Artikels:', error);
        this.artikel = null;
      }
    });
  }

  loadJsonData(): void {
    this.http.get<JsonData[]>(this.jsonFilePath).subscribe(
      (data) => {
        if (data.length > 0) {
          const jsonData = data[0];
          this.artikelBearbeitenText = jsonData.artikelBearbeitenText || this.artikelBearbeitenText;
          this.artikelLoeschenText = jsonData.artikelLoeschenText || this.artikelLoeschenText;
        }
      },
      (error) => {
        console.error('Fehler beim Laden der JSON-Daten:', error);
      }
    );
  }

  // editArtikel(): void {
  //   if (this.artikel) {
  //     this.router.navigate(['/artikelmenu/artikel-bearbeiten', this.artikel.id]);
  //   }
  // }

  backToOverview() {
    this.router.navigate(['/artikelmenu']);
  }
}
