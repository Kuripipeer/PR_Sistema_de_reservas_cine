import java.util.ArrayList;

public class Cine {

    private ArrayList<ArrayList<Sala>> CineC = new ArrayList<ArrayList<Sala>>();
    Cancelaciones Cancelaciones = new Cancelaciones();
    Espera Espera = new Espera();

    public Cine(int salas, int funciones, int filas, int columnas) {
        for (int i = 0; i < salas; i++) {
            CineC.add(new ArrayList<Sala>());
            for (int j = 0; j < funciones; j++) {
                CineC.get(i).add(new Sala(filas, columnas));
            }
        }
    }

    public void LiberarAsiento(int sala, int funcion, int fila, int columna) {
        if (CineC.get(sala).get(funcion).LiberarAsiento(fila, columna)) {
            Cancelaciones.AgregarCancelacion(sala, funcion, fila, columna);
            System.out.println("Reservación cancelada exitosamente.");
            String respuesta = Espera.DeshacerEspera();
            if (respuesta != "") {
                ReservarAsiento(Integer.parseInt(respuesta.split(",")[0]), Integer.parseInt(respuesta.split(",")[1]),
                        Integer.parseInt(respuesta.split(",")[2]),
                        Integer.parseInt(respuesta.split(",")[3]));
                Espera.EliminarEspera();
            }
        }
    }

    public void MostrarCancelaciones() {
        Cancelaciones.MostrarCancelaciones();
    }

    public void MostrarEsperas() {
        Espera.MostrarEsperas();
    }

    public void DeshacerCancelacion() {

        String respuesta = Cancelaciones.DeshacerCancelacion(CineC);
        if (!respuesta.equals("")) {
            Espera.AgregarEspera(Integer.parseInt(respuesta.split(",")[0]), Integer.parseInt(respuesta.split(",")[1]),
                    Integer.parseInt(respuesta.split(",")[2]), Integer.parseInt(respuesta.split(",")[3]));
        }
    }

    public void ReservarAsiento(int sala, int funcion, int fila, int columna) {
        if (!CineC.get(sala).get(funcion).ReservarAsiento(fila, columna)) {
            Espera.AgregarEspera(sala, funcion, fila, columna);
            System.out.println("Asiento no disponible, se ha agregado a la lista de espera...");
        } else {
            System.out.println("Asiento reservado exitosamente.\nPara la sala " + sala + ", funcion " + funcion
                    + ", asiento " + fila + "," + columna + ".");
        }
    }

    public void MostrarEstado(int sala, int funcion) {
        CineC.get(sala).get(funcion).MostrarEstado();
    }
}
