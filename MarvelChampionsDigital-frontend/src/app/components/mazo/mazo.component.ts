import { Component, OnInit } from '@angular/core';
import { MazoService } from 'src/app/services/mazo.service';
import { animate, style, AnimationBuilder } from '@angular/animations';

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
  mazoConjuntoEncuentros: any[] = [];

  // Areas de juego
  areaEncuentros: any[] = [];

  constructor(private mazoService: MazoService, private animationBuilder: AnimationBuilder) { }

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
      //console.log(this.mazoConjuntoEncuentros);
    })
  }

  public barajarMazoConjuntoEncuentros(): void {
    this.mazoConjuntoEncuentros.sort(() => Math.random() - 0.5);
    const imagen = document.querySelector(".mazoConjuntoEncuentros");
    const animation = this.animationBuilder.build([
      style({ transform: 'rotate(0deg)' }),
      animate('0.5s ease-in-out', style({ transform: 'rotate(1800deg)' })),
    ]);
    const player = animation.create(imagen);
    player.play();

  }

  public robarCartaConjuntoEncuentros(numerCartas: number): void {
    // Quita la primera carta del mazo conjunto de encuentros.
    const cartaRobada = this.mazoConjuntoEncuentros.splice(0, numerCartas)[0];
    // Agrega la carta robada al area de encuentros.
    this.areaEncuentros.push(cartaRobada);

  }

  public mezclarDescarteMazoConjuntoEncuentros(): void {
    this.mazoConjuntoEncuentros = this.mazoConjuntoEncuentros.concat(this.areaEncuentros);
    this.areaEncuentros = [];
  }

  public verMazoEncuentros() {
    console.log("TODO");
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
