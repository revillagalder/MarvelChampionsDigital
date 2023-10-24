import { Component, OnInit } from '@angular/core';
import { MazoService } from 'src/app/services/mazo.service';

@Component({
  selector: 'app-mazo',
  templateUrl: './mazo.component.html',
  styleUrls: ['./mazo.component.css']
})
export class MazoComponent implements OnInit {

  // Heroe y Villano seleccionado
  heroeSeleccionado: string = "spider_man";
  villanoSeleccionado: string = "rhino";
  conjuntosEncuentrosSeleccionados: string[] = ["standard", "bomb_scare"];
  mazoVillanoType_codes = ["attachment", "minion", "treachery", "side_scheme", "enviroment"];
  // Cartas Villano y plan principal
  cartasVillano: any = [];
  cartasPlanPrincipal: any = [];
  // Mazo de encuentros
  mazoConjuntoEncuentros: any = [];

  constructor(private mazoService: MazoService) { }

  ngOnInit(): void {
    // Cartas Héroe
    // TODO

    // Cartas Villano
    this.mazoService.getCartasPorCardSetCodesYTypeCodes(this.villanoSeleccionado, ["villain"]).subscribe((datos) => {
      this.cartasVillano = this.getCartasConCantidad(datos);
    })
    // Cartas Plan Principal
    this.mazoService.getCartasPorCardSetCodesYTypeCodes(this.villanoSeleccionado, ["main_scheme"]).subscribe((datos) => {
      this.cartasPlanPrincipal = this.getCartasConCantidad(datos);
    })

    // Mazo conjuntos de encuentros
    this.mazoService.getCartasPorCardSetCodesYTypeCodes(this.conjuntosEncuentrosSeleccionados.concat([this.heroeSeleccionado, this.villanoSeleccionado]), this.mazoVillanoType_codes).subscribe((datos) => {
      this.mazoConjuntoEncuentros = this.getCartasConCantidad(datos);
      console.log(this.mazoConjuntoEncuentros);
    })
  }

  private getCartasConCantidad(cartas: any[]): any[] {
    return cartas.reduce((result, carta) => {
      if (carta.quantity && carta.quantity > 1) {
        for (let i = 0; i < carta.quantity; i++) {
          result.push(carta);
        }
      } else {
        result.push(carta);
      }
      return result;
    }, []);
  }

}
