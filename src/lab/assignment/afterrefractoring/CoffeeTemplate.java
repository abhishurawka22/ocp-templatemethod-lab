package lab.assignment.afterrefractoring;

public abstract class CoffeeTemplate 
{
    //template method, final so subclasses can't override
    public final void prepareCoffee(){
        announceCoffee();
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }
    protected abstract void announceCoffee();
    protected abstract void addIngredients();
    protected abstract void finalTouch();
    
}