import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MazoComponent } from './mazo.component';

describe('MazoComponent', () => {
  let component: MazoComponent;
  let fixture: ComponentFixture<MazoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MazoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MazoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
