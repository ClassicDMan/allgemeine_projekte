import { ErrorHandler, Injectable, NgZone } from '@angular/core';

@Injectable()
export class GlobalErrorHandler implements ErrorHandler {
  constructor(private zone: NgZone) {}

  handleError(error: any): void {
    this.zone.run(() => {
      console.error('Globaler Fehler:', error);
      alert('Ein unerwarteter Fehler ist aufgetreten.');
    });
  }

  handError(error: unknown){
    
  }
}
