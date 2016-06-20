public class Money {
    protected int value;
    protected String currency;

    public Money(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Money times(int timesNumber) {
        return new Money(value * timesNumber, currency);
    }

    public int getValue() {
        return value;
    }

    public static Money dollar(int value) {
        return new Money(value, "USD");
    }

    public static Money franc(int value) {
        return new Money(value, "CHF");
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money)object;
        return value == money.getValue() && currency.equals(money.currency());
    }

    public String currency() {
        return currency;
    }
}
