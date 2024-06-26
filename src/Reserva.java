public class Reserva {

    public static void LimpiarConsola() {
        System.out.print("\033[2J");
        System.out.print("\033[H");
    }

    public static void main(String[] args) throws Exception {

        Cine cine = new Cine(1, 1, 2, 2);

        LimpiarConsola();

        System.out.println("\t\tBienvenido al cine");
        System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nReservas canceladas");
        cine.MostrarCancelaciones();
        System.out.println("\nReservas en espera");
        cine.MostrarEsperas();

        System.out.println("\nReservando asiento 1,1 en la sala 1, funcion 1");
        cine.ReservarAsiento(0, 0, 0, 0);
        cine.ReservarAsiento(0, 0, 1, 1);

        System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nReservas canceladas");
        cine.MostrarCancelaciones();
        System.out.println("\nReservas en espera");
        cine.MostrarEsperas();

        System.out.println("\nReservando asiento 1,1 en la sala 1, funcion 1");
        cine.ReservarAsiento(0, 0, 0, 0);

        System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nReservas canceladas");
        cine.MostrarCancelaciones();
        System.out.println("\nReservas en espera");
        cine.MostrarEsperas();

        System.out.println("\nReservando asiento 1,1 en la sala 1, funcion 1");
        cine.ReservarAsiento(0, 0, 1, 1);

        System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nReservas canceladas");
        cine.MostrarCancelaciones();
        System.out.println("\nReservas en espera");
        cine.MostrarEsperas();

        System.out.println("\nLiberando asiento 1,1 en la sala 1, funcion 1");
        cine.LiberarAsiento(0, 0, 0, 0);

        System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nReservas canceladas");
        cine.MostrarCancelaciones();
        System.out.println("\nReservas en espera");
        cine.MostrarEsperas();

        System.out.println("\nLiberando asiento 1,1 en la sala 1, funcion 1");
        cine.LiberarAsiento(0, 0, 1, 1);

        System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nReservas canceladas");
        cine.MostrarCancelaciones();
        System.out.println("\nReservas en espera");
        cine.MostrarEsperas();

        cine.DeshacerCancelacion();

        System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        cine.MostrarEstado(0, 0);
        System.out.println("\nReservas canceladas");
        cine.MostrarCancelaciones();
        System.out.println("\nReservas en espera");
        cine.MostrarEsperas();

        // System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        // cine.MostrarEstado(1, 1);
        // System.out.println("\nReservas canceladas");
        // cine.MostrarCancelaciones();
        // System.out.println("\nReservas en espera");
        // cine.MostrarEsperas();

        // System.out.println("\nReservación de un asiento que ya está reservado y su registro en la cola de espera.");
        // cine.ReservarAsiento(1, 1, 1, 1);

        // System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        // cine.MostrarEstado(1, 1);
        // System.out.println("\nReservas canceladas");
        // cine.MostrarCancelaciones();
        // System.out.println("\nReservas en espera");
        // cine.MostrarEsperas();

        // System.out.println(
        //         "\nCancelar la reservación del asiento 1,1 en la sala 1, funcion 1 y su registro en la pila de cancelaciones.");
        // cine.LiberarAsiento(1, 1, 1, 1);

        // System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        // cine.MostrarEstado(1, 1);
        // System.out.println("\nReservas canceladas");
        // cine.MostrarCancelaciones();
        // System.out.println("\nReservas en espera");
        // cine.MostrarEsperas();


        // System.out.println("\nDeshacer la cancelación del asiento 1,1 en la sala 1, funcion 1 y su registro en la cola de espera.");
        // cine.DeshacerCancelacion();

        // System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        // cine.MostrarEstado(1, 1);
        // System.out.println("\nReservas canceladas");
        // cine.MostrarCancelaciones();
        // System.out.println("\nReservas en espera");
        // cine.MostrarEsperas();

        // System.out.println("\nVolver a cancelar la reservación del asiento 1,1 en la sala 1, funcion 1 y su registro en la pila de cancelaciones.");
        // cine.LiberarAsiento(1, 1, 1, 1);

        // System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        // cine.MostrarEstado(1, 1);
        // System.out.println("\nReservas canceladas");
        // cine.MostrarCancelaciones();
        // System.out.println("\nReservas en espera");
        // cine.MostrarEsperas();

        // System.out.println("\nVolver a deshacer la cancelación del asiento 1,1 en la sala 1, funcion 1 y su registro en la cola de espera.");
        // cine.DeshacerCancelacion();

        // System.out.println("\nEstado de asientos para la sala 1, funcion 1\n");
        // cine.MostrarEstado(1, 1);
        // System.out.println("\nReservas canceladas");
        // cine.MostrarCancelaciones();
        // System.out.println("\nReservas en espera");
        // cine.MostrarEsperas();

    }
}
