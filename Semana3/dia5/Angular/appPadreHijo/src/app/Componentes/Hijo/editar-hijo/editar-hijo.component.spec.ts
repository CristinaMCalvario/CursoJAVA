import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarHijoComponent } from './editar-hijo.component';

describe('EditarHijoComponent', () => {
  let component: EditarHijoComponent;
  let fixture: ComponentFixture<EditarHijoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EditarHijoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarHijoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
