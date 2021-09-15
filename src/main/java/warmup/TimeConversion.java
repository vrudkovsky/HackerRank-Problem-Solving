package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String time = "";
        try {
            DateFormat in = new SimpleDateFormat("hh:mm:ssa");
            DateFormat out = new SimpleDateFormat("HH:mm:ss");
            Date date = in.parse(s);
            time = out.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return time;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        System.out.printf("%s\n", result);

        bufferedReader.close();
    }
}
