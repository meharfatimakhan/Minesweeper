/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */

public class dbConnectivity {
    Connection myConObj;
    Statement myStatObj;
    
     dbConnectivity() //cons
    {
        try {
            String s = "jdbc:derby://localhost:1527/mine";
            myConObj = DriverManager.getConnection(s, "mehar", "12345");

            myStatObj = myConObj.createStatement();

        } catch (Exception e) {
            System.out.println(e +" EXCEPTION IN CONNECTING TO DATABASE!");
        }
    }
    
    void addNewUser(users obj) {

        try {
            myStatObj.executeUpdate("Insert into usersSweep (username, bestScore) values('" + obj.username + "','" + obj.bestScore + "')");

        } catch (Exception e) {
            System.out.println(e+" Exception in adding new users");

        }

    }
    
    String getScore(String username){
        String bestScore="0";
         try {
            ResultSet myResultObj = myStatObj.executeQuery("SELECT BESTSCORE FROM USERSSWEEP WHERE username='" + username + "'");
            while (myResultObj.next()) {
            bestScore = myResultObj.getString(1);
         }
            return bestScore;
        } catch (Exception e) {
            System.out.println(e+" EXCEPTION IN GETSCORE FUNCTION!");
            return "";
        }
    }
     void setScore(String username, String updatedScore,String oldScore) {

        try {
            int i = myStatObj.executeUpdate("UPDATE USERSSWEEP SET BESTSCORE='" + updatedScore + "'Where username='" + username + "'");//  "' AND '" + updatedScore +"' > bestscore'");
        } catch (Exception e) {
            System.out.println(e+" EXCEPTION IN SETSCORE FUNCTION!");
        }
    }
    
     ArrayList<users> LoadAllUsers() {
        ArrayList<users> userRecord = new ArrayList<>();
        try {
            ResultSet myResultObj = myStatObj.executeQuery("SELECT * FROM USERSSWEEP");
            while (myResultObj.next()) {

                String username;
                String bestScore; 

                username = myResultObj.getString(1);
                bestScore = myResultObj.getString(2);
              
                System.out.println(username + " " + bestScore);
                users newUserScoreEntry = new users(username, bestScore);
                userRecord.add(newUserScoreEntry);

            }

        } catch (Exception e) {
            System.out.println(e+" EXCEPTION IN LOADING ALL USERS");
        }

        return userRecord;
    }
     
      void closeConnection() {
        try {
            myConObj.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
      
      
      
       void Invoke(String user){
          mine1 obj=new mine1(user);
          obj.setVisible(true);
      }
}
