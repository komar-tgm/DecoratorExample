package decorator;

public class Salad extends Decorator{

    public Salad(Component component){
        this.component=component;
    }
    @Override
    public String recipe() {
        return this.component.recipe()+" and Salad";
    }
}
