import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { BlogHeaderComponent } from "./components/blog-header/blog-header.component";
import { HttpClient } from '@angular/common/http';

interface Logo{
  logo: string;
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, BlogHeaderComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})

export class AppComponent implements OnInit {
  title = 'blog';
  logo: Logo | null = null;

  constructor(private http: HttpClient) {}

  ngOnInit() {
    // fetch the logo data to json 
    this.http.get<Logo[]>('./assets/data/data_source.json').subscribe((data_source) => {
      if (data_source.length > 0) {
        this.logo = data_source[0];
      }
    });
  }
}

