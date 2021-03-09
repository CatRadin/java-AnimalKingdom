package kingdom;

public class Fish extends Animal {

   // constructor -------------------------------
    public Fish(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    //methods -------------------------------------

    @Override
    public String move()
    {
        return "swims";
    }

    @Override
    public String breath()
    {
        return "breathes with gills";
    }

    @Override
    public String reproduce()
    {
        return "lays eggs";
    }

}
