package dk.cphbusiness.hashing;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MCrypt {
    public static String hashpw(String password, String salt) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] digested = digest.digest(password.getBytes("UTF-8"));
            String temp = Base64.getEncoder().encodeToString(digested);
            return salt+"$"+temp;
            }
        catch (NoSuchAlgorithmException | UnsupportedEncodingException e) { return null; }
        }
    
    public static boolean checkpw(String candidate, String hash) {
        String[] parts = hash.split("\\$");
        String salt = parts[0];
        // String rawhash = parts[1];
        String candidatehash = hashpw(candidate, salt);
        return hash.equals(candidatehash);
        
        }
    
    }
