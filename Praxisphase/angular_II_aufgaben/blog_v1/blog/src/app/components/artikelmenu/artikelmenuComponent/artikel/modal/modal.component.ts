import { CommonModule } from '@angular/common';
import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-modal',
  imports: [FormsModule, CommonModule],
  templateUrl: './modal.component.html',
  styleUrl: './modal.component.scss'
})
export class ModalComponent {

  @Input() isVisible: boolean = false;
  @Input() message: string = 'Sind Sie sicher, dass Sie fortfahren möchten?';
  @Output() onConfirm: EventEmitter<void> = new EventEmitter();
  @Output() onCancel: EventEmitter<void> = new EventEmitter();

  closeModal(): void {
    this.onCancel.emit();
  }

  confirmDelete(): void {
    this.onConfirm.emit();
  }

  
}


