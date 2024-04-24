public class Asiento {

    private int IdAsiento;
    private int IdSala;
    private boolean Estado = false;

    public Asiento(int IdAsiento, int IdSala) {
        this.IdAsiento = IdAsiento;
        this.IdSala = IdSala;
    }

    public int getIdAsiento() {
        return IdAsiento;
    }

    public void setIdAsiento(int IdAsiento) {
        this.IdAsiento = IdAsiento;
    }

    public int getIdSala() {
        return IdSala;
    }

    public void setIdSala(int IdSala) {
        this.IdSala = IdSala;
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

    public void MostrarEstado(int sala, int funcion) {
        System.out.println("El asiento " + getIdAsiento() + " esta " + (Estado ? "reservado" : "libre") + " de la sala "
                + (sala+1) + " función " + (funcion+1) + ".");
    }
}
