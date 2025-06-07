import { Component, OnInit, HostListener } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { CommonModule } from '@angular/common';
import { Breadcrumb } from 'primeng/breadcrumb';

@Component({
  selector: 'app-navigation-bar',
  standalone: true,
  imports: [Breadcrumb, CommonModule],
  templateUrl: './navigation-bar.component.html',
  styleUrls: ['./navigation-bar.component.scss']
})
export class NavigationBarComponent implements OnInit {
  items: MenuItem[] | undefined;
  home: MenuItem | undefined;
  isDropdownOpen = false;
  isMobile = false;

  ngOnInit() {
      this.items = [
          { icon: 'pi pi-home', label: 'Home', routerLink: '/' },
          {icon: 'pi pi-clipboard', label: 'Formular', routerLink: '/userform'},
          { icon: 'pi pi-shop', label: 'Shop', routerLink: '/shop' },
          { icon: 'pi pi-shopping-cart', label: 'Bestellungen', routerLink: '/bestellungen' },
          { icon: 'pi pi-briefcase', label: 'Karriere', routerLink: '/karriere' },
          { icon: 'pi pi-compass', label: 'Kontakt', routerLink: '/kontakt' }
      ];
      this.checkScreenSize();
  }

  @HostListener('window:resize', [])
  checkScreenSize() {
      this.isMobile = window.innerWidth <= 1024;
  }
}
