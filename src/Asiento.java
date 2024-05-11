public class Asiento {

    private boolean Estado = false;

    public Asiento() {
    }

    public boolean LiberarAsiento() {
        if (Estado == true) {
            this.Estado = false;
            return true;
        } else if (Estado == false) {
            System.out.println("El asiento ya esta libre.");
            return false;
        }
        return false;
    }

    public boolean ReservarAsiento() {
        if (Estado == false) {
            this.Estado = true;
            return true;
        } else if (Estado == true) {
            System.out.println("El asiento ya esta reservado.");
            return false;
        }
        return false;
    }

    public String MostrarEstado() {
        return (Estado == true) ? "[R]" : "[D]";
    }
}
