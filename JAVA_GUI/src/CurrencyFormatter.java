import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// DOCS :
// https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance--
// https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html# CHINESE

// Problem From HackerRank
// https://www.hackerrank.com/challenges/java-currency-formatter/problem

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble(); // input :  12324.134
        scanner.close();

        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String in = NumberFormat.getCurrencyInstance( new Locale("en", "IN")).format(payment);
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}