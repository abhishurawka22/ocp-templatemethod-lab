package lab.assignment.afterrefractoring.clientcode;

import lab.assignment.afterrefractoring.CoffeeTemplate;
import lab.assignment.afterrefractoring.MochaCoffee;
import lab.assignment.afterrefractoring.CapuccinoCoffee;
import lab.assignment.afterrefractoring.AmericanoCoffee;

public class CoffeeClient 
{
    public static void main(String[] args)
    {
        CoffeeTemplate coffeetype = new MochaCoffee();

        //using template method
        coffeetype.prepareCoffee();
        System.out.println("************");

        coffeetype = new CapuccinoCoffee();
        coffeetype.prepareCoffee();
        System.out.println("************");

        coffeetype = new AmericanoCoffee();
        coffeetype.prepareCoffee();
        System.out.println("************");
    }
    
}