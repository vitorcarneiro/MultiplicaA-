import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");  
        int number = reader.nextInt();
        reader.close();

        for (int i = 0; i <= 10; i++)
            System.out.println(number + " x " + i + " = " + number * i);        
    }
}
