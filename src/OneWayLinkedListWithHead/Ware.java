package OneWayLinkedListWithHead;

public class Ware {

    private String name;
    private int amount;
    private double price,value;

    public Ware(String name,int amount, double price)
    {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.value = this.price * (double)this.amount;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    public int getAmount()
    {
        return amount;
    }
    public double getPrice()
    {
        return price;
    }
    public double getValue()
    {
        return value;
    }

    public String toString()
    {
        return "Name: " +  name +  " Amount:  " + amount + " Price: " + price + " Value: " + value;
    }

}
