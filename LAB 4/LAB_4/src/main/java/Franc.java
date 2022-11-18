public class Franc extends Money{
    public int amount;

    public Franc(int amount)
    {
        this.amount=amount;
    }

    public Franc times(int multiplier)
    {
        return new Franc(multiplier*amount);
    }

    @Override
    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return this.amount == franc.amount;
    }
}