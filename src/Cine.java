import java.util.ArrayList;

public class Cine {

    private ArrayList<ArrayList<Sala>> cineC = new ArrayList<ArrayList<Sala>>();
    private Cancelaciones cancelaciones = new Cancelaciones();
    private Espera espera = new Espera();

    public Cine(int salas, int funciones, int filas, int columnas) {
        for (int i = 0; i < salas; i++) {
            cineC.add(new ArrayList<Sala>());
            for (int j = 0; j < funciones; j++) {
                cineC.get(i).add(new Sala(filas, columnas));
            }
        }
    }

    public void LiberarAsiento(int sala, int funcion, int fila, int columna) {
        if (cineC.get(sala).get(funcion).LiberarAsiento(fila, columna)) {
            cancelaciones.AgregarCancelacion(sala, funcion, fila, columna);
            System.out.println("Reservación cancelada exitosamente.");
            String respuesta = espera.DeshacerEspera();
            if (respuesta != "") {
                ReservarAsiento(Integer.parseInt(respuesta.split(",")[0]), Integer.parseInt(respuesta.split(",")[1]),
                        Integer.parseInt(respuesta.split(",")[2]),
                        Integer.parseInt(respuesta.split(",")[3]));
                espera.EliminarEspera();
            }
        }
    }

    public void ReservarAsiento(int sala, int funcion, int fila, int columna) {
        if (!cineC.get(sala).get(funcion).ReservarAsiento(fila, columna)) {
            espera.AgregarEspera(sala, funcion, fila, columna);
            System.out.println("Asiento no disponible, se ha agregado a la lista de espera...");
        } else {
            System.out.println("Asiento reservado exitosamente.\nPara la sala " + sala + ", funcion " + funcion
                    + ", asiento " + fila + "," + columna + ".");
        }
    }

    public void MostrarEstado(int sala, int funcion) {
        cineC.get(sala).get(funcion).MostrarEstado();
    }

    public void MostrarCancelaciones() {
        cancelaciones.MostrarCancelaciones();
    }

    public void MostrarEsperas() {
        espera.MostrarEsperas();
    }

    public void DeshacerCancelacion() {

        String respuesta = cancelaciones.DeshacerCancelacion(cineC);
        if (!respuesta.equals("")) {
            espera.AgregarEspera(Integer.parseInt(respuesta.split(",")[0]), Integer.parseInt(respuesta.split(",")[1]),
                    Integer.parseInt(respuesta.split(",")[2]), Integer.parseInt(respuesta.split(",")[3]));
        }
    }
}
