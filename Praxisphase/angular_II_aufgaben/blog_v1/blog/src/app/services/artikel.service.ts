import { Injectable } from '@angular/core';
import { Artikel } from '../interfaces/artikelInterfaces/artikel';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ArtikelService {

  private apiUrl: string = 'http://localhost:3000/posts';

  constructor(private http: HttpClient) { }

  createArtikel(artikel: Omit<Artikel, 'id'>): Observable<Artikel> {
    return this.http.post<Artikel>(this.apiUrl, artikel);
  }

  getArtikels(): Observable<Artikel[]> {
    return this.http.get<Artikel[]>(this.apiUrl);
  }

  updateArtikel(id: number, updatedArtikel: Artikel): Observable<Artikel> {
    return this.http.put<Artikel>(`${this.apiUrl}/${id}`, updatedArtikel);
  }

  getArtikelById(id: number): Observable<Artikel> {
    return this.http.get<Artikel>(`${this.apiUrl}/${id}`);
  }

  deleteArtikel(id: number): Observable<Artikel> {
    return this.http.delete<Artikel>(`${this.apiUrl}/${id}`);
  }
}
