public class Person 
{
    private String name;
    private int weight;

    public Person(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getInfo()
    {
        return ("Name: " + this.name + " Weight:" + this.weight);

    }
    public int getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return name;
    }
}
