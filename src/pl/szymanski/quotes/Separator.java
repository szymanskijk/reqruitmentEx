package pl.szymanski.quotes;

public class Separator {
    public static String separate(String s){
        String[] separatedStrings = s.split("[*\"]");
        return separatedStrings[3];
    }
}
