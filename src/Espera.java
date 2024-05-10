import java.util.LinkedList;
import java.util.Queue;

public class Espera {
    private Queue<String> espera = new LinkedList<>();

    public Espera() {
    }

    public void AgregarEspera(int salas, int funciones, int filas, int columnas) {
        String esperas = salas + "," + funciones + "," + filas + "," + columnas;
        espera.offer(esperas);
    }
}
