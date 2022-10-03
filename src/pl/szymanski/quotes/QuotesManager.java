package pl.szymanski.quotes;

import java.util.HashSet;

public class QuotesManager {

    static HashSet<String> setOfQuotes = new HashSet<>();

    public static String checkIfNew(String s){
        if(setOfQuotes.contains(s)){
            return "Repeated quote: ";
        }else{
            setOfQuotes.add(s);
        }
        return "New quote: ";
    }
}
