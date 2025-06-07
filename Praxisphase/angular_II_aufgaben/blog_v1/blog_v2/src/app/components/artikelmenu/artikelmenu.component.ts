import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Artikel } from '../../interfaces/artikel';

import { HttpClient } from '@angular/common/http';
import { WitzService } from '../../services/witz.service';
import { ArtikelComponent } from "./artikelmenu-components/artikel/artikel.component";

interface JsonData {
  logo: string;
  mehrLesenText: string;
}

@Component({
  selector: 'app-artikelmenu',
  imports: [RouterLink, CommonModule, ArtikelComponent],
  templateUrl: './artikelmenu.component.html',
  styleUrl: './artikelmenu.component.scss'
})
export class ArtikelmenuComponent {
  mehrLesenButton: string = '';
  jsonFilePath = 'assets/data/data_source.json';
  articles: Artikel[] = [];
  witz: { setup: string; punchline: string } | null = null;


  constructor(
    private http: HttpClient,
    private witzService: WitzService
  ) {}
  ngOnInit(): void {
    this.getMehrLesenText();
    this.loadArticles();
    this.loadJoke();

  }

  loadArticles(): void {
    this.http.get<Artikel[]>('http://localhost:3000/posts').subscribe(
      data => {
        this.articles = data;
        this.articles.forEach(article => {
        });
      },
      error => {
        console.error('Fehler beim Laden der Artikel:', error);
      }
    );
  }
  
    getMehrLesenText(): void {
      this.http.get<JsonData[]>(this.jsonFilePath).subscribe(data => {
        if (data.length > 0) {
          this.mehrLesenButton = data[0].mehrLesenText || 'Mehr lesen';
        }
      });
    }
  
    trackPost(index: number, post: Artikel): number {
      return post.id;
    }
  
  shortenText(artikelText: string, maxLength: number = 200): string {
    if (artikelText.length > maxLength) {
      return artikelText.substring(0, maxLength) + '...';
    }
    return artikelText;
  }

  // Lädt einen zufälligen Witz
  loadJoke(): void {
    this.witzService.getRandomJoke().subscribe(
      data => {
        this.witz = data;
      },
      error => {
        console.error('Fehler beim Laden des Witzes:', error);
      }
    );
  }
}
