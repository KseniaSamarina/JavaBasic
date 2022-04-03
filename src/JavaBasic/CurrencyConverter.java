package JavaBasic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter the current dollar exchange rate separated by commas");
        float course = console.nextFloat();
        System.out.println("Please, enter the number of rubles");
        float colRub = console.nextFloat();
        float value = colRub / course;
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        String result = decimalFormat.format(value);
        System.out.println("Dollar exchange rate: " + course);
        System.out.println("Number of rubles: " + colRub);
        System.out.println("Total: " + result);
    }
}

