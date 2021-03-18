import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CurrencyConversion } from './CurrencyConversion';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppService {
  constructor(private _http: HttpClient) {}

  convertCurrency(from, to, quantity): Observable<CurrencyConversion> {
    const url = `/api/v1/currency-conversion/from/${from}/to/${to}/quantity/${quantity}`;
    return this._http.get<CurrencyConversion>(url);
  }
}
