import java.util.ArrayList;

public class Cine {

    private ArrayList<ArrayList<Sala>> CineC = new ArrayList<ArrayList<Sala>>();
    Cancelaciones Cancelaciones = new Cancelaciones();

    public Cine(int salas, int funciones, int filas, int columnas) {
        for (int i = 0; i < salas; i++) {
            CineC.add(new ArrayList<Sala>());
            for (int j = 0; j < funciones; j++) {
                CineC.get(i).add(new Sala(filas, columnas));
            }
        }
    }

    public void LiberarAsiento(int sala, int funcion, int fila, int columna) {
        CineC.get(sala).get(funcion).LiberarAsiento(fila, columna);
        Cancelaciones.AgregarCancelacion(sala, funcion, fila, columna);
    }

    public void MostrarCancelaciones() {
        Cancelaciones.MostrarCancelaciones();
    }

    public void DeshacerCancelacion() {
        Cancelaciones.DeshacerCancelacion(CineC);
    }

    public void ReservarAsiento(int sala, int funcion, int fila, int columna) {
        CineC.get(sala).get(funcion).ReservarAsiento(fila, columna);
    }

    public void MostrarEstado(int sala, int funcion) {
        CineC.get(sala).get(funcion).MostrarEstado();
    }
}
