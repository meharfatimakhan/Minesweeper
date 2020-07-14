/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.*;

/**
 *
 * @author Dell
 */
public class userList {

    List<users> allUsers;
    dbConnectivity db;

    userList() {
        db = new dbConnectivity();
        this.allUsers = new ArrayList<users>();
        this.allUsers = db.LoadAllUsers();
    }

    boolean checkEquality(users userObj) {
        if (allUsers.stream().anyMatch((users uObj) -> uObj.username.equals(userObj.username))) {
            return true;
        }
        return false;
    }

    boolean add(users userObj) {
//        if (allUsers.stream().anyMatch((users uObj) -> uObj.username.equals(userObj.username))) {
//            return false;
//        } else {
        if (userObj.username == "") {
            return false;
        }
        db.addNewUser(userObj);
        db.LoadAllUsers();
        return (allUsers.add(userObj));
//        }
    }
}
