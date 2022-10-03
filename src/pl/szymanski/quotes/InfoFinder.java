package pl.szymanski.quotes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class InfoFinder {
    public static String getQuote() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://api.kanye.rest/"))
                .build();

        HttpResponse<String> response = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        String jsonResponse = response.body();
        String temp = Separator.separate(jsonResponse);

        return QuotesManager.checkIfNew(temp) + temp;
    }
}
