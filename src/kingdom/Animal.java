package kingdom;

public abstract class Animal {
    
    //fields 
    protected static int maxNum = 0;
    protected int number;
    protected String name;
    protected int yearDiscovered;

    //constructor
    public Animal(String name, int yearDiscovered)
    {
        maxNum++;

        this.number = maxNum;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

    }

    

}
