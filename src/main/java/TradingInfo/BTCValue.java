package TradingInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BTCValue {


    URL url = new URL("https://blockchain.info/ticker");//vrátí json

   // URLConnection con = url.openConnection();
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");

    public BTCValue() throws IOException {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line = null;

            // read each line and write to System.out
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
