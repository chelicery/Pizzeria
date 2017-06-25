import java.util.ArrayList;
import java.util.Arrays;

/*pizza pepperoni*/
public class Pepperoni extends Pizza {
    public Pepperoni(String size) {
        this.name = "Pepperoni";
        this.spicyLevel = 5;
        this.size = size;
        switch (size.toLowerCase()) {
            case "mala":
                this.price = 25;
                break;
            case "srednia":
                this.price = 30;
                break;
            case "duza":
                this.price = 35;
        }

        this.ingredients = new ArrayList(Arrays.asList("salami","papryka ostra","cebula","ser"));
    }
}
