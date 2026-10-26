
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("intriduzca tu nombre : ");
        String texto = sc.nextLine();
        System.out.println("bienvenido "+texto +" a la programa de java");
        
        System.out.println("Nuevo cambio hecho por cesar");
        sc.close();
    }

}