import { Component, OnInit, SimpleChanges } from '@angular/core';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { WitzService } from '../../services/witz.service';
import { CommonModule } from '@angular/common';
import { Artikel } from '../../interfaces/artikelInterfaces/artikel';
import { JsonData } from '../../interfaces/data-source/json-data';
import { ArtikelService } from '../../services/artikel.service';
import { ModalComponent } from './artikelmenuComponent/artikel/modal/modal.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-artikelmenu',
  standalone: true,
  imports: [RouterLink, CommonModule, ModalComponent, FormsModule],
  templateUrl: './artikelmenu.component.html',
  styleUrls: ['./artikelmenu.component.scss']
})
export class ArtikelmenuComponent implements OnInit {
  mehrLesenButton: string = '';
  artikelBearbeitenButton: string = '';
  artikelLoeschenButton: string = '';
  jsonFilePath = 'assets/data/data_source.json';

  showModal: boolean = false;
  articleToDelete: Artikel | null = null;
  deleteMessage: string = "Wollen Sie diesen Artikel wirklich löschen?";

  articles: Artikel[] = [];
  witz: { setup: string; punchline: string } | null = null;


  constructor(
    private http: HttpClient,
    private witzService: WitzService,
    private artikelService: ArtikelService,
    private router: Router,
  ) {}

  ngOnInit(): void {
    this.loadJsonData();
    this.loadArticles();
    this.loadJoke();
  }

  loadArticles(): void {
    this.artikelService.getArtikels().subscribe(
      data => {
        this.articles = data;
      },
      error => {
        console.error('Fehler beim Laden der Artikel:', error);
      }
    );
  }
  
  loadJsonData(): void {
    this.http.get<JsonData[]>(this.jsonFilePath).subscribe(
      (data) => {
        if (data.length > 0) {
          const jsonData = data[0];
          this.mehrLesenButton = jsonData.mehrLesenText || this.mehrLesenButton;
          this.artikelBearbeitenButton = jsonData.artikelBearbeitenText || this.artikelBearbeitenButton;
          this.artikelLoeschenButton = jsonData.artikelLoeschenText || this.artikelLoeschenButton;
        }
      },
      (error) => {
        console.error('Fehler beim Laden der JSON-Daten:', error);
      }
    );
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

  artikelUpdated(updatedArtikel: Artikel): void {
    const index = this.articles.findIndex(article => article.id === updatedArtikel.id);
    if (index !== -1) {
      this.articles[index] = updatedArtikel;
    } else {

      this.loadArticles();
    }
}

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

  openDeleteModal(article: Artikel): void {
    this.articleToDelete = article;
    this.showModal = true;
  }

  closeDeleteModal(): void {
    this.showModal = false;
    this.articleToDelete = null;
  }

  deleteArticle(): void {
    if (this.articleToDelete) {
      this.artikelService.deleteArtikel(this.articleToDelete.id).subscribe(
        () => {
          this.articles = this.articles.filter(article => article.id !== this.articleToDelete!.id);
          this.closeDeleteModal();
          this.router.navigate(['/artikelmenu']);
        },
        (error) => {
          console.error('Fehler beim Löschen des Artikels:', error);
        }
      );
    }
  }
}
