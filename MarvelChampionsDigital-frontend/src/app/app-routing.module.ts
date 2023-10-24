import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioComponent } from './components/inicio/inicio.component';
import { NuevaPartidaComponent } from './components/nueva-partida/nueva-partida.component';
import { PartidaComponent } from './components/partida/partida.component';

const routes: Routes = [
  { path: '', component: InicioComponent},
  { path: 'nueva-partida', component:NuevaPartidaComponent},
  { path: 'partida', component:PartidaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
