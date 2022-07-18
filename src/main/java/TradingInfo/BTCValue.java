package TradingInfo;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.net.URLConnection;

public class BTCValue {
    static JSObject BTCexchangeRate = new JSObject() {
        @Override
        public Object call(String methodName, Object... args) throws JSException {
            return null;
        }

        @Override
        public Object eval(String s) throws JSException {
            return null;
        }

        @Override
        public Object getMember(String name) throws JSException {
            return null;
        }

        @Override
        public void setMember(String name, Object value) throws JSException {

        }

        @Override
        public void removeMember(String name) throws JSException {

        }

        @Override
        public Object getSlot(int index) throws JSException {
            return null;
        }

        @Override
        public void setSlot(int index, Object value) throws JSException {

        }
    };

    public static boolean connect() throws IOException {
       // URL url = new URL("https://blockchain.info/tobtc?currency=EUR&value=500");//vrátí jednu hodnotu
        URL url = new URL("https://blockchain.info/ticker");//vrátí json

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            BTCexchangeRate = response;
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }

        con.disconnect();
        return true;
    }


    public BTCValue() throws IOException {

    }
}
//popsat co se kde děje
