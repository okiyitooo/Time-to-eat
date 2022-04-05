
package timetoeat;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
        // Attributes
    private String food;
    private Integer calories;

    // Constructors
    public DataAccess(String food, Integer calories) {
        this.food = food;
        this.calories = calories;
    }
    
    public DataAccess() { 
        this.food = new String();
        this.calories =  0;
    }
    
    // Getters and Setters
    public String getFood() { return food; }
    public Integer getCalories() { return calories; }
    
    public void setFood(String food) { this.food = food; }
    public void setCalories(Integer calories) { this.calories = calories; }

}
