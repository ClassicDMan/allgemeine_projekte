import { ApplicationConfig, ErrorHandler, importProvidersFrom, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';
import {MatSnackBar} from '@angular/material/snack-bar';
import { provideAnimations } from '@angular/platform-browser/animations';

import { routes } from './app.routes';
import { GlobalErrorHandler } from './errors/global-error-handler';
import { HTTP_INTERCEPTORS, provideHttpClient } from '@angular/common/http';
import { HttpErrorInterceptor } from './interceptors/http-error.interceptor';

export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes), 
    { provide: ErrorHandler, useClass: GlobalErrorHandler }, 
    { provide: HTTP_INTERCEPTORS, useClass: HttpErrorInterceptor, multi: true }, 
    provideHttpClient(),
    provideZoneChangeDetection({ eventCoalescing: true }),
    provideRouter(routes),
    provideAnimations(),
    importProvidersFrom(MatSnackBar)
  ]
};
