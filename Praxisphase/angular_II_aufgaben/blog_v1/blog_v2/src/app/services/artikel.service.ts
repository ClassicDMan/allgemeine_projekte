import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Artikel } from '../interfaces/artikel';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ArtikelService {

  private apiUrl: string = 'http://localhost:3000/posts';

  constructor(private http: HttpClient) { }

  createArtikel(newArtikel: Artikel): Observable<Artikel> {
    return this.http.post<Artikel>(this.apiUrl, newArtikel);
  }

  getArtikels(): Observable<Artikel[]> {
    return this.http.get<Artikel[]>(this.apiUrl);
  }

  // getArtikels(): Observable<Artikel[]>{
  //   return this.http.get<Artikel[]>(``);
  // }
}
