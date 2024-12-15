import java.util.Scanner;

public class Lab0 {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 6;
        float sum = 0;
        sum = n1 + n2;
        System.out.println("La resultat est: " + sum);
//part2:To successfully compile the code I need to write the command javac to compile the code and java to run it//

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier nombre entier:");
        n1 = scanner.nextInt();
        System.out.println("Entrez le deuxième nombre entier:");
        n2 = scanner.nextInt();
        sum = n1 + n2;
        System.out.println("La resultat est: " + sum);


        System.out.println("Entrez un nombre:");
        float number = scanner.nextFloat();
        System.out.println("Le double du nombre est: " + (2 * number));

        scanner.close();
    }
}

