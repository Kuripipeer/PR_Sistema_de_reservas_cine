import java.util.ArrayList;
import java.util.Stack;

public class Cancelaciones {

    private Stack<String> cancelaciones = new Stack<String>();

    public Cancelaciones() {}

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

    public String DeshacerCancelacion(ArrayList<ArrayList<Sala>> Cine) {
        String respuesta = "";
        if (cancelaciones.isEmpty()) {
            System.out.println("No hay cancelaciones");
            return respuesta;
        } else {
            String cancelacion = cancelaciones.peek();
            String[] datos = cancelacion.split(",");

            if (Cine.get(Integer.parseInt(datos[0])).get(Integer.parseInt(datos[1])).ReservarAsiento(
                    Integer.parseInt(datos[2]),
                    Integer.parseInt(datos[3]))) {
                cancelaciones.pop();
                return respuesta = "";

            } else {
                System.out.println("No se puede deshacer la cancelación");
                System.out.println("Se agregara a la lista de espera la cancelación de: " + "Sala: " + datos[0]
                        + ", Funcion: " + datos[1] + ", Fila: " + datos[2] + ", Columna: " + datos[3]);
                        cancelaciones.pop();
                        return respuesta = cancelacion;
            }
        }
    }
}