public class Asiento {

    private boolean Estado = false;

    public Asiento() {
    }

    public void LiberarAsiento() {
        if (Estado == true) {
            this.Estado = false;
        } else if (Estado == false) {
            System.out.println("El asiento ya esta libre.");
        }
    }

    public void ReservarAsiento() {
        if (Estado == false) {
            this.Estado = true;
        } else if (Estado == true) {
            System.out.println("El asiento ya esta reservado.");

        }
    }

    public String MostrarEstado() {
        return (Estado == true) ? "X" : "O";
    }
}
