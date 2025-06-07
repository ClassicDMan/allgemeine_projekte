import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Artikel } from '../../../../interfaces/artikelInterfaces/artikel';

@Component({
  selector: 'app-artikel-details',
  imports: [RouterLink],
  templateUrl: './artikel-details.component.html',
  styleUrl: './artikel-details.component.scss'
})
export class ArtikelDetailsComponent implements OnInit {
  artikel: Artikel | null = null;

  constructor(private route: ActivatedRoute, private http: HttpClient, private router: Router) {}

  ngOnInit(): void {
    const artikelId = this.route.snapshot.paramMap.get('id');
    if (artikelId) {
      this.loadArticle(artikelId);
    }
  }

  loadArticle(id: string): void {
    this.http.get<Artikel>(`http://localhost:3000/posts/${id}`).subscribe(
      (data) => {
        this.artikel = data;
      },
      (error) => {
        console.error('Fehler beim Laden des Artikels:', error);
      }
    );
  }

  backToOverview() {
    this.router.navigate(['/artikelmenu']);
  }
}
