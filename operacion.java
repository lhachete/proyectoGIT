import java.util.Scanner;
public class Multiple{
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero1 = teclat.nextInt();
        teclat.nextLine();

        System.out.print("Introduce otro número: ");
        int numero2 = teclat.nextInt();
        teclat.nextLine();

        System.out.print("Introduece una opción a realizar (1:suma,  2:resta, 3:multiplicación o 4:división): ");
        final int ENTER = teclat.nextInt();

        switch(ENTER){
            case 1:
                System.out.println("Suma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resta: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Multiplicación: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("División: " + (numero1 / numero2));
                break;
            default:
                System.out.println("No has introducido un número entre 1 y 4");
                        
        }

        teclat.close();
    }   
}
