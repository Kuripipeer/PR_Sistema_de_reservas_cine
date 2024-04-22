public class Asiento {

    // private String IdSala;
    private boolean Estado = false;

    public Asiento() {
    }

    // public String getIdSala() {
    //     return IdSala;
    // }

    // public void setIdSala(String IdSala) {
    //     this.IdSala = IdSala;
    // }

    public void LiberarAsiento() {
        this.Estado = false;
    }

    public void ReservarAsiento() {
        this.Estado = true;
    }

    public void MostrarEstado() {
        System.out.println("El asiento esta " + (Estado ? "reservado" : "libre") + ".");
    }
}
