
package backEnd;

import backEnd.DataAccess;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Operator {
    //Edit to your server
    private static String HOST = "localhost";
    private static String PORT = "3307";
    private static String USERNAME = "root"; //"Your username"
    private static String PASSWORD = ""; //"Your password"
    private static String CONN_STRING = "jdbc:mysql://" + HOST + ":" + PORT + "/timetoeat"; //"jdbc:mysql:///Your localhost:port"
    private static Connection conn = null;
    
    public static void connect() {
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
    
    public static void loadFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);
                
            scanner.nextLine(); // Skip the header
            int x = 0;
            while(x < 5) {//scanner.hasNext()
                String line = scanner.nextLine();
                System.out.println(line);
                
            String myArray[] = line.split(" ");
            Integer num = Integer.parseInt(myArray[1]);
            storage(myArray[0], num);
            x++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void createDB(){
        try {
            // DriverManager.getConnection("jdbc:mysql:///Your localhost:port", "Your username", "Your password");
            conn = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT, USERNAME, PASSWORD);
            Statement stmt = (Statement) conn.createStatement();
            ResultSet check = stmt.executeQuery("Show Databases;");
            int x = 0;
            while(check.next()){
                if("Test123".equalsIgnoreCase(check.getString(1)))
                    x = 1;
            }
            if(x == 1)
                stmt.executeUpdate("Drop Database Test123;");
            stmt.executeUpdate("Create Database Test123;");
            stmt.executeUpdate("Create Table Test123.Food(foodName varchar(255), caloriesGained int);");
            ResultSet show = stmt.executeQuery("Show Tables in Test123;");
            while (show.next())
                System.out.println(show.getString(1));
         //   insert = "Create Table timetoeat.Activities(activity varchar(255), caloriesBurnt int);";
         //   stmt.executeUpdate(insert);
            System.out.println("Successfully created database!");
            loadFile("backEnd.Food.txt");
            System.out.println("Installation Completed!");
        }catch (SQLException e){
            System.err.println(e);
        }
    }
    
    public static void storage (String s, Integer n){
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

            String insert = "INSERT INTO TimeToEat.Food(foodName, caloriesGained) VALUES ('" + s + "','" + n + "');";
            stmt.executeUpdate(insert);
        }catch (SQLException e){
            System.err.println(e);
        } 
    }
    public static void delete(String s){
        try {
            // DriverManager.getConnection("jdbc:mysql:///Your localhost:port", "Your username", "Your password");
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = (Statement) conn.createStatement();

            String delete = "Delete From TimeToEat.Food Where FoodName=\"" + s + "\";";
            stmt.executeUpdate(delete);
        }catch (SQLException e){
            System.err.println(e);
        } 
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
                    "jdbc:mysql://localhost:3307/TimeToEat", "root", ""
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From Food Order By FoodName;");
            while (resultSet.next()) {
                s += resultSet.getString(1) + " " + resultSet.getString(2) + "\n";
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }
    
    public static void showList(ArrayList<Item> items, String table){ 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/TimeToEat", "root", ""
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From " + table + ";");
            while (resultSet.next()) {
                Item item = new Item(resultSet.getString(1), resultSet.getString(2));
                items.add(item);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static String name, gender, found;
    public static int age, height, weight, health, energy;
    public static void search(String playersName){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/TimeToEat", "root", ""
            );
            Statement statement = connection.createStatement();
            ResultSet ifFound = statement.executeQuery("SELECT If (EXISTS(\n" +
"         SELECT *\n" +
"         FROM timetoeat.player\n" +
"         WHERE Name =  \"" + playersName + "\"), \"True\", \"False\");");
            while(ifFound.next()){
                found = String.valueOf(ifFound.getString(1));
            }
            System.out.println(found);
            if(found.equals("False")){
                System.out.println("Player was not found!");
            }
            else if(found.equals("True")){
                ResultSet resultSet = statement.executeQuery("select * from Player Where Name = '" + playersName + "';");
                while(resultSet.next()) {
                    name = resultSet.getString(1);
                    age = Integer.parseInt(resultSet.getString(2));
                    height = Integer.parseInt(resultSet.getString(3));
                    weight = Integer.parseInt(resultSet.getString(4));
                    gender = resultSet.getString(5);
                    health = Integer.parseInt(resultSet.getString(6));
                    energy = Integer.parseInt(resultSet.getString(7));
                }
            }
            else {
                System.out.println("Try again!");
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void createPlayer(String n, String a, String ht, String wt, String g, String h, String e){
        try {
            // DriverManager.getConnection("jdbc:mysql:///Your localhost:port", "Your username", "Your password");
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = (Statement) conn.createStatement();

            String insert = "INSERT INTO timetoeat.Player(Name, Age, Height, Weight, Gender, Health, Energy) VALUES ('" + n + "'," + a + "," + ht + "," + wt + ",'" + g + "'," + h + "," + e + ");";
            stmt.executeUpdate(insert);
        }catch (SQLException ex){
            System.err.println(ex);
        } 
    }
    public static void whenDone(){
        System.out.println("Completed!");
    }
}
