import java.util.*;
import java.text.*;

public class HackerRankJavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        Locale indiaLocale = Locale.of("en", "IN");  // jdk>=19
        // Locale indiaLocale = new Locale("en", "IN");  // jdk<19
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment).replaceFirst("\\u20B9", "Rs."));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}

/**
 * Straightforward, EXCEPT --
 * 
 * There isn't a Locale.INDIA like there is for the other three, so:
 * 1. Requires an extra step to create a specialized Locale object for India
 * 2. And the use of the Locale class changed starting in JDK19 so between these 
 *      notes and HackerRank there was a discrepancy
 * 3. HackerRank wanted India currency output as Rs. instead of the symbol so there was
 *      extra work for that in the output
 * 
 * ALSO --
 * When submitting this to HackerRank using Java 15 on their editor, then the symbols 
 * didn't match EXACTLY and they scored the submission as worng.
 * When submitting this to HackerRank using Java 8 on their editor, then the symbols
 * DO match EXACTLY and they scored the submission as correct
 * So clearly their is a small difference in the UTF characters used in this 
 * NumberFormat class between Java 8 and Java 15. Do I need to tell HackerRank about this?
 * 
 * When I put my output and their expected output together into text-compare.com then
 * it looks like ![this](./currency.png)
 * - the space in the french currency doesn't match
 * - the Chinese symbol looks the same to me but doesn't match
 * 
 */