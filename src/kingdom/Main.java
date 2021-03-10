package kingdom;
import java.util.*;

public class Main 
{
    private static List<Animal> filterAnimals(List<Animal> theList, CheckAnimal tester)
    {
        List<Animal> tempList = new ArrayList<>();

        for(Animal a : theList) //for each animal (animal) thats in the list sent in the param
        {
            if(tester.test(a)) // if tester(param) .test from CheckAnimal from the passed in lambda
            {
                tempList.add(a); //if true it adds it to the tempList.
            }
        }

        return tempList; //returns the tempList
    }

    
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
System.out.println();

System.out.println("\n*** Sorted By year decending ***"); 
System.out.println();
animalsList.sort((animal1, animal2) -> animal1.getYearDiscovered() - animal2.getYearDiscovered());
animalsList.forEach(animal -> System.out.println(animal.toString()));
System.out.println();

System.out.println("\n*** Animal sorted Alphabetically ***");
System.out.println();
animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
animalsList.forEach(a -> System.out.println(a.toString()));
System.out.println();

System.out.println("*** Animals sorted by the way they move ***");
System.out.println();
animalsList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
animalsList.forEach(a -> System.out.println(a.getName() + " " + a.move()));
System.out.println();

System.out.println("\n*** Aanimals that breathes with lungs ***");
System.out.println();
List<Animal> filteredList = new ArrayList<>();
filteredList = filterAnimals(animalsList, (a) -> a.breath() == "breathes with lungs");
filteredList.forEach(a -> System.out.println(a.getName() + " " + a.breath()));
System.out.println();

System.out.println("\n*** Animals that breathes with lungs & were named in 1758 ***");
System.out.println();
List<Animal> filteredListLungsYear = new ArrayList<>();
filteredListLungsYear = filterAnimals(animalsList, (a) -> a.breath() == "breathes with lungs" && a.getYearDiscovered() == 1758);
filteredListLungsYear.forEach(a -> System.out.println(a.getName() + " " + a.breath() + " and it was named in " + a.getYearDiscovered()));
System.out.println();

System.out.println("\n*** Animals that lay eggs and breathes with lungs ***");
System.out.println();
List<Animal> filteredListEggsLungs = new ArrayList<>();
filteredListEggsLungs = filterAnimals(animalsList, (a) -> a.breath() == "breathes with lungs" && a.reproduce() == "lays eggs");
filteredListEggsLungs.forEach(a -> System.out.println(a.getName() + " " + a.breath() + " and it " + a.reproduce()));
System.out.println();

System.out.println("\n*** Alphabetically animals that were named in 1758 ***");
System.out.println();
List<Animal> filteredListYear = new ArrayList<>();
filteredListYear = filterAnimals(animalsList, (a) -> a.getYearDiscovered() == 1758);
filteredListYear.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
filteredListYear.forEach(a -> System.out.println(a.getName() ));
System.out.println();

    }
}