/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.hashing;

/**
 *
 * @author AKA
 */
public class Program {
    public static void main(String[] args) {
        String salt = "pepper";
        String password = "abc123";
        String hash = MCrypt.hashpw(password, salt);
        System.out.println(hash);
        
        System.out.println(MCrypt.checkpw("abc123", hash));
        System.out.println(MCrypt.checkpw("abC123", hash));
        
    }
    
}
