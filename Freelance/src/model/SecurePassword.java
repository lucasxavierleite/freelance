/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class SecurePassword {
    
    private static String salt;
    
    public static String generateSalt(int lenght){
    String abcCapitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String abcLowerCase = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "01234567890123456789";
    String characters = "!@#$%^&*!@#$%%^^&*";

    String total = abcCapitals + abcLowerCase + numbers + characters;

    String response = "";

    char letters[] = new char[lenght];
    for (int i=0; i<lenght-1; i++){
        Random r = new Random();
        char letter = total.charAt(r.nextInt(total.length()));
        letters[i] = letter;
    }

    response = Arrays.toString(letters).replaceAll("\\s+","");
    response = response.replaceAll(",","");

    return response;
}

    public SecurePassword() {
        SecurePassword.salt = generateSalt(150);
    }
    
    
   private static String securePassword(String passwordToHash, String salt){
            String generatedPassword = null;
            try {
                 MessageDigest md = MessageDigest.getInstance("SHA-512");
                 md.update(salt.getBytes(StandardCharsets.UTF_8));
                 byte[] bytes = md.digest(passwordToHash.getBytes(StandardCharsets.UTF_8));
                 StringBuilder sb = new StringBuilder();
                 for(int i=0; i< bytes.length ;i++){
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                 }
                 generatedPassword = sb.toString();
                } 
               catch (NoSuchAlgorithmException e){
                   System.out.println(e);
               }
            return generatedPassword;
        }
    
}
