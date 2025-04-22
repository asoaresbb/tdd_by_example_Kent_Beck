package src;

public class Main {
    public static void main(String[] args) {
        Money fiveDollars = Money.dollar(5);
        Money tenFrancs = Money.franc(10);

        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);

        Expression sum = fiveDollars.plus(tenFrancs);
        Money result = bank.reduce(sum, "USD");

        System.out.println("Resultado: " + result); // Deve dar "10 USD"

        Expression multiplied = sum.times(2);
        Money multipliedResult = bank.reduce(multiplied, "USD");
        System.out.println("Resultado vezes 2: " + multipliedResult); // Deve dar "20 USD"
    }
}
