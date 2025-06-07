import { RouterModule, Routes } from '@angular/router';
import { IntroComponent } from './components/intro/intro.component';
import { ArtikelmenuComponent } from './components/artikelmenu/artikelmenu.component';
import { ContactComponent } from './components/contact/contact.component';
import { ArtikelDetailsComponent } from './components/artikelmenu/artikelmenuComponent/artikel-details/artikel-details.component';
import { ArtikelBuilderComponent } from './components/artikelmenu/artikelmenuComponent/artikel-builder/artikel-builder.component';
import { LoginComponent } from './components/login/login.component';
import { NgModule } from '@angular/core';

export const routes: Routes = [
  {
    path: '',
    component: IntroComponent,
  },
  {
    path: 'artikelmenu',
    component: ArtikelmenuComponent,
  },
  {
    path: 'contact',
    component: ContactComponent,
  },
  {
    path: 'artikel',
    component: ArtikelBuilderComponent,
  },
  {
    path: 'artikelmenu/artikel/:id',
    component: ArtikelDetailsComponent,
  },
  {
    path: 'login',
    component: LoginComponent,
  },
//   {
//     path: '',
//     redirectTo: '/artikelmenu',
//     pathMatch: 'full',
//   },
  {
    path: 'artikelmenu/artikel-builder',
    component: ArtikelBuilderComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
