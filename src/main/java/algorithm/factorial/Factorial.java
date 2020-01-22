package algorithm.factorial;

public class Factorial {
    static int calculateFactorial(int number){
        int result = 1;
        for (int index = 1; index <=number; index ++){
            result = result * index;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(calculateFactorial(7));
    }
}

