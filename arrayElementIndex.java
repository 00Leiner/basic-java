import java.util.Scanner;

public class arrayElementIndex {
    public static void main(String[] arg){
        String email[] = {"email1", "email2", " email3"};
        String Username[] = {"username1", "username2", "username3"};
        String pass[] = {"password1", "Password2", "Password3"};
        Scanner s =  new Scanner(System.in);

        System.out.print("Enter Index: ");
        int index = s.nextInt();

        System.out.println("Index: " + index);
        System.out.println("email: " + email[index]);
        System.out.println("username: " + Username[index]);
        System.out.print("Password: " + pass[index]);

    }
    
}
