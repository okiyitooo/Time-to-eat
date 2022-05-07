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
/*
import java.util.Scanner;
public class Main
{
    String name;
    int score;
    //BME variables
    int age;
    int height;
    int weight;
    //responsibility variables
    int fullness;
    int drowsiness;
    //sickness variables
    boolean isSick;
    int sickDaysLeft;
    //health of the person
    int health;
    //measurable time per day or energy
    int totaldays;
    int timeToDoStuff;
    boolean justate;
    boolean justslept;
    //calorie count
    double daycalcount;
    double weekcalcount;
    //activity level gauges the amount of workouts or physical activity done by the person per week to calculate the HBE
    int activityLVL;
    //BMR is the body mass ratio of the person
    double BMR;
    //Harris-Benedict Calculator (Total Daily Energy Expenditure)
    double HBE;
    double weekHBE = HBE * 7;
    //prints stats of the person to test that methods are adjusting values correctly during development
    void printALL(){
        System.out.println("THESE ARE YOUR STATS" + '\n' +  "score:" + score + '\n' + "age:" + age+ '\n' + "height:" + height+ '\n' + "fullness:" + fullness+ '\n' + "weight:" + weight+ '\n' + "sickDaysLeft:" + sickDaysLeft
        + '\n' + "drowsiness:" + drowsiness+ '\n' + "health:" + health+ '\n' + "timeToDoStuff:" + timeToDoStuff+ '\n' + "daycalcount:" + daycalcount +"\nweekcal: " + weekcalcount + '\n' + "activityLVL:" + activityLVL+ '\n' + "HBE:" + HBE+ '\n' + "BMR:" + BMR);
    }

    //calculates the BMR if the person is male
    void calculateBMRmale(){
        double a, b, c;
        a = 6.3 * weight;
        b = 12.9 * height;
        c =  6.8 * age;
        BMR = 66 + a + b - c;
    }

    //calculates the BMR if the person is female  
    void calculateBMRfemale(){
        double x, y, z;
        x = 4.3 * weight;
        y = 4.7 * height;
        z =  4.7 * age;
        BMR = 655 + x + y - z;
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
    }

    //getsick method makes the bool variable isSick equal true and sets the sickDaysLeft to 5
    void getSick(){
        isSick = true;
        sickDaysLeft = 5;
    }

    //Reset functions used to give a measurable time such as calories and hours in a day
    void clearWeeklyCalories(){
        weekcalcount = 0;
    }
    void clearDayCalories(){
       daycalcount = 0;
    }

    //check functions used to update stat effects such as hunger from burning calories or force sleep from lack of sleep.
    void checkcalories(){
            if(daycalcount < HBE && this.justate == false){
                System.out.println("YOU ARE HUNGRY... EAT SOON.");

            }
            if(fullness < 50 && this.justate == false){
                System.out.println("YOU ARE HUNGRY... EAT SOON.");
            }

    }
    void checktime(){
        if(timeToDoStuff <= 0){
            totaldays += 1;
            timeToDoStuff = 24;
            this.clearDayCalories();
        }
        //making the parameter % 7 ==0 so we can make changes weekly and timetodostuff == 24 so make sure we make those changes in the beginning of the day.
        if(totaldays % 7 == 0 && timeToDoStuff == 24){
            double caloriedifference;
            caloriedifference = weekcalcount - weekHBE;

            if(caloriedifference > 0){
                if(caloriedifference > 300){
                    this.weight += 1;
            }
                else if(caloriedifference > 600){
                    this.weight += 2;
            }
                else if(caloriedifference > 900){
                    this.weight += 3;
            }
                else if(caloriedifference > 1200){
                    this.weight += 4;
            }
            }

            if(caloriedifference < 0){
                    if(caloriedifference < -300){
                    this.weight -= 1;
            }
                else if(caloriedifference < -600){
                    this.weight -= 2;
            }
                else if(caloriedifference < -900){
                    this.weight -= 3;
            }
                else if(caloriedifference < -1200){
                    this.weight -= 4;
            }
            }
            //one week has passed if the remainder of days when % by 7 = 0 so we clear the weekly calorie tracker
            this.clearWeeklyCalories();
        }


    }

    //Prints menu to resemble gameplay for testing purposes 
    void printMenu(){

        System.out.println("DAY: "+totaldays+"\n________________________________\n"+ "\nHEALTH: "+ health + "\nFULLNESS: "+fullness + "\nTIME: "+timeToDoStuff );
         System.out.println("\n________________________________\n"+ "1:Do activity" + "\n2:Eat" + "\n3:Rest");


    }

    //eat function takes away time to eat and calories added from the meal.
    void eat(int time, int calories){
        //only eat if justate == false to ensure back to back activities aren't happening
        if(this.justate == false){
        if(fullness < 70){
        fullness += 30;
        daycalcount += calories;
        weekcalcount += calories;
        timeToDoStuff -= time;
        System.out.println("EATING....");
        }
        if(fullness > 70){
            fullness = 100;
              System.out.println("OVERFULL NEED REST");
              daycalcount += calories;
                weekcalcount += calories;
              timeToDoStuff -= time;
              timeToDoStuff -= 2;
        }
        }
        else{
            System.out.println("YOU JUST DID THAT SELECT SOMETHING ELSE...");
        }
    }

    //does an activity decreases the time it takes to finish activity and calories burnt from doing it.
   void doActivity(int time, int caloriesburnt){
       if(activityLVL < 5){
           activityLVL += 1;
       }
        fullness -= 30;
        timeToDoStuff -= time;
        daycalcount -= caloriesburnt;
        weekcalcount -= caloriesburnt;

   }

   //sleep function 
   void sleep(){
       if(justslept == false){
       int timetosleep;
       	Scanner input = new Scanner(System.in);
       System.out.println("Enter amount of hours you'd like to sleep: ");
       timetosleep = input.nextInt();
        if(timetosleep > 4){
            fullness -= 40;
        }
        if(timetosleep < 4){
            fullness -= 20;
        }
        if(timetosleep > timeToDoStuff){
            System.out.println("Can only sleep remainder of day left which is " + timeToDoStuff +" hours.");
            timeToDoStuff -= timetosleep;
        }
        timeToDoStuff -= timetosleep;
       }
       else{
           System.out.println("YOU JUST DID THAT SELECT SOMETHING ELSE...");
       }
       }

   //main function to test code and logic
	public static void main(String[] args) {
	    //create object of class main 
		Main x = new Main();
		//created a scanner object for user input purposes
		Scanner input = new Scanner(System.in);
		//menu selection integer to traverse through the menu
		int menuselection;
		//runtime ensures the loop continues running the sim
		char runtime;
		//assign values to main x object
		x.totaldays = 0;
        x.weight = 155;
        x.height = 74;
        x.age = 23;
        x.activityLVL = 1;
        x.health = 100;
        x.fullness = 100;
        x.timeToDoStuff = 24;
        x.calculateBMRmale();
        x.calculateHBE();
        runtime = 'y';
        //do while loop to sim and test logic
        do{
            //necessary checks to calculate things such as weight, time progression and track players health and stats
            //HBE calculated through each iteration because it fluctuates based on the persons activity level and weight per day
            x.calculateHBE();
            //check time to ensure time is reflecting on stats correctly
            x.checktime();
            //check calories to urge player when to eat
            x.checkcalories();
            //pring menu before switch statement each loop
            x.printMenu();


            menuselection = input.nextInt();
            switch(menuselection){
                case 1:
                    //doing an activity that takes 4 hours and burns 500 calories
                    x.doActivity(4,500);
                    //apply justate and justslept to ensure repetative actions aren't a thing
                    x.justate = false;
                    x.justslept = false;
                    break;
                case 2:
                    //eating a food that takes 2 hours and is 1000 calories 
                    x.eat(2 , 1000);
                    x.justate = true;
                    x.justslept = false;
                    break;
                case 3:
                    //sleep function that allows player to choose how long to sleep.
                    x.sleep();
                    x.justslept = true;
                    x.justate = false;
                    break;
            }
            // print all stats to ensure functions are working properly 
            x.printALL();

        }while(runtime != 'n' || runtime != 'N');
        input.close();
	}
}
©
*/