import java.util.Scanner;

/**
 * code
 */
public class code {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message to encrypt or decrypt: ");
        String message = input.next();
        System.out.println("Would you like to encrypt or decrypt the message? (e/d)");
        String choice = input.next();
        if (choice.equals("e")) {
            encrypt(message);
        } else {
            decrypt(message);
        }
       }
    public static void encrypt(String message) {
        // encrypt the message using the caesar cipher
        String encrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                c = (char) (c + 3);
                if (c > 'z') {
                    c = (char) (c - 26);
                }
            }
            encrypted += c;
            
        }
        System.out.println("The encrypted message is: " + encrypted);
        

    }
    public static void decrypt(String message) {
        // decrypt the message using the caesar cipher
        String decrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                c = (char) (c - 3);
                if (c < 'a') {
                    c = (char) (c + 26);
                }
            }
            decrypted += c;
        }
        System.out.println("The encrypted message is: " + decrypted);
        
    }
    
}