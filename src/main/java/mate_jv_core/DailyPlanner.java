package mate_jv_core;

/**
 * We are going to do a lot of tasks today! Let's write them out.
 *
 * Implement a method createDailyPlan() that takes an array of string plans and returns a string displaying our daily plans as a list.
 *
 * Rules:
 *
 * the list should start with the words "My plans:";
 * each item is preceded by a new line ("\n") and its order number in the format like "1.) ";
 * each item is followed by a semicolon.
 */

public class DailyPlanner {
    public static String createDailyPlan(String[] plans) {
        //Write code below this line
        StringBuilder sb = new StringBuilder();
        sb.append("My plans:\n");
        for (int i = 0; i < plans.length; i++) {
            sb.append(i + 1).append(".) ").append(plans[i]).append(";\n");
        }
        return String.valueOf(sb).trim();
        //Write code above this line
    }

    public static void main(String[] args) {
        String[] plans = {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};
        System.out.printf("%s\n", createDailyPlan(plans));
    }
}
