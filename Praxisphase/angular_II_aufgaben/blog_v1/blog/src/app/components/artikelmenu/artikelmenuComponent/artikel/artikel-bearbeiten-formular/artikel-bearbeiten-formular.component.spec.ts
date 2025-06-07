import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArtikelBearbeitenFormularComponent } from './artikel-bearbeiten-formular.component';

describe('ArtikelBearbeitenFormularComponent', () => {
  let component: ArtikelBearbeitenFormularComponent;
  let fixture: ComponentFixture<ArtikelBearbeitenFormularComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ArtikelBearbeitenFormularComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ArtikelBearbeitenFormularComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
