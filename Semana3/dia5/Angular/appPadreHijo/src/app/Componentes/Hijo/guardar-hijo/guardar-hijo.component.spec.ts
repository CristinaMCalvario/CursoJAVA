import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuardarHijoComponent } from './guardar-hijo.component';

describe('GuardarHijoComponent', () => {
  let component: GuardarHijoComponent;
  let fixture: ComponentFixture<GuardarHijoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GuardarHijoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GuardarHijoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
