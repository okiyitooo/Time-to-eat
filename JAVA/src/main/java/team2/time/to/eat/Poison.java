/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team2.time.to.eat;

/**
 *
 * Bad Foods
 */
public class Poison extends Food {
    final private int danger;
    public Poison(String name, int calories, int healthiness, int danger) {
        super(name, calories, healthiness);
        this.danger = danger;
    }
    
}
