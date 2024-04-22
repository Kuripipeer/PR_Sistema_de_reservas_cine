import java.util.Scanner;

public class Reserva {
    static Scanner Scanner = new Scanner(System.in);

    public static void limpiarConsola() {
        System.out.print("\033[2J");
        System.out.print("\033[H");
    }

    public static void main(String[] args) throws Exception {

        Cine cine = new Cine();
        cine.Cine(2, 3, 2, 2);

        limpiarConsola();

        System.out.println("Mostrar estado de la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);

        System.out.println("\nReservar asiento 1, funcion 1, sala 1\n");
        cine.ReservarAsiento(0, 0, 0, 0);
        cine.MostrarEstado(0, 0);

        System.out.println("\nPresiona enter para continuar...");
        Scanner.nextLine();
        limpiarConsola();

        System.out.println("Mostrar estado de la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nReservar asiento ya reservado(asiento 1, sala 1, funcion 1)\n");
        cine.ReservarAsiento(0, 0, 0, 0);

        System.out.println("\nPresiona enter para continuar...");
        Scanner.nextLine();
        limpiarConsola();

        System.out.println("Mostrar estado de la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nCancelar reserva del asiento 1, funcion 1, sala 1\n");
        cine.LiberarAsiento(0, 0, 0, 0);
        cine.MostrarEstado(0, 0);

        System.out.println("\nPresiona enter para continuar...");
        Scanner.nextLine();
        limpiarConsola();


        System.out.println("Mostrar estado de la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nCancelar reserva de asiento dispónible (asiento 1, funcion 1, sala 1)\n");
        cine.LiberarAsiento(0, 0, 0, 0);

        System.out.println("\nPresiona enter para continuar...");
        Scanner.nextLine();
        limpiarConsola();

    }
}
