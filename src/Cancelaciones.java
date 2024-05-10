import java.util.ArrayList;
import java.util.Stack;

public class Cancelaciones {

    private Stack<String> cancelaciones = new Stack<String>();

    public Cancelaciones() {
        // super(0, 0, 0, 0); // Explicitly invoke the constructor of the superclass
        // Cine.
    }

    public void AgregarCancelacion(int salas, int funciones, int filas, int columnas) {
        String cancelacion = salas + "," + funciones + "," + filas + "," + columnas;
            cancelaciones.push(cancelacion);

        
        
    }

    public void MostrarCancelaciones() {
        if (cancelaciones.isEmpty()) {
            System.out.println("No hay cancelaciones");
            return;
        }
        for (String cancelacion : cancelaciones) {
            String[] datos = cancelacion.split(",");
            System.out.println(
                    "Sala: " + datos[0] + ", Funcion: " + datos[1] + ", Fila: " + datos[2] + ", Columna: " + datos[3]);
        }
    }

    public void DeshacerCancelacion(ArrayList<ArrayList<Sala>> Cine) {
        if (cancelaciones.isEmpty()) {
            System.out.println("No hay cancelaciones");
        } else {
            String cancelacion = cancelaciones.peek();
            String[] datos = cancelacion.split(",");

            Cine.get(Integer.parseInt(datos[0])).get(Integer.parseInt(datos[1])).ReservarAsiento(
                    Integer.parseInt(datos[2]),
                    Integer.parseInt(datos[3]));
            cancelaciones.pop();
        }
    }
}