import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarHijoComponent } from './listar-hijo.component';

describe('ListarHijoComponent', () => {
  let component: ListarHijoComponent;
  let fixture: ComponentFixture<ListarHijoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListarHijoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListarHijoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
