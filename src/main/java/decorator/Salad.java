package decorator;

public class Salad extends Decorator{

    public Salad(Component component){
        this.component=component;
    }
    @Override
    public String recipe() {
        return this.recipe()+" and Salad";
    }
}
