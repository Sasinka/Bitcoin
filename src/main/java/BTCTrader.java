import PriceEvolution.StockHistory;
import TradingInfo.BTCValue;
import TradingInfo.PossitionStatus;

import java.io.IOException;

public class BTCTrader {
    public static void main(String[] arg) throws IOException {
        System.out.println("Hello BTC");
        BTCValue trade = new BTCValue();
        trade.connect();
        StockHistory historyOfBTC = new StockHistory(trade.getBTCValue());

        System.out.println("Price:" + historyOfBTC.getPriceEvaluation().getFirst().getSell());
        for (int i = 0; i < 3; i++) {
            historyOfBTC.addCurrency(trade.getBTCValue());
        }

        PossitionStatus isTradeble = new PossitionStatus(historyOfBTC);
        System.out.println("Answer:" + isTradeble.tradeStatusToString());

    }

}


