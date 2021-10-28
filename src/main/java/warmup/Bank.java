package warmup;

public class Bank {

    public static boolean div5(int n) {
        return n % 5 == 0;
    }

    public static boolean div7(int n) {
        return n % 7 == 0;
    }

    public static boolean div5a7(int n) {
        return (n % 5 == 0) && (n % 7 == 0);
    }

    public static void main(String[] args) {
        int startNumber = 35;
        int endNumber = 42;


    for (int i = startNumber; i <= endNumber; i++) {
        if ((i % 5 == 0) && (i % 7 == 0)) {
            System.out.println("fizzbuzz");
        } else if (i % 5 == 0) {
            System.out.println("fizz");
        } else if (i % 7 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(i);
        }
    }

    }
}
