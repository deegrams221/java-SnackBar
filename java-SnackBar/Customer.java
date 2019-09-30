package java-SnackBar;

public class Customer
{
    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    // constructor
    public Customer(Sring name, double cash)
    {
        maxId++;

        id = maxId;

        this.name = name;
        this.cash = cash;
    }

    //methods
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;  
    }

    public String getName()
    {
        return name;
    }

    public double getCash()
    {
        return cash;
    }

    public void addCash(double newCash)
    {
        cash = cash + newCash;
    }

    public void buySnack(double totalCost)
    {
        cash = cash - totalCost;
    }

    // Object
//     @Override
//     public String toString()
//     {
//         String rtnStr = "id: " + id + "\n" +
//                         "name: " + name + "\n" +
//                         "cash: " + cash + "\n"
//     }
// }