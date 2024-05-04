package tacos.models;

import java.util.List;
import lombok.Data;

@Data
public class Tacos {
    private String name;

    private List<Ingredient> ingredients;
}
