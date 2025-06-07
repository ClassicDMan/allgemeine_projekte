import { RouterModule, Routes } from '@angular/router';
import { IntroComponent } from './components/intro/intro.component';
import { ArtikelmenuComponent } from './components/artikelmenu/artikelmenu.component';
import { ContactComponent } from './components/contact/contact.component';
import { ArtikelBuilderComponent } from './components/artikelmenu/artikelmenuComponent/artikel-builder/artikel-builder.component';
import { NgModule } from '@angular/core';

export const routes: Routes = [

    {
        path: '', 
        component: IntroComponent
    },
    {
        path: 'artikelmenu', 
        component: ArtikelmenuComponent
    },
    {
        path: 'contact',
        component: ContactComponent
    },
    {
        path: 'artikel',
        component: ArtikelBuilderComponent
    },
    {
         path: '', 
         redirectTo: '/artikelmenu', 
         pathMatch: 'full' 
    },

    // Notiz: vergiss nicht zu löschen
    {
        path:'artikelmenu/artikel-builder',
        component: ArtikelBuilderComponent
    }

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })

  export class AppRoutingModule { }



      /*
    {
        path: '', 
        component: IntroComponent
    },
    {
        path: 'artikelmenu', 
        component: ArtikelmenuComponent
    },
    {
        path: 'contact',
        component: ContactComponent
    }
        */

    /*
        {
        path: '',
        pathMatch: 'full',
        loadComponent: () =>{
            return import('./components/intro/intro.component').then(
                m => m.IntroComponent
            )
        }
    },
    {
        path: 'artikelmenu',
        loadComponent: () =>{
            return import('./components/artikelmenu/artikelmenu.component').then(
                m => m.ArtikelmenuComponent
            )
        }
    }
        */
