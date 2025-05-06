import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlocdashComponent } from './blocdash.component';

describe('BlocdashComponent', () => {
  let component: BlocdashComponent;
  let fixture: ComponentFixture<BlocdashComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BlocdashComponent]
    });
    fixture = TestBed.createComponent(BlocdashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
