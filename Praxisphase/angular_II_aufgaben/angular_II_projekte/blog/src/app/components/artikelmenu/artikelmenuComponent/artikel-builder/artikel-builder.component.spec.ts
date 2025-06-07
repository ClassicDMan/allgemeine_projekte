import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArtikelBuilderComponent } from './artikel-builder.component';

describe('ArtikelBuilderComponent', () => {
  let component: ArtikelBuilderComponent;
  let fixture: ComponentFixture<ArtikelBuilderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ArtikelBuilderComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ArtikelBuilderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
