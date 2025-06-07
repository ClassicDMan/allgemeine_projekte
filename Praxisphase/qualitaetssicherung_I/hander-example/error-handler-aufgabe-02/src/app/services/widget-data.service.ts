import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TaskModel } from '../interfaces/task-model'; 

@Injectable({
  providedIn: 'root'
})
export class WidgetDataService {
  constructor(private http: HttpClient) { }

  load() {
    return this.http.get<TaskModel[]>(`https://jsonplaceholder.typicode.com/todos?_start=0&_limit=3`)
  }

  addTaskSync(task: TaskModel): TaskModel | never {
    if (task.id === 0) {
      throw Error(`Value zero (0) is not allowed as a task id`);
    }
    return task;
  }
}
