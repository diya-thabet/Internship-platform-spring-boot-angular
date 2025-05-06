import { Component } from '@angular/core';
import { Router } from '@angular/router'; // <-- assure-toi que c'est importé

@Component({
  selector: 'app-roadmapdetail',
  templateUrl: './roadmapdetail.component.html',
  styleUrls: ['./roadmapdetail.component.css']
})
export class RoadmapdetailComponent {
  constructor(private router: Router) {} // <-- injection ici

    
  backRoadmap(): void {
    this.router.navigateByUrl('/', { skipLocationChange: true }).then(() => {
      this.router.navigate(['/bloc']);
    });
  }


  downloadFile() {
    const link = document.createElement('a');
    link.href = 'assets/pdfs/Frontend Developer Roadmap_ What is Frontend Development_.pdf';
    link.download = 'Frontend Developer Roadmap_ What is Frontend Development_.pdf';
    link.click();
  }


  openLink() {
    window.open('https://www.youtube.com/watch?v=Tef1e9FiSR0', '_blank');
  }
  
  
  
}
