import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-partida',
  templateUrl: './partida.component.html',
  styleUrls: ['./partida.component.css']
})
export class PartidaComponent implements OnInit {

  // Heroe y Villano seleccionado
  heroeSeleccionado: string = "spider_man";
  villanoSeleccionado: string = "rhino";
  conjuntosEncuentrosSeleccionados: string[] = ["standard", "bomb_scare"];
  mazoVillanoType_codes = ["attachment", "minion", "treachery", "side_scheme", "enviroment"];
  
  // Cartas Villano y plan principal
  cartasVillano: any = [];
  cartasPlanPrincipal: any = [];
  // Mazo de encuentros
  mazoConjuntoEncuentros: any[] = [];

  // Areas de juego
  areaEncuentros: any[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
