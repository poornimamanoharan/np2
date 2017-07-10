import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        char c;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter an Alphabet");
        c = scanner.next().charAt(0);
 
        /* Check if input alphabet is member of set{A,E,I,O,U,a,e,i,o,u} */
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            System.out.println(c + " is Vowel");
        } else {
            System.out.println(c + " is Consonant");
        }
    }
}
