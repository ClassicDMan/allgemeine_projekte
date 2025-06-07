import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ThemeService {
  switchTheme(themeName: string) {
    const existingLink = document.getElementById('app-theme') as HTMLLinkElement;
    if (existingLink) {
      existingLink.href = `assets/themes/${themeName}/theme.css`;
    } else {
      const link = document.createElement('link');
      link.rel = 'stylesheet';
      link.id = 'app-theme';
      link.href = `assets/themes/${themeName}/theme.css`;
      document.head.appendChild(link);
    }
  }
}
