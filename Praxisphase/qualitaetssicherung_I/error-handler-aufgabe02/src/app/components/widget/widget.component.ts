import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-widget',
  templateUrl: './widget.component.html',
  styleUrl: './widget.component.css',
  standalone: true,
  imports: []
})
export class WidgetComponent {
  tasks: string[] = [];

  constructor(private http: HttpClient) {}

  addTask() {
    const taskName = prompt('Gib einen neuen Task ein:');
    if (taskName && taskName.trim()) {
      this.tasks.push(taskName.trim());
    }
  }

  triggerError(statusCode: number) {
  const testUrl = `http://localhost:8080/api/logs/simulate/${statusCode}`;
    this.http.get(testUrl).subscribe({
      next: () => console.log(`Anfrage ${statusCode} OK`),
      error: (err) => console.error(`Fehler bei Status ${statusCode}`, err)
    });
  }
}
