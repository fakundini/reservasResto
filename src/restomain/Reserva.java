package restomain;

public class Reserva {

    int  numeroComensales, fecha, hora;
    String nombre, motivo, apellido;

//contructor de una persona
    public Reserva(String nombre,String apellido,int fecha, int hora,int numeroComensales,String motivo ) {
        this.nombre = nombre;
        this.apellido = apellido;
     
        this.fecha = fecha;
        this.hora = hora;
        this.numeroComensales = numeroComensales;
        this.motivo = motivo;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getApellido() {
        return apellido;
    }

}
