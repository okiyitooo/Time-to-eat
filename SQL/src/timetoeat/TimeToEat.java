
package timetoeat;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TimeToEat {
    //Edit to your server
    private static String USERNAME = "root"; //"Your username"
    private static String PASSWORD = ""; //"Your password"
    private static String CONN_STRING = "jdbc:mysql://localhost:3306/timetoeat"; //"jdbc:mysql:///Your localhost:port"
    private static Connection conn = null;
    
    public static void main(String[] args) {
       /* ArrayList<String> food = new ArrayList<String>();
        ArrayList<String> calories = new ArrayList<String>();
        int n = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/timetoeat", "root", ""
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from food");
            while (resultSet.next()) {
                food.add(resultSet.getString(1)); 
                calories.add(resultSet.getString(2));
            }
            connection.close();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetoeat", "root", "");
            Statement stmt = (Statement) conn.createStatement();
            while (n < food.size()) {
            
            stmt = (Statement) conn.createStatement();
            String insert = "INSERT INTO timetoeat.food(foodName,caloriesgained) VALUES ('" + food.get(n) + "','" + calories.get(n) + "');";
            stmt.executeUpdate(insert);
            n++;
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("Successfully added food to the database!");
        }catch (Exception e){
            System.err.println(e);
        } */ 
          
}
    
    public static int number = 0;
    public static void loadFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);
                
            scanner.nextLine(); // Skip the header
            
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
                
            String myArray[] = line.split(" ");
            Integer num = Integer.parseInt(myArray[1]);
            storage(myArray[0], num, number);
            System.out.println(myArray.length);
                
            }
            number++;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void createDB(){
        try {
            // DriverManager.getConnection("jdbc:mysql:///Your localhost:port", "Your username", "Your password");
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = (Statement) conn.createStatement();
            String insert = "Create Database timetoeat;";
            stmt.executeUpdate(insert);
            insert = "Create Table timetoeat.Food(foodName varchar(255), caloriesGained int);";
            stmt.executeUpdate(insert);
            insert = "Create Table timetoeat.Activities(activity varchar(255), caloriesBurnt int);";
            stmt.executeUpdate(insert);
            System.out.println("Successfully created database!");
        }catch (SQLException e){
            System.err.println(e);
        } 
        
    }
    
    public static void storage (String s, Integer n, int number){
        DataAccess dataAccess = new DataAccess();
        
      /*  try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/foodData", "root", "");
            if(conn != null){
                System.out.println("Connection to database is successful!");
            }
        }
        catch(Exception e){
            System.out.println("Connection to database is unsuccessful!");
        } */
        try {
            // DriverManager.getConnection("jdbc:mysql:///Your localhost:port", "Your username", "Your password");
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = (Statement) conn.createStatement();
            if (number < 1){
                String insert = "INSERT INTO timetoeat.Food(foodName, caloriesGained) VALUES ('" + s + "','" + n + "');";
                stmt.executeUpdate(insert);
                System.out.println("Successfully added to the database!");
            }
            else if (number == 1){
                String insert = "INSERT INTO timetoeat.Activities(activity, caloriesBurnt) VALUES ('" + s + "','" + n + "');";
                stmt.executeUpdate(insert);
                System.out.println("Successfully added to the database!");
            }
            else {
                System.out.print("Complete");
            }
        }catch (SQLException e){
            System.err.println(e);
        } 
    }
    public static void delete(){
        try{
        
        }catch(Exception e){
            System.out.print(e);
        }
    }
    public static String display(){ 
        String s = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/TimeToEat", "root", ""
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Food");
            while (resultSet.next()) {
                s += resultSet.getString(1) + " " + resultSet.getString(2) + "\n";
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }
}