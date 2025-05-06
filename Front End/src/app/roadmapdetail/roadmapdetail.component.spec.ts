import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoadmapdetailComponent } from './roadmapdetail.component';

describe('RoadmapdetailComponent', () => {
  let component: RoadmapdetailComponent;
  let fixture: ComponentFixture<RoadmapdetailComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RoadmapdetailComponent]
    });
    fixture = TestBed.createComponent(RoadmapdetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
