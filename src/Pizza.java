import java.util.ArrayList;
/*
* Klasa reprezentuje rzeczywiste obiekty pizza
* */
 abstract public class Pizza {
    protected String name;
    protected ArrayList ingredients;
    protected int price;
    protected int spicyLevel;
    protected String size;
 //   protected boolean takeAway = false;
    protected String extraPay = "" ;


    public String getName() { return name; }

    public int getPrice() { return price; }

    public int getSpicyLevel() { return spicyLevel; }

    public String getSize() { return size; }

    public void setPrice(int price) { this.price = price; }

    public ArrayList getIngredients() {
        return ingredients;
    }

    @Override
    public String toString(){
        return  "\nPizza: " + name + "\nRozmiar: " + size + "\nStopien ostrosci: "
                + spicyLevel + "\nCena: " + price + extraPay + "\ningredients: " + ingredients;
    }


}
