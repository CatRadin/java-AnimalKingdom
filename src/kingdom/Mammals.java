package kingdom;


public class Mammals extends Animal {

   // constructor -------------------------------
    public Mammals(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    //methods -------------------------------------

    @Override
    public String move()
    {
        return "walks";
    }

    @Override
    public String breath()
    {
        return "breathes with lungs";
    }

    @Override
    public String reproduce()
    {
        return "gives birth to live young";
    }

    // @Override
    // public String toString()
    // {
    // 	return "id= " + id + ", name= '" + name + "', yearNamed= " + yearDiscovered;
    // }

}
