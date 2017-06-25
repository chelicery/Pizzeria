/*Klasa Testowa, odpowiada za dzialanie programu, potrzebuje obiektow PizzaFactory, Pizzeria, Pizza i Order*/
public class Tests {
    public static void main(String[] args){
            PizzaFactory factory = new PizzaFactory();
            Pizzeria store = new Pizzeria(factory);
            Pizza pizza = store.orderPizza("Vege", "duza");
            Pizza pizza2 = store.orderPizza("Capriciosa", "mala");
    //        System.out.println("Zamowienie 1: " + pizza.toString());
    //        System.out.println("Zamowienie 2: " + pizza2.toString());


            Order ord1 = new Order(true, pizza);


            Order ord2 = new Order(true, pizza2, pizza);


    }
}
