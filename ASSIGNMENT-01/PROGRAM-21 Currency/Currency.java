import java.util.*;
class CurrencyDemo {
    public static void main(String args[]) {
        Currency c;
        c = Currency.getInstance(Locale.US);
        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("Default fractional digits: " +
        c.getDefaultFractionDigits());
    }
}
