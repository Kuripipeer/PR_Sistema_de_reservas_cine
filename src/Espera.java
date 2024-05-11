import java.util.LinkedList;
import java.util.Queue;

public class Espera {
    private Queue<String> espera = new LinkedList<>();

    public Espera() {}

    public void AgregarEspera(int salas, int funciones, int filas, int columnas) {
        String esperas = salas + "," + funciones + "," + filas + "," + columnas;
        espera.offer(esperas);
        System.out.println("Se ha agregado a la lista de espera");
    }

    public void MostrarEsperas(){
        if (espera.isEmpty()) {
            System.out.println("No hay esperas");
            return;
        }
        for (String esperas : espera) {
            String[] datos = esperas.split(",");
            System.out.println(
                    "Sala: " + datos[0] + ", Funcion: " + datos[1] + ", Fila: " + datos[2] + ", Columna: " + datos[3]);
        }
    }

    public String DeshacerEspera(){
        String respuesta = "";
        if (espera.isEmpty()) {
            System.out.println("No hay esperas");
            return respuesta;
        } else {
            String esperas = espera.peek();
            return respuesta = esperas;
        }
    }

    public void EliminarEspera(){
        if (espera.isEmpty()) {
            System.out.println("No hay esperas");
            return;
        } else {
            espera.poll();
        }
    }
}
