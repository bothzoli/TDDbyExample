abstract public class Money {

    protected int amount;

    static Money franc(int amount) {
        return new Franc(amount);
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }
}
