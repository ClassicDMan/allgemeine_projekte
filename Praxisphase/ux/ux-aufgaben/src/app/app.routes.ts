import { RouterModule, Routes } from '@angular/router';
import { MainComponent } from './components/main/main.component';
import { ShopComponent } from './components/main/main-components/shop/shop.component';
import { BestellungenComponent } from './components/main/main-components/bestellungen/bestellungen.component';
import { KarriereComponent } from './components/main/main-components/karriere/karriere.component';
import { KontaktComponent } from './components/main/main-components/kontakt/kontakt.component';
import { NgModule } from '@angular/core';
import { UserformComponent } from './components/main/main-components/userform/userform.component';

export const routes: Routes = [
    {
        path: '',
        component: MainComponent
    },
    {
        path:'shop',
        component: ShopComponent
    },
    {
        path: 'userform',
        component: UserformComponent
    },
    {
        path: 'bestellungen',
        component: BestellungenComponent
    },
    {
        path: 'karriere',
        component: KarriereComponent
    },
    {
        path: 'kontakt',
        component: KontaktComponent
    }


];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })

  export class AppRoutingModule { }