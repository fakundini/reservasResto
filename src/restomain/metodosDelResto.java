/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restomain;

import java.util.Scanner;

public class metodosDelResto {

    int ID, numeroComensales, fecha, hora;
    String nombre, motivo, apellido;
    Reserva reseervas[] = new Reserva[15];
    Scanner f = new Scanner(System.in);
    String horario[] = {"10:00", "11:00", "12:00", "13:00", "14:00", "14:30", "19:00", "19:30", "20:00", "21:00", "21:30", "22:00", "22:30"};

    public static int crearReserva(String nombre, String apellido, int hora, String[] horario, int fecha, int numeroComensales, String motivo) {
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
        Reserva cliente = new Reserva(nombre, apellido, numeroComensales, hora , fecha, motivo);

    }

    public static void CancelarReserva(int ID, String nombre, String apellido) {
    }

    public static Reserva actualizarReserva(int ID, int numeroComensales, int fecha, int hora, String nombre, String motivo, String apellido) {
        return Reserva;
    }

    public static void mostrarReserva(int ID, int numeroComensales, int fecha, int hora, String nombre, String motivo, String apellido) {
    }

    public void mostrarReservas(int ID, int numeroComensales, int fecha, int hora, String nombre, String motivo, String apellido) {
        for (int e = 0; e < reseervas.length; e++) {
            System.out.println((e + 1) + "- " + reseervas[e].fecha + reseervas[e].nombre + " $" + "a las " + reseervas[e].hora + "\n" + reseervas[e].numeroComensales + " invitados, con motivo de " + reseervas[e].motivo);

        }
    }
}
