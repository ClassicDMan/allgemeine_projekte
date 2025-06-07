import { Component, HostListener, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { Breadcrumb } from 'primeng/breadcrumb';
import { ToolbarModule } from 'primeng/toolbar';
import { ButtonModule } from 'primeng/button';
import { SplitButton } from 'primeng/splitbutton';
import { InputTextModule } from 'primeng/inputtext';
import { IconField } from 'primeng/iconfield';
import { InputIcon } from 'primeng/inputicon';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [Breadcrumb, ToolbarModule, ButtonModule, SplitButton, InputTextModule, IconField, InputIcon],
  templateUrl: './header.component.html',
  styleUrl: './header.component.scss',
})
export class HeaderComponent implements OnInit {
  items: MenuItem[] | undefined;
  barItems: MenuItem[] | undefined;
  home: MenuItem | undefined;
  isDropdownOpen = false;
  isMobile = false;

  ngOnInit() {
    this.items = [
      { icon: 'pi pi-home', label: 'Home', routerLink: '/' },
      { icon: 'pi pi-clipboard', label: 'Formular', routerLink: '/userform' },
      { icon: 'pi pi-shop', label: 'Shop', routerLink: '/shop' },
      {
        icon: 'pi pi-shopping-cart',
        label: 'Bestellungen',
        routerLink: '/bestellungen',
      },
      { icon: 'pi pi-briefcase', label: 'Karriere', routerLink: '/karriere' },
      { icon: 'pi pi-compass', label: 'Kontakt', routerLink: '/kontakt' },

    ];
    this.barItems = [
      { label: 'Update', icon: 'pi pi-refresh' },
      { label: 'Delete', icon: 'pi pi-times' },
    ];
    this.checkScreenSize();
  }

  @HostListener('window:resize', [])
  checkScreenSize() {
    this.isMobile = window.innerWidth <= 1024;
  }
}
