/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team2.time.to.eat;

import static java.lang.Math.abs;

/**
 *
 * @author the password is not4
 */
public class Consumable {
    protected final String name;
    /** Calorie count of consumable */
    protected int calories;
    /** The healthiness of a Consumable, only exists within the range of 10 and -10*/
    protected final int healthiness; 
    
    public Consumable(String name, int calories, int healthiness){
        this.name = name;
        this.calories = calories > 0 ? calories : 1;
        this.healthiness = abs(healthiness)> 10 ? (healthiness > 10 ? 10 : -10) : healthiness ;
    }
    /**
     * consumable is eaten
     * @return True if class is Trash class
     */
    public boolean beEaten(){
        calories = 0;
        return false;
    }
    /**
     * @return string representation of Object
    */
    @Override
    public String toString(){
        return "Name: "+name+"\nHealthiness: "+healthiness+"\nCalories: "+calories;
    }

    /**
     *
     * @return name of consumable
     */
    public String getName(){
        return name;
    }
}