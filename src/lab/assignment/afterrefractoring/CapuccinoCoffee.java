package lab.assignment.afterrefractoring;

public class CapuccinoCoffee extends CoffeeTemplate
{
    @Override
    protected void announceCoffee()
    {
        System.out.println("Making Capuccino");
    }

    @Override
    protected void addIngredients()
    {
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    @Override
    protected void finalTouch()
    {
        System.out.println("Top with milk foam");
    }
}