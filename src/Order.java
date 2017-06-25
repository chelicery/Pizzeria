/*
* klasa reprezentuje zamowienia zlozone w sklepie,
* @throws NullPointerException kiedy jako parametr podamy nulla
* */
public class Order {
    PizzaFactory factory = new PizzaFactory();
    Pizzeria store = new Pizzeria(factory);
    private Pizza[] orderItem;
    private boolean takeAway = false;
    private double totalOrderPrice;
    private double takeAwayPay = 3;
    private String takeAwayAdress;

    Order(boolean takeAway, Pizza... orderItem) throws NullPointerException{
        this.orderItem = orderItem;
        if(orderItem == null){
            throw new NullPointerException("zamowienie nieprawidlowe");
        }
        for(Pizza p : orderItem){
            this.totalOrderPrice += p.getPrice();
            System.out.println(p.toString());
        }
        if(takeAway){
            this.totalOrderPrice += takeAwayPay;
            System.out.printf("Doliczono kwote za dowoz ");
        }
        System.out.println("total sum: " + this.getTotalOrderPrice());
    }

    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public double getTakeAwayPay() { return takeAwayPay; }
    public String getTakeAwayAdress() { return takeAwayAdress; }







}
