import java.util.ArrayList;
import java.util.Stack;

public class Cancelaciones {

    private Stack<String> cancelaciones = new Stack<String>();

    public Cancelaciones() {
        // super(0, 0, 0, 0); // Explicitly invoke the constructor of the superclass
        // Cine.
    }

    public void AgregarCancelacion(int salas, int funciones, int filas, int columnas) {
        if (cancelaciones.peek() == cancelaciones.lastElement()) {
            System.out.println("No se puede cancelar la última reserva.");
        } else {
            String cancelacion = salas + "," + funciones + "," + filas + "," + columnas;
            cancelaciones.push(cancelacion);
        }
    }

    public void MostrarCancelaciones() {
        if (cancelaciones.isEmpty()) {
            System.out.println("No hay cancelaciones");
            return;
        }
        System.out.println("Cancelaciones:");
        for (String cancelacion : cancelaciones) {
            String[] datos = cancelacion.split(",");
            System.out.println(
                    "Sala: " + datos[0] + ", Funcion: " + datos[1] + ", Fila: " + datos[2] + ", Columna: " + datos[3]);
        }
    }

    public void DeshacerCancelacion(ArrayList<ArrayList<Sala>> Cine) {
        if (cancelaciones.isEmpty()) {
            System.out.println("No hay cancelaciones");
            return;
        }
        String cancelacion = cancelaciones.peek();
        String[] datos = cancelacion.split(",");

        Cine.get(Integer.parseInt(datos[0])).get(Integer.parseInt(datos[1])).ReservarAsiento(Integer.parseInt(datos[2]),
                Integer.parseInt(datos[3]));
        cancelaciones.pop();
    }
}