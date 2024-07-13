package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ValidURL {

    boolean flag;

    @Test
    public void validatingURL() throws IOException {

        URL url = new URL("https://www.bestbuy.com/");

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.setConnectTimeout(5000);

        httpURLConnection.connect();

        if (httpURLConnection.getResponseCode() == 200){
            flag = true;
        }
        else {
            flag = false;
        }
        Assert.assertTrue(flag);
    }
}
