/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team2.time.to.eat;


public class Food extends Consumable {

    public Food(String name, int calories, int healthiness) {
        super((healthiness > 8 ? "GodTier " : healthiness > 5 ? "Perfect " : healthiness > 1 ? "Healthy " : healthiness < -1 ? "Spoiled " :  healthiness < -5 ? "Rotten " : healthiness < -8 ? "RadioActive " : "") 
                +name,
                calories,
                healthiness);
        String State = "";
    }
    
}
