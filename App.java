package overcrowdedelevators;
//My partner for this project is Olivia Oviedo

import java.util.Scanner;
public class PartnerLab1 
{
    public static void main(String[] args) throws Exception
    {
        Scanner weightLimitScan = new Scanner(System.in);
        Scanner weightScan = new Scanner(System.in);
        System.out.println("Enter the weight limit of the first elevator: ");
        int totCurrentWeight = 0;
        int weightLimit1 = weightLimitScan.nextInt();
        Elevator elevator1 = new Elevator(weightLimit1,totCurrentWeight);
        System.out.println("Enter the weight limit of the second elevator: ");
        int weightLimit2 = weightLimitScan.nextInt();
        Elevator elevator2 = new Elevator(weightLimit2, totCurrentWeight);

        elevator1.setWeightLimit(weightLimit1);
        elevator2.setWeightLimit(weightLimit2);

        String person = "";
        Scanner nameScan1 = new Scanner(System.in);
        while (!(person.equals("q")))
        {
            System.out.println("Enter the name of the person to add to elevator 1 or enter q to quit: ");
            //stringInput.nextLine();
            person = nameScan1.nextLine();
            if (!person.equals("q"))
            {
                System.out.println("Enter the weight of the person to add to elevator 1: ");
                int weight = weightScan.nextInt();
                Person personOne = new Person(person,weight);
                    
                if(elevator1.addPerson(personOne))
                {
                    System.out.println("Person added");
                    System.out.println(personOne.getInfo());
                }
                else
                {
                    System.out.println("Person could not be added.");
                }
            }
        }

        String person2 = "";
        Scanner nameScan2 = new Scanner(System.in);
        while (!(person2.equals("q")))
        {
            System.out.println("Enter the name of the person to add to elevator 2 or enter q to quit: ");
            person2 = nameScan2.nextLine();
            if (!person2.equals("q"))
            {
                System.out.println("Enter the weight of the person to add to elevator 2: ");
                int weight2 = weightScan.nextInt();
                Person personTwo = new Person(person2,weight2);
                    
                if(elevator2.addPerson(personTwo))
                {
                    System.out.println("Person added");
                    System.out.println(personTwo.getInfo());
                }
                else
                {
                    System.out.println("Person could not be added.");
                }
            }
        }

        System.out.println(elevator1.getInfo());
        System.out.println(elevator2.getInfo());
        
    }

}   

