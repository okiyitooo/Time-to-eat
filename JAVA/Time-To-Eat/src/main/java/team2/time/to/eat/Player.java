/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team2.time.to.eat;

/**
 *
 * @author the password is not4
 */
public class Player {
    public boolean isAlive;
    public Player(){
        this.isAlive=true;
    }
    void die(){
        isAlive=false;
    }
}