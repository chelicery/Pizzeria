import java.util.ArrayList;
import java.util.Arrays;

/*
* Pizza capriciosa,
* */
public class Capriciosa extends Pizza {
    //Capriciosa constructor
    public Capriciosa(String size){
        this.name = "Capriciosa";
        this.spicyLevel = 1;
        this.size = size;
        switch (size.toLowerCase()){
            case "mala":
                this.price = 25;
                break;
            case "srednia":
                this.price = 30;
                break;
            case "duza":
                this.price = 35;
        }

        this.ingredients = new ArrayList(Arrays.asList("pieczarki", "sos", "szynka"));

    }
}
