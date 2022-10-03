package pl.szymanski.numbers;

public class Searcher {
    public static boolean search(int[] numbers, int x){
        int start = 0;
        int end = numbers.length - 1;
        int mid = 0;

        while (start <= end){
            mid = (start+end) / 2;
            if(numbers[mid] == x){
                return true;
            }else if(numbers[mid] > x){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
