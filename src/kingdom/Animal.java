package kingdom;

public abstract class Animal {
    
    //fields -------------------------------------------
    protected static int maxNum = 0;
    protected int id;
    protected String name;
    protected int yearDiscovered;

    //constructor --------------------------------------
    public Animal(String name, int yearDiscovered)
    {
        maxNum++;

        this.id = maxNum;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

    }

    //default methods ---------------------------------
    public String eat()
    {
        return(name + "eats");
    }

    @Override
    public String toString()
    {
    	return "id= " + id + ", name= '" + name + "', yearNamed= " + yearDiscovered;
    }

    //getters & setters -------------------------------

    public int getId()
    {
        return id;
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
