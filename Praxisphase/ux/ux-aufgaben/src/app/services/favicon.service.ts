import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FaviconService {

  private link: HTMLLinkElement | null = document.querySelector("link[rel*='icon']");

  constructor() {}

  setFavicon(iconUrl: string): void {
    if (this.link) {
      this.link.href = iconUrl;
    } else {
      this.link = document.createElement('link');
      this.link.rel = 'icon';
      this.link.href = iconUrl;
      document.head.appendChild(this.link);
    }
  }}
