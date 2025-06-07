import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

interface Witz {
  setup: string;
  punchline: string;
}

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
