import { Injectable } from '@angular/core';
import {
  HttpInterceptor,
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpErrorResponse,
  HttpClient,
} from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable()
export class HttpErrorInterceptor implements HttpInterceptor {
  constructor(private snackBar: MatSnackBar, private http: HttpClient) {}

  intercept(
    request: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    return next.handle(request).pipe(
      catchError((error: HttpErrorResponse) => {
        let errorMessage = 'Ein unbekannter Fehler ist aufgetreten';

        switch (error.status) {
          case 400:
            errorMessage = 'Fehlerhafte Anfrage (400)';
            break;
          case 401:
            errorMessage = 'Nicht autorisiert (401)';
            break;
          case 403:
            errorMessage = 'Zugriff verweigert (403)';
            break;
          case 404:
            errorMessage = 'Nicht gefunden (404)';
            break;
          case 500:
            errorMessage = 'Interner Serverfehler (500)';
            break;
        }

        this.snackBar.open(errorMessage, 'Schließen', {
          duration: 4000,
          horizontalPosition: 'right',
          verticalPosition: 'top',
          panelClass: ['snackbar-error'],
        });

        // ✅ Nur echte Fehler loggen, keine Netzwerkfehler oder Offline-Fehler
        if (error.status >= 400 && error.status < 600 && navigator.onLine) {
          this.http
            .post('/api/logs/errors', {
              status: error.status,
              message: errorMessage,
              url: request.url,
            })
            .subscribe({
              next: () => console.log('Fehler wurde ans Backend gesendet'),
              error: (err) => console.error('Fehler beim Senden des Logs', err),
            });
        }

        

        // console.log('Interceptor hat einen Fehler erkannt:', error);

        // this.rawHttp.post('/api/logs', {
        //   status: statusCode,
        //   message: errorMessage,
        //   url: request.url
        // }).subscribe({
        //   next: () => console.log('Fehler wurde ans Backend gesendet'),
        //   error: err => console.error('Fehler beim Senden des Logs', err)
        // });

        return throwError(() => error);
      })
    );
  }
}
