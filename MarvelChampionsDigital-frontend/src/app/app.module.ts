import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MazoComponent } from './components/mazo/mazo.component';
import { ManoComponent } from './components/mano/mano.component';
import { HttpClientModule } from '@angular/common/http';
import { InicioComponent } from './components/inicio/inicio.component';
import { NuevaPartidaComponent } from './components/nueva-partida/nueva-partida.component';
import { PartidaComponent } from './components/partida/partida.component';

@NgModule({
  declarations: [
    AppComponent,
    MazoComponent,
    ManoComponent,
    InicioComponent,
    NuevaPartidaComponent,
    PartidaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
