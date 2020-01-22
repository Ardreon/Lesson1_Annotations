package algorithm.fibonacci;


public class Fibonacci {

    private static int[] fibonacciNumbers(int number) {
        int[] sortingMassive = {};
        int sum = 0;
    for(int index = 1; index < number; index++) {
       sortingMassive[index-1] = sum + index;
        sum = sum + index;
    }
    return sortingMassive;
}

    public static void main(String[] args) {
        System.out.println(fibonacciNumbers(6).toString());
    }
}
