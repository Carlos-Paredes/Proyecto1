//Mi clase en Java
import java.util.Scanner;

public class HolaMundo {
    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);   
        System.out.println("Mi nombre es Akira");  
    }
}
