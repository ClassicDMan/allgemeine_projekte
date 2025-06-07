import { Component } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
  imports:[RouterLink, FormsModule],
  standalone: true
})
export class LoginComponent {
  email = '';
  password = '';
  rolle = '';

  constructor(private router: Router) {}

  onSubmit() {
    console.log('Login mit:', this.email, this.password, this.rolle);
    this.router.navigate(['/']);
  }
}
