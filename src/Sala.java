import java.util.ArrayList;

public class Sala {

    private ArrayList<ArrayList<Asiento>> salaC = new ArrayList<ArrayList<Asiento>>();

    public Sala(int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            salaC.add(new ArrayList<Asiento>());
            for (int j = 0; j < columnas; j++) {
                salaC.get(i).add(new Asiento());
            }
        }
    }

    public boolean LiberarAsiento(int fila, int columna) {
        if (salaC.get(fila).get(columna).LiberarAsiento()) {
            return true;
        }
        return false;
    }

    public boolean ReservarAsiento(int fila, int columna) {
        if(salaC.get(fila).get(columna).ReservarAsiento()){
            return true;
        }
        return false;
    }

    public void MostrarEstado() {
        for (int i = 0; i < salaC.size(); i++) {
            for (int j = 0; j < salaC.get(i).size(); j++) {
                System.out.print(salaC.get(i).get(j).MostrarEstado() + " ");
            }
            System.out.println();
        }
    }
}
