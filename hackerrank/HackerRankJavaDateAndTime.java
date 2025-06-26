import java.io.*;
import java.util.Calendar;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        String[] week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return week[dow-1];
    }

}

public class HackerRankJavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);
        // bufferedWriter.write(res);
        // bufferedWriter.newLine();

        bufferedReader.close();
        // bufferedWriter.close();
    }
}


/**
    To run this: `java HackerRankjavadateandtime.java`
    then enter three integers delineated by space, as below

    08 05 2015 == Wed
    02 10 2013 == Sunday
    08 14 2024 == Wed
    06 02 2025 == Mon

    Calendar class is weird and appears to me inconsistent in the implementation.
    Calendar cal = Calendar.getInstance();
    cal.set(year, month, day);
    cal.get(Calendar.DAY_OF_WEEK);
    This returns the wrong day number - not even by a little bit, way off
    THIS NEEDS **MONTH** ADJUSTED MINUS 1 - for zero indexed months, BUT NOT THE DAY

    I'm sure that I'm misunderstanding something somewhere but the Java docs on this
    are not especially clear.

    day_of_week indexes at 1, 1= Sunday and the Month of Year indexes at 0, 0 = January
 */