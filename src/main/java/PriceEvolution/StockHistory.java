package PriceEvolution;


import Currency.Currency;

import java.util.LinkedList;

public class StockHistory {
    LinkedList<Currency> priceEvaluation;


    public StockHistory(Currency currency) {
        this.priceEvaluation = new LinkedList<>();
        this.priceEvaluation.addLast(currency);
    }

    public StockHistory() {
        LinkedList<Currency> priceEvaluation = new LinkedList<>();
    }

    public void addCurrency(Currency currency){
        this.priceEvaluation.add(currency);

    }


    public LinkedList<Currency> getPriceEvaluation() {//todo
        if(this.priceEvaluation.size()==0){
            this.priceEvaluation = new LinkedList<>();
        }
        return this.priceEvaluation;
    }


    public void setPriceEvaluation(LinkedList<Currency> priceEvolution) {
        this.priceEvaluation = priceEvolution;
    }
}
