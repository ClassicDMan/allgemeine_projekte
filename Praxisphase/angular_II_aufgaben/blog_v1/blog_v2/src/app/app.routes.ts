import { RouterModule, Routes } from '@angular/router';
import { IntroComponent } from './components/intro/intro.component';
import { NgModule } from '@angular/core';

export const routes: Routes = [
    {
        path: '',
        component: IntroComponent,
    }

];
@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],
  })
  export class AppRoutingModule {}
