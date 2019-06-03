package decorator;

public class Burger implements Component{
    @Override
    public String recipe() {
        return "Bread and Meat";
    }
}
