package kingdom;

public class Birds extends Animal {

   // constructor -------------------------------
    public Birds(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    //methods -------------------------------------

    @Override
    public String move()
    {
        return "flys";
    }

    @Override
    public String breath()
    {
        return "breathes with lungs";
    }

    @Override
    public String reproduce()
    {
        return "lays eggs";
    }

}
