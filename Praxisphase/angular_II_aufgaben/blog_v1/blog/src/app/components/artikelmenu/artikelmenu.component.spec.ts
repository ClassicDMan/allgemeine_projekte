import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArtikelmenuComponent } from './artikelmenu.component';

describe('ArtikelmenuComponent', () => {
  let component: ArtikelmenuComponent;
  let fixture: ComponentFixture<ArtikelmenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ArtikelmenuComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ArtikelmenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
