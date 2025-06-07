import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-artikel-builder',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './artikel-builder.component.html',
  styleUrl: './artikel-builder.component.scss'
})
export class ArtikelBuilderComponent {
  title: string = '';
  content: string = '';

  titleValid: boolean = true;
  contentValid: boolean = true;

  @Output() newArticle = new EventEmitter<any>();

  constructor(private router: Router) {}

  validateForm() {
    this.titleValid = this.title.trim().length > 0;
    this.contentValid = this.content.trim().length >= 10;
    return this.titleValid && this.contentValid;
  }

  onSubmit() {
    if (this.validateForm()) {
      this.router.navigate(['/artikelmenu'], { 
        queryParams: { 
          titel: this.title, 
          artikelText: this.content 
        } 
      });
    }
  }
}
