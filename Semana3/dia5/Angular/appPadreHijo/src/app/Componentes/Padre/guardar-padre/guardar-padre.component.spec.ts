import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuardarPadreComponent } from './guardar-padre.component';

describe('GuardarPadreComponent', () => {
  let component: GuardarPadreComponent;
  let fixture: ComponentFixture<GuardarPadreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GuardarPadreComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GuardarPadreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
