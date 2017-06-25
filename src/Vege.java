
import java.util.ArrayList;
import java.util.Arrays;

/*Pizza vegetarianska*/
public class Vege extends Pizza {
    public Vege(String size){
        this.name = "Vege";
        this.spicyLevel = 0;
        this.size = size;
        switch (size.toLowerCase()){
            case "mala":
                this.price = 20;
                break;
            case "srednia":
                this.price = 25;
                break;
            case "duza":
                this.price = 30;
        }

        this.ingredients = new ArrayList(Arrays.asList("papryka","pomidor","ser"));
    }

}
