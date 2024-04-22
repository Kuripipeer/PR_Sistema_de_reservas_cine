import java.util.ArrayList;

public class Sala {
    private ArrayList<ArrayList<Asiento>> SalaC = new ArrayList<ArrayList<Asiento>>();

    public void Sala(int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            SalaC.add(new ArrayList<Asiento>());
            for (int j = 0; j < columnas; j++) {
                SalaC.get(i).add(new Asiento());
            }
        }
    }

    public void LiberarAsiento(int fila, int columna) {
        SalaC.get(fila).get(columna).LiberarAsiento();
    }

    public void ReservarAsiento(int fila, int columna) {
        SalaC.get(fila).get(columna).ReservarAsiento();
    }

    public void MostrarEstado(int fila, int columna) {
        for (int i = 0; i < SalaC.size(); i++) {
            for (int j = 0; j < SalaC.get(i).size(); j++) {
                SalaC.get(i).get(j).MostrarEstado();
            }
        }
    }
}
