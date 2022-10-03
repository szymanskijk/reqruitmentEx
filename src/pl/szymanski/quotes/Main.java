package pl.szymanski.quotes;

import pl.szymanski.quotes.InfoFinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        System.out.println("Użyj komendy 'next', aby otrzymać cytat lub 'quit', aby zakończyć działanie programu.");
        while (line.equalsIgnoreCase("quit") == false) {
            line = in.readLine();

            if (line.equalsIgnoreCase("next") == true){
                System.out.println(InfoFinder.getQuote());
            }else if(line.equalsIgnoreCase("quit") == false){
                System.out.println("Użyj komendy 'next', aby otrzymać cytat lub 'quit', aby zakończyć działanie programu.");
            }
        }
        in.close();
    }

}
