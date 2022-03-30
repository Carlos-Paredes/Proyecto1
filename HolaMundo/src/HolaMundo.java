//Mi clase en Java
import java.util.Scanner;

public class HolaMundo {
    public static void main(String args[]){
//       Scanner scanner = new Scanner(System.in);
//        // Escribe tu solucion aqui
//        System.out.println("Proporciona el titulo:");
//        String titulo = scanner.nextLine();
//        System.out.println("Proporciona el autor:");
//        String autor = scanner.nextLine();
//        System.out.println(titulo + " fue escrito por " + autor);   
//        System.out.println("Mi nombre es Akira");  

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
