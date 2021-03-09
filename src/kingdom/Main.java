package kingdom;
import java.util.*;

public class Main 
{
    public static List<Animal> filteredAnimals = new ArrayList<Animal>();
    
    public static void main(String[] args)
    {
    System.out.println("**Start of Program**");

    //mammals ---------------------------------------

    Mammals panda = new Mammals("Panda", 1758);
    Mammals zebra = new Mammals("Zebra", 1778);
    Mammals koala = new Mammals("Koala", 1816);
    Mammals sloth = new Mammals("Sloth", 1804);
    Mammals armadillo = new Mammals("Armadillo", 1758);
    Mammals racoon = new Mammals("Raccoon", 1785);
    Mammals bigfoot = new Mammals("Bigfoot", 2021);

    //Birds -----------------------------------------
    Birds pigeon = new Birds("pigeon", 1837);
    Birds peacock = new Birds("Toucan", 1821);
    Birds toucan =  new Birds("Parrot", 1824);
    Birds parrot = new Birds("Swan", 1758);
    

    //Fish -------------------------------------------
    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);


    //Array List --------------------------------------
    ArrayList<Animal> animalsList = new ArrayList<Animal>();
    animalsList.add(panda);
    animalsList.add(zebra);
    animalsList.add(koala);
    animalsList.add(sloth);
    animalsList.add(armadillo);
    animalsList.add(racoon);
    animalsList.add(bigfoot);
    animalsList.add(pigeon);
    animalsList.add(peacock);
    animalsList.add(toucan);
    animalsList.add(parrot);
    animalsList.add(salmon);
    animalsList.add(catfish);
    animalsList.add(perch);

System.out.println();
System.out.println("*** Array List ***");    
// System.out.println(animalsList.get(0).toString());

animalsList.forEach((a) -> System.out.println(a));

animalsList.sort((animal1, animal2) -> animal1.getYearDiscovered() > animal2.getYearDiscovered());
animalsList.forEach((animal) -> System.out.println(animal));

    }
}