package decorator;

public class Main {
    public static void main(String[] args){
        Component component = new Cheese(new Salad(new Burger()));

        System.out.println(component.recipe());
    }
}
