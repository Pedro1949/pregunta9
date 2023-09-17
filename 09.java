import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero de hrs: ");
        int horasTrabajadas = scanner.nextInt();

        double salarioSemanal;

        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 12.0;
        } else {
            int horasExtras = horasTrabajadas - 40;
            salarioSemanal = (40 * 12.0) + (horasExtras * 16.0);
        }

        System.out.println("Salario: " + salarioSemanal );

        
    }
}
