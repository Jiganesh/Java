import java.util.Locale;
import java.text.NumberFormat;

public class NumberFormatAndLocale {
    public static void main(String[] args) {
        
        // Different countries have Different Number Format.
        // Using Locale can help in formatting.

        Locale locale = new Locale("en", "IN");
        
        NumberFormat numberformat =NumberFormat.getInstance(locale);
        System.out.println(numberformat.format(10000000.99)); //10,000,000.99

        NumberFormat currencyformat =NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyformat.format(10000.99)); //₹10,000.99

        NumberFormat percentageformat = NumberFormat.getPercentInstance(locale);
        System.out.println(percentageformat.format(10012.99)); //1,001,299%
    }
}
