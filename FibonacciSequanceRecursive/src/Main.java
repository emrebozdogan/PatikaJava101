public class Main {
    static int Fibonacci(int n){
        // 0 1 1 2 3 5 8 13 21 34
        if(n == 1 || n ==2){
            return 1;
        }else{
            return Fibonacci(n -1) + Fibonacci(n -2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(9));

    }
}