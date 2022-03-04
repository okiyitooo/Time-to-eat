/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team2.time.to.eat;


public class Trash extends Consumable {

    public Trash(String name, int calories, int healthiness) {
        super(name, calories, healthiness);
    }
    @Override
    public boolean beEaten(){
        super.beEaten();
        return true;
    }
}
