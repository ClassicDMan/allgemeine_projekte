import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Witz } from '../interfaces/witz';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WitzService {
  private apiUrl = 'https://official-joke-api.appspot.com/random_joke';

  constructor(private http: HttpClient) {}

  getRandomJoke(): Observable<Witz> {
    return this.http.get<Witz>(this.apiUrl);
  }
}
