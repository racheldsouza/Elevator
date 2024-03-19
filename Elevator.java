package overcrowdedelevators;
//My partner for this project is Olivia Oviedo
import java.util.ArrayList;

public class Elevator 
{
    private ArrayList <Person> elevatorLimit = new ArrayList <Person>();
    private int weightLimit;
    private int totalCurrentWeight;

    public Elevator(int weightLimit, int totalCurrentWeight)
    {
        this.weightLimit = weightLimit;
        this.totalCurrentWeight = totalCurrentWeight;
    }
    
    public Elevator()
    {
        this.weightLimit = 0;
        this.totalCurrentWeight = 0;
    }

    public void setWeightLimit(int weightLimit)
    {
        this.weightLimit = weightLimit;
    }

    public void setTotalCurrentWeight(int totalCurrentWeight)
    {
        this.totalCurrentWeight = totalCurrentWeight;
    }

    public boolean addPerson(Person a)
    {
        int person = a.getWeight();
        if (totalCurrentWeight + person <= weightLimit)
        {
            elevatorLimit.add(a);
            totalCurrentWeight += person;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getInfo() 
    {
        String info = ("\nWeight Limit: " + weightLimit + "\nTotal Weight: " + totalCurrentWeight + "\nPeople in elevator:");

        for (Person person : elevatorLimit) 
        {
            info += "\n" + person.getInfo();
        }
        return info;
    }
}
