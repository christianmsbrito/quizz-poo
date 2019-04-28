
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Database {
    
    private static ArrayList<User> users;
    private static ArrayList<Question> questions;

    /**
     * @param user
     */
    public static void insertUser(User user) {
        users.add(user);
    }
}
