import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarPadreComponent } from './editar-padre.component';

describe('EditarPadreComponent', () => {
  let component: EditarPadreComponent;
  let fixture: ComponentFixture<EditarPadreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EditarPadreComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarPadreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
