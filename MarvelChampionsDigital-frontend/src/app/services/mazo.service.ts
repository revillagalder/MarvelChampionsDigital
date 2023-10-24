import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Carta } from '../classes/carta';

@Injectable({
  providedIn: 'root'
})
export class MazoService {

  private URL_obtenerCartasPorCardSetCodesYTypeCodes = 'http://localhost:8080/cartas/obtenerCartasPorCardSetCodesYTypeCodes';
  private URL_obtenerCartasPorCardSetTypeNameCode = "http://localhost:8080/cartas/obtenerCartasPorCardSetTypeNameCode";
  private URL_obtenerCartasPorTypeCode = "http://localhost:8080/cartas/obtenerCartasPorTypeCode";

  constructor(private httpClient: HttpClient) { }



  getCartasPorCardSetCodesYTypeCodes(card_set_code: String | string[], type_code: String | string[]): Observable<Carta[]> {
    if(Array.isArray(type_code)) {
      type_code = type_code.join(',');
    }
    if(Array.isArray(card_set_code)) {
      card_set_code = card_set_code.join(',');
    }
    return this.httpClient.get<Carta[]>(`${this.URL_obtenerCartasPorCardSetCodesYTypeCodes}/${card_set_code}/${type_code}`);
  }

    getCartasPorCardSetTypeNameCode(card_set_type_name_code: String): Observable<Carta[]> {
      return this.httpClient.get<Carta[]>(`${this.URL_obtenerCartasPorCardSetTypeNameCode}/${card_set_type_name_code}`);
    }

    getCartasPorTypeCode(type_code: String): Observable<Carta[]> {
      return this.httpClient.get<Carta[]>(`${this.URL_obtenerCartasPorTypeCode}/${type_code}`);
    }
}