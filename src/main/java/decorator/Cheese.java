package decorator;

public class Cheese extends Decorator{
    public Cheese(Component component){
        this.component=component;
    }
    @Override
    public String recipe() {
        return component.recipe()+" and Cheese";
    }
}
