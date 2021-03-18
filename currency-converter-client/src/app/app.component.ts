import { Component } from '@angular/core';
import { AppService } from './app.service';
import { CurrencyConversion } from './CurrencyConversion';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private appService: AppService) {}

  currencyConversion: CurrencyConversion;
  title = 'currency-converter-client';
  from: string;
  to: string;
  quantity: number;

  convertCurrency() {
    console.log(this.from + ' - ' + this.to + ' - ' + this.quantity);
    this.appService
      .convertCurrency(this.from, this.to, this.quantity)
      .subscribe(
        data => {
          this.currencyConversion = data;
        },
        error => {
          console.log(error);
        }
      );
  }
}
