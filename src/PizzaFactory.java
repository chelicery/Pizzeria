/*
* Klasa reprezentuje fabryke pizzy
* */
 public class PizzaFactory {
     Pizza makePizza(String type, String size){
         Pizza pizza = null;

         if(type.equals("Capriciosa")){
             return new Capriciosa(size);
         } else if(type.equals("Vege")){
             return new Vege(size);
         } else if(type.equals("Pepperoni")){
             return new Pepperoni(size);
         }
         return pizza;

     }


}
