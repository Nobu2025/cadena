import java.util.Scanner;
public class Ejercicio{
    public static void main (String[] args){
        Scanner almacenar = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = almacenar.nextLine();
        System.out.println("Escribe tu apellido");
        String apellido = almacenar.nextLine();

        System.out.println("Tu nombre completo es: " + nombre +" "+ apellido );

    }
}