/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team2.time.to.eat;

/**
 *
 * @author the password is not4
 */
public class Stage {
    Player player;
    Time time;
    int mode;
    Fridge fridge;
    GYM gym;
    String prompt = "What do you want to do";
    public Stage(Player player, Time time, int mode, Fridge fridge, GYM gym) {
        this.player = player;
        this.time = time;
        this.mode = mode;
        this.fridge = fridge;
        this.gym = gym;
    }
    
    public Food[] getFridge(){
        return fridge.beGotten();
    }
    public Activity[] getGYM(){
        return gym.beGotten();
    }
}