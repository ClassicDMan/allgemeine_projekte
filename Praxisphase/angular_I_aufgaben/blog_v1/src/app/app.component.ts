/*
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NavbarComponent } from "./components/navbar/navbar.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, NavbarComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'blog';
}
*/

import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NavbarComponent } from "./components/navbar/navbar.component";
import { FooterComponent } from "./components/footer/footer.component";
import { RouterOutlet } from '@angular/router';

interface Logo {
  logo: string;
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [NavbarComponent, RouterOutlet, FooterComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'blog';
  logoUrl: string = '';

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http.get<Logo[]>('assets/data/data_source.json').subscribe((data) => {
      if (data.length > 0) {
        this.logoUrl = './' + data[0].logo.trim().replace(/^\/+/, ''); // GET Req liefert leere logoUrl

        // console.log("Logo URL:", this.logoUrl); // Debugging log Problem Level 1 gelöst
      }
    });
  }
}
