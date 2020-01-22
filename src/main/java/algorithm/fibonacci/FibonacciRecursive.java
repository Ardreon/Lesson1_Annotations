package algorithm.fibonacci;

public class FibonacciRecursive {
    public static int recursiveFibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
    }

    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(9));
    }

}
