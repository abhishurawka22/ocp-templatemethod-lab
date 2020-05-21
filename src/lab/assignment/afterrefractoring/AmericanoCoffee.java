package lab.assignment.afterrefractoring;

public class AmericanoCoffee extends CoffeeTemplate
{
    @Override
    protected void announceCoffee()
    {
        System.out.println("Making Americano");
    }

    @Override
    protected void addIngredients()
    {
        System.out.println("Add more hot water");
    }

    @Override
    protected void finalTouch()
    {
        System.out.println("Add sugar and cream");
    }
}