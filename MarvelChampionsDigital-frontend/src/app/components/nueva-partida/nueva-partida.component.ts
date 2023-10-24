import { Component, OnInit } from '@angular/core';
import { MazoService } from 'src/app/services/mazo.service';

@Component({
  selector: 'app-nueva-partida',
  templateUrl: './nueva-partida.component.html',
  styleUrls: ['./nueva-partida.component.css']
})
export class NuevaPartidaComponent implements OnInit {

  heroes: any[] = [];
  villanos: any[] = [];
  encuentros_modulares: any[] = [];

  constructor(private mazoService: MazoService) { }

  ngOnInit(): void {
    // Carga select Héroes
    this.mazoService.getCartasPorTypeCode("hero").subscribe((datos) => {
      this.heroes = datos;
    })
    // Carga select Villanos
    this.mazoService.getCartasPorTypeCode("villain").subscribe((datos) => {
      this.villanos = datos;
    })
    // Carga select Conjuntos de encuentros
    this.mazoService.getCartasPorCardSetTypeNameCode("modular").subscribe((datos) => {
      this.encuentros_modulares = datos;
    })
  }


}
