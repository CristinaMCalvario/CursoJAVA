import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarPadreComponent } from './listar-padre.component';

describe('ListarPadreComponent', () => {
  let component: ListarPadreComponent;
  let fixture: ComponentFixture<ListarPadreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListarPadreComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListarPadreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
