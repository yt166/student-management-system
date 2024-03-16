import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StuRegistationComponent } from './stu-registation.component';

describe('StuRegistationComponent', () => {
  let component: StuRegistationComponent;
  let fixture: ComponentFixture<StuRegistationComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [StuRegistationComponent]
    });
    fixture = TestBed.createComponent(StuRegistationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
