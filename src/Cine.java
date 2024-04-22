import java.util.ArrayList;

public class Cine {
    private ArrayList<ArrayList<Asiento>> SalaC = new ArrayList<ArrayList<Asiento>>();
    private ArrayList<ArrayList<Sala>> CineC = new ArrayList<ArrayList<Sala>>();

    public void Cine(int salas, int funciones, int filas, int columnas) {
        for (int i = 0; i < salas; i++) {
            CineC.add(new ArrayList<Sala>());
            for (int j = 0; j < funciones; j++) {
                CineC.get(i).add(new Sala());
                CineC.get(i).get(j).Sala(filas, columnas);
            }
        }
    }

    public void LiberarAsiento(int sala, int funcion, int fila, int columna) {
        CineC.get(sala).get(funcion).LiberarAsiento(fila, columna);
    }

    public void ReservarAsiento(int sala, int funcion, int fila, int columna) {
        CineC.get(sala).get(funcion).ReservarAsiento(fila, columna);
    }

    public void MostrarEstado(int sala, int funcion, int fila, int columna) {
        CineC.get(sala).get(funcion).MostrarEstado(fila, columna);
    }   
}
