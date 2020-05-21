package lab.assignment.afterrefractoring;

public class MochaCoffee extends CoffeeTemplate
{    
    @Override
    protected void announceCoffee()
    {
        System.out.println("Making Mocha");
    }

    @Override
    protected void addIngredients()
    {
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void finalTouch()
    {
        System.out.println("Adding sugar");
    }
}