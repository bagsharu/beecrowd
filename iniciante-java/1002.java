

import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double raio;
        final double PI = 3.14159;
        Scanner scan = new Scanner(System.in);

        raio = scan.nextDouble();

        double area = PI * (raio*raio);
        System.out.printf("A=%.4f", area);
 
    }
 
}