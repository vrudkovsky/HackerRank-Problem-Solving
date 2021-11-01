package Mate;

/**
 * Реалізуй метод getAverageSalary(double[] salaries),
 * що повертає середнє значення у масиві salaries.
 */

public class AverageSalary {

    public static double getAverageSalary(double[] salaries) {
        // write your code here
        double average = 0;
        if (salaries.length > 0) {
            double sum = 0;
            for (double salary : salaries) {
                sum += salary;
            }
            average = sum / salaries.length;
        }
        return average;
    }


    public static void main(String[] args) {
        double as1 = getAverageSalary(new double[]{1000.00, 500.00});
        double as2 = getAverageSalary(new double[]{100.00, 200.00, 300.00});
        double as3 = getAverageSalary(new double[0]);
        System.out.printf("1 %.02f\n", as1);
        System.out.printf("2 %.02f\n", as2);
        System.out.printf("3 %.02f\n", as3);
    }
}
