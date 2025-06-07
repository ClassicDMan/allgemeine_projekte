import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ButtonModule } from 'primeng/button';
import { CalendarModule } from 'primeng/calendar';
import { DropdownModule } from 'primeng/dropdown';
import { InputTextModule } from 'primeng/inputtext';
import {
  trigger,
  state,
  style,
  transition,
  animate,
} from '@angular/animations';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-userform',
  imports: [
    ReactiveFormsModule,
    InputTextModule,
    DropdownModule,
    CalendarModule,
    ButtonModule,
    CommonModule
        ],
  standalone: true,

  templateUrl: './userform.component.html',
  styleUrl: './userform.component.scss',
   animations: [
    trigger('fadeIn', [
      transition(':enter', [
        style({ opacity: 0 }),
        animate('500ms ease-in', style({ opacity: 1 })),
      ])
    ])
  ]
})
export class UserformComponent implements OnInit{
  userForm!: FormGroup;
  roles = [
    { label: 'Admin', value: 'admin' },
    { label: 'User', value: 'user' },
    { label: 'Gast', value: 'guest' },
  ];

  constructor(private fb: FormBuilder) {}

  ngOnInit() {
    this.userForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      birthDate: [null, Validators.required],
      role: [null, Validators.required],
    });
  }

  get name() { return this.userForm.get('name'); }
  get email() { return this.userForm.get('email'); }
  get birthDate() { return this.userForm.get('birthDate'); }
  get role() { return this.userForm.get('role'); }

  onSubmit() {
    if (this.userForm.valid) {
      console.log('Formular abgeschickt:', this.userForm.value);
    } else {
      this.userForm.markAllAsTouched();
    }
  }

}
