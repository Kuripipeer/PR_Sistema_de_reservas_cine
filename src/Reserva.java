import java.util.Scanner;

public class Reserva {
    private static Scanner Scanner = new Scanner(System.in);

    public static void limpiarConsola() {
        System.out.print("\033[2J");
        System.out.print("\033[H");
    }

    public static void main(String[] args) throws Exception {

        Cine cine = new Cine(4, 3, 2, 2);

        limpiarConsola();

        System.out.println("Cancelaciones:");
        cine.MostrarCancelaciones();
        System.out.println("Lista de espera: ");
        cine.MostrarEsperas();
        System.out.println("El estado de los asientos de la sala 0, funcion 0 es:");
        cine.MostrarEstado(0, 0);
        cine.ReservarAsiento(0, 0, 0, 0);
        System.out.println("El estado de los asientos de la sala 0, funcion 0 es:");
        cine.MostrarEstado(0, 0);
        System.out.println("Hacer cancelación sala 0, función 0, fila 0, columna 0:");
        cine.LiberarAsiento(0, 0, 0, 0);

        System.out.println("El estado de los asientos de la sala 0, funcion 0 es:");
        cine.MostrarEstado(0, 0);
        System.out.println("Cancelaciones:");
        cine.MostrarCancelaciones();
        Scanner.close();
    }
}
