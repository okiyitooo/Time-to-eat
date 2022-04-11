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
    //class variables height weight and age calculate the persons HBE and BMI
    // all the others are required for logic within the code
    private String name;
    private int score, age, height;
    private int fullness, weight, sickDaysLeft, drowsiness;
    //activity level gauges the amount of workouts or physical activity done by the person per week to calculate the HBE
    private int health, timeToDoStuff, calcount, activityLVL;
    private boolean isAlive, isSick, Gender; //gender can only be male or female, so i use the boolean data type to store 1 for male 0 for female

    private double BMR, HBE;
    
    public Player(){
        Gender = Math.random() < 0.5; //either 1 or 0
        score = 0;
        isSick = false;
        isAlive=true;
        BMR = Gender ? 
                66 + (6.3 * weight)+(12.9 * height)-(6.8 * age) :    /*Male*/ 
                655 + (4.3 * weight) + (4.7 * height) - (4.7 * age); /*Female*/
    }
    
    //prints stats of the person to test that methods are adjusting values correctly during development
    @Override public String toString(){
        return ("THESE ARE YOUR STATS" + '\n' + "name:" + name + '\n' + "score:" + score + '\n' + "age:" + age+ '\n' + "height:" + height+ '\n' + "fullness:" + fullness+ '\n' + "weight:" + weight+ '\n' + "sickDaysLeft:" + sickDaysLeft
        + '\n' + "drowsiness:" + drowsiness+ '\n' + "health:" + health+ '\n' + "timeToDoStuff:" + timeToDoStuff+ '\n' + "calcount:" + calcount+ '\n' + "activityLVL:" + activityLVL+ '\n' + "HBE:" + HBE+ '\n' + "BMR:" + BMR);
    }
    //BMR value is taken and activityLVL taken to calculate the HBE which tells us how many calories we need a day to stay the same weight.
    void calculateHBE(){
        switch(activityLVL) {
            case 1:  HBE = BMR * 1.2;
                    break; 
            case 2:  HBE = BMR * 1.375;
                    break;
            case 3:  HBE = BMR * 1.55;
                    break;
            case 4:  HBE = BMR * 1.725;
                    break;
            case 5:  HBE = BMR * 1.9;
                    break;
        }

    }

   //die method
    void die(){
        System.out.println("YOU DIED... EAT HEALTHIER NEXT TIME.");
        isAlive=false;
    }
    boolean isAlive(){
        return isAlive;
    }
    //sleep action resets your drowsiness value to zero
    void sleep(){
        drowsiness = 0;

    }
    //getsick method makes the bool variable isSick equal true and sets the sickDaysLeft to 5
    void getSick(){
        isSick = true;
        sickDaysLeft = 5;
    }
    //clearCalories() gives the value of 0 to the variable calcount
    void clearCalories(){
        calcount = 0;
    }
    void eat(Consumable y){
        calcount+=y.calories;
        if(fullness > 90){
            die();
        }
    }
    void doActivity(Activity x){
        //not sure how to contsruct the logic for this method without the activity class being fully
        //fleshed out
        if(health < 20 && x.intensity > 3){
            die();
        }
        if(isSick == true){
            health -= x.intensity;
        }
        weight -= x.intensity;
        health -= x.intensity; //why does the person get closer to death after doing an activity
        //this seems incomplete somehow
    }
        //multiply time for activity by personal time(Timetodostuff)??? this was a description on github for the doactivity method i'm not sure what it means
    public static void main(String args[]){
    //this public static void main method allows me to test the methods and make sure all values of each variable are correctly changing.
        Player x = new Player();
        System.out.println(x);
        x.weight = 155;
        x.height = 74;
        x.age = 23;
        x.activityLVL = 2;
        System.out.println(x);
        System.out.println('\n');
        x.calculateHBE();
        System.out.println(x);


    }
}