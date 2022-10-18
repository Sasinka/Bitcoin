package TradingInfo;


import Currency.Currency;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BTCValue {
    static String BTCexchangeRate;

    public static boolean connect() throws IOException {
        // URL url = new URL("https://blockchain.info/tobtc?currency=EUR&value=500");//vrátí jednu hodnotu
        URL url = new URL("https://blockchain.info/ticker");//vrátí json

        HttpURLConnection con = (HttpURLConnection) url.openConnection(); //open connection
        con.setRequestMethod("GET");    //set the method
        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36"); //property find in devTols in chrome
        int responseCode = con.getResponseCode(); //response code
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream())); //get response
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine + "\n"); //safe response in var
            }
            BTCexchangeRate = response.toString();
            in.close();

            // print result
            // System.out.println(BTCexchangeRate);
        } else {
            System.out.println("GET request not worked");
        }

        con.disconnect();
        return true;
    }

    public Currency getBTCValue() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        String BTCexchangeRate = this.BTCexchangeRate;
        System.out.println(BTCexchangeRate); // vypíše celý json


        //Jako json node
        JsonNode jsonNode = mapper.readTree(BTCexchangeRate);
        String sell = jsonNode.get("USD").toString();
        System.out.println("sell" + sell);
        JsonNode getDeeperjsonNode = mapper.readTree(sell);

        Currency eur = new Currency(getDeeperjsonNode.get("symbol").toString(), getDeeperjsonNode.get("buy").asInt(), getDeeperjsonNode.get("sell").asInt(), getDeeperjsonNode.get("15m").asInt(), getDeeperjsonNode.get("last").asInt());

        System.out.println("sell: " + eur.getSell());


        return eur;

    }


}
