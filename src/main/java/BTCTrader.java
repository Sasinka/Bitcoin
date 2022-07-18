import TradingInfo.BTCValue;

import java.io.IOException;

public class BTCTrader {
        public static void main (String[] arg) throws IOException {
            System.out.println("Hello BTC");
            BTCValue trade = new BTCValue();
            trade.connect();
        }

}
