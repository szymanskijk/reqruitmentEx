package pl.szymanski.test;

import pl.szymanski.numbers.Searcher;

public class Test {
    static int[] tab1 = {23,21,20,19,17,15,12,11,9,7,5,3,2,1};
    static int[] tab2 = {};
    static int[] tab3 = {-7,-11,-12,-20};

    public static void main(String[] args) {
        System.out.println(Searcher.search(tab1, 6));
        System.out.println(Searcher.search(tab1, 23));
        System.out.println(Searcher.search(tab1, 2));
        System.out.println(Searcher.search(tab2, 6));
        System.out.println(Searcher.search(tab2, 0));
        System.out.println(Searcher.search(tab3, 6));
        System.out.println(Searcher.search(tab3, -7));
        System.out.println(Searcher.search(tab3, 996));
        System.out.println(Searcher.search(tab3, 0));
        System.out.println(Searcher.search(tab1, -6));
    }
}
