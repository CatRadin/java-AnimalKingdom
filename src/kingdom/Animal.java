package kingdom;

public abstract class Animal {
    
    //fields -------------------------------------------
    protected static int maxNum = 0;
    protected int number;
    protected String name;
    protected int yearDiscovered;

    //constructor --------------------------------------
    public Animal(String name, int yearDiscovered)
    {
        maxNum++;

        this.number = maxNum;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

    }

    //default methods ---------------------------------
    public String eat()
    {
        return(name + "eats")
    }

    //getters & setters -------------------------------

    public int getNumber()
    {
        return number;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered)
    {
        this.yearDiscovered = yearDiscovered;
    }

    // abstract methods ---------------------------------

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();


}
