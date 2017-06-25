public class Pizzeria {
    PizzaFactory factory;

    public Pizzeria(PizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type, String size){

        Pizza pizza;

        pizza = factory.makePizza(type, size);
        return pizza;

    }



}
