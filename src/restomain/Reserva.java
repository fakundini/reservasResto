package restomain;

public class Reserva {

    int numeroComensales, fecha, hora, iD;
    String nombre, motivo, apellido;
   public  String horario[] = {"10:00", "11:00", "12:00", "13:00", "14:00", "14:30", "19:00", "19:30", "20:00", "21:00", "21:30", "22:00", "22:30"};
    public String dias[] = {"viernes" + "sabado" + "domingo"};

//contructor de una persona
    public Reserva(String nombre, String apellido, int fecha, int hora, int numeroComensales, String motivo, int iD) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroComensales = numeroComensales;
        this.motivo = motivo;
        this.iD = iD;
        this.fecha=fecha;
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

    public int getiD() {
        return iD;
    }

    public String getApellido() {
        return apellido;
    }

    public String[] getHorario() {
        return horario;
    }

    public String[] getDias() {
        return dias;
    }
    

}
