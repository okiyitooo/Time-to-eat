/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team2.time.to.eat;

/**
 *
 * @author the password is not4
 */
public class Time {
    private int hours;
    private int day;
    private int weeks;
    public void add(int hoursToBeAdded) {
        int leftoverdays = 0;
	if (hoursToBeAdded > 24) {
		leftoverdays += hoursToBeAdded / 24;
		day += leftoverdays;
		hoursToBeAdded -= leftoverdays * 24;
	}
	hours += hoursToBeAdded;
	if (hours > 24){
		hours = hours - 24;
                day += 1;
        }
        weeks = day/7;
    }
    @Override public String toString(){
        String timeOfDay;
        String MM= "PM";
	if (hours < 12){
		timeOfDay = "Morning"; MM = "AM";
        }
	else if (hours < 16)
		timeOfDay = "Afternoon";
	else if (hours < 19)
		timeOfDay = "Evening";
	else
		timeOfDay = "Night";
        return timeOfDay + " " + hours + " " + MM + " DAY " + day ;
    }
}
