import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do raio do círculo: ");
        double raio = scanner.nextDouble(); 

        System.out.print("Cor do círculo: ");
        String cor = scanner.next();
        
        Circle circle = new Circle(raio, cor);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circunferência: " + circle.getCircunference());

        scanner.close();
       }

    }