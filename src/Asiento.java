public class Asiento {

    private boolean estado = false;

    public Asiento() {}

    public boolean LiberarAsiento() {
        if (estado == true) {
            this.estado = false;
            return true;
        } else if (estado == false) {
            System.out.println("El asiento ya esta libre.");
            return false;
        }
        return false;
    }

    public boolean ReservarAsiento() {
        if (estado == false) {
            this.estado = true;
            return true;
        } else if (estado == true) {
            System.out.println("El asiento ya esta reservado.");
            return false;
        }
        return false;
    }

    public String MostrarEstado() {
        return (estado == true) ? "[R]" : "[D]";
    }
}
