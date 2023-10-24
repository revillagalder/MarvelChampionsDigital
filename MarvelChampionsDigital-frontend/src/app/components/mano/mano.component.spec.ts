import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManoComponent } from './mano.component';

describe('ManoComponent', () => {
  let component: ManoComponent;
  let fixture: ComponentFixture<ManoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ManoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ManoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
