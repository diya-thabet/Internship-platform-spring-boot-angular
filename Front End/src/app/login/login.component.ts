import { Component } from '@angular/core';
import { Router } from '@angular/router'; // <-- assure-toi que c'est importé

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  constructor(private router: Router) {} // <-- injection ici

  login() {
    this.router.navigate(['/wait']); // ou n'importe quelle route
  }
}
