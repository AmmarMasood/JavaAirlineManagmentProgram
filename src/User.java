
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ammar
 */
public class User {
    private boolean LoggedIn;
    
    public boolean signInUser(String email, String password){
        String path = "registerDetails.txt";
        String tempUsername = "";
        String tempPassword = "";
        File f = new File(path);
         try{
            Scanner x = new Scanner(f);
            x.useDelimiter("[,\n]");
              while(x.hasNext() && !LoggedIn){
                tempUsername = x.next();
                tempPassword = x.next();
                System.out.println("temp1 " + tempUsername);
                System.out.println("temp2 " + tempPassword);
                if(tempUsername.trim().equals(email) && tempPassword.trim().equals(password)){
                   LoggedIn = true;
                }
              }
             
         }catch(Exception e){
             System.out.println(e);
         }
         return LoggedIn;
         //System.out.println(login);
    }
//    checks if the provided email is valid
    public boolean isEmailValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    } 
    //checks if the email already exists
    public boolean emailExist(String email){
        boolean emailExist = false;
       String path = "registerDetails.txt";
        String tempEmail = "";
        File f = new File(path);
         try{
            Scanner x = new Scanner(f);
            x.useDelimiter("[,\n]");
              while(x.hasNext() && !emailExist){
                tempEmail = x.next();
                System.out.println("email " + tempEmail);
                if(tempEmail.trim().equals(email)){
                   emailExist = true;
                }
              }
             
         }catch(Exception e){
             System.out.println(e);
         }
         return emailExist;
    }
 //checks if the provided password is valid
    public boolean isPassValid(String pass){
         if(pass.length() <= 5){
            return false;
         }
         return true;
    }
    //registers the user
    public boolean registerUser(String name, String lastName, String email, String password){
        boolean isRegistered = false;
        try {
            FileWriter writer = new FileWriter("registerDetails.txt", true);
            writer.write(name);
            writer.write(",");
            writer.write(lastName);
            writer.write(",");
            writer.write(email);
            writer.write(",");
            writer.write(password);
            writer.write(System.getProperty("line.separator"));
            writer.close();
            isRegistered = true;
        } catch (Exception e) {
            System.out.println(e);
            // JOptionPane.showMessageDialog(rootPane,"Error");
        }
        return isRegistered;
    }
    
    
}