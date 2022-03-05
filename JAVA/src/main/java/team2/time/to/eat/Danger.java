/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team2.time.to.eat;

/**
 *
 * An extension of the Activity class
 * For activities such as "Jumping off cliffs" or 
 * "Running head first into a train"
 * Only the most truly intense activities belong here
 */
public class Danger extends Activity {
    private final boolean isDeadly;
    public Danger(String name, int intensity, int healthiness, double time, boolean isDeadly) {
        super(name, intensity, healthiness, time, true);
        this.isDeadly = isDeadly;
    }
    
}
