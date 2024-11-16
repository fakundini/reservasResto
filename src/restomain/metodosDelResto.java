/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restomain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class metodosDelResto {

    int iD, numeroComensales, fecha, hora, switchModificar;
    String nombre = "", motivo = "", apellido = "";
    List<Reserva> lista = new ArrayList<Reserva>();
    Scanner f = new Scanner(System.in);
    public static String horario[] = {"10:00", "11:00", "12:00", "13:00", "14:00", "14:30", "19:00", "19:30", "20:00", "21:00", "21:30", "22:00", "22:30"};
    public static String dias[] = {"viernes", "sabado", "domingo"};
    //La variables iDCount esta pubica, lo que es algo que no se recomienda en caso de ser un id
    public static int iDCont = 1;

    public static Reserva crearReserva(String nombre, String apellido, int hora, int fecha, int numeroComensales, String motivo) {
        Scanner f = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre = f.nextLine();
        System.out.println("ingrese su apellido");
        apellido = f.nextLine();
        System.out.println("ingrese la cantidad de personas que tiene previsto invitar");
        numeroComensales = f.nextInt();
        System.out.println("seleccione un horario de la siguiente liste e ingrese en que lugar esta" + "\n" + "Ejemplo, si quiero elegir a las 10:00, elijo el  1");
        for (int i = 0; i < horario.length; i++) {
            System.out.println((i + 1) + "- " + horario[i]);
        }
        hora = f.nextInt();
        System.out.println("Seleccione una de las siguientes opciones" + "\n" + "Ejemplo, si quiero elegir el viernes, elijo el  1" + "\n" + "1-viernes" + "\n" + "2-sabado" + "\n" + "3-domingo");
        fecha = f.nextInt();
        System.out.println("a condinuacion describa el motivo del evento, sea solo para comer como para una despedida, casamiento, o cualquier motivo que lo amerite ");
        motivo = f.next();
        int iD = generadorID();
        System.out.println("tu numero de reserva es " + iD + "\n" + "Es importante que recuerde este numero, ya que con el podra modificar su reserva y darla de baja si lo considera necesario");
        Reserva cliente = new Reserva(nombre, apellido, fecha, hora, numeroComensales, motivo, iD);
        List<Reserva> lista = new ArrayList<Reserva>();
        lista.add(new Reserva(nombre, apellido, fecha, hora, numeroComensales, motivo, iD));
        return new Reserva(nombre, apellido, fecha, hora, numeroComensales, motivo, iD);
    }

    public static int generadorID() {
        return iDCont++;
    }

    public static void CancelarReserva(int iD, List<Reserva> lista) {
        Scanner f = new Scanner(System.in);
        System.out.println("ingrese su codigo de reserva");
        iD = f.nextInt();
        lista.remove(iD - 1);
    }

    public static void actualizarReserva(int iD, int numeroComensales, int fecha, int hora, String nombre, String motivo, String apellido, int switchModificar,List<Reserva> lista ) {
        Scanner f = new Scanner(System.in);
        
        System.out.println("ingrese su codigo de reserva");
        iD = f.nextInt();
        System.out.println("seleccione que opcion  quiere modificar");
        switchModificar = f.nextInt();
        System.out.println("1- Modificar fecha" + "\n" + "2-Modificar hora" + "\n" + "3-Modificar motivo");
        switch (switchModificar) {
            case 1:
                System.out.println("seleccione un horario de la siguiente liste e ingrese en que lugar esta" + "\n" + "Ejemplo, si quiero elegir a las 10:00, elijo el  1");
                for (int i = 0; i < horario.length; i++) {
                    System.out.println((i + 1) + "- " + horario[i]);
                }
                hora = f.nextInt();
                lista(iD-1).setHora();
                break;
            case 2:
        }

    }

    public static void mostrarReservas(List<Reserva> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("*** " + lista.get(i).getiD() + "- " + lista.get(i).getNombre() + " " + lista.get(i).getApellido() + " y " + lista.get(i).getNumeroComensales() + " el dia " + dias[lista.get(i).getFecha() - 1] + " a las " + horario[lista.get(i).getHora()] + " ***" + "\n" + "El motivo es ***" + lista.get(i).getMotivo() + "***");
        }
    }
}
