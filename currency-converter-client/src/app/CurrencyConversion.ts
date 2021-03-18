export interface CurrencyConversion {
  id: number;
  from: string;
  to: string;
  conversionRate: number;
  quantity: number;
  finalAmount: number;
}
