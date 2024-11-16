/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restomain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestoMain {

    public static void main(String[] args) {
        List<Reserva> lista = new ArrayList<Reserva>();
        Scanner f = new Scanner(System.in);
        boolean siSr = true;
        int ID = 0, numeroComensales = 0, fecha = 0, hora = 0, rA = 0, auxClave = 0, claveLocal = 52645341, rB;
        String nombre = "", motivo = "", apellido = "";
        String horario[] = {"10:00", "11:00", "12:00", "13:00", "14:00", "14:30", "19:00", "19:30", "20:00", "21:00", "21:30", "22:00", "22:30"};
        String dias[] = {"viernes", "sabado", "domingo"};

        do {
            System.out.println("1- Cliente " + "\n" + "2- Local" + "\n" + "3- Salir");
            rA = f.nextInt();

            switch (rA) {
                case 1:
                    System.out.println("1- hacer reserva" + "\n" + "2- cancelar reserva");
                    rB = f.nextInt();
                    if (rB == 1) {
                        //  Reserva nuevaReserva = metodosDelResto.crearReserva(nombre, apellido, hora, horario, fecha, numeroComensales, motivo);
                        Reserva nuevaReserva = metodosDelResto.crearReserva(nombre, apellido, hora, fecha, numeroComensales, motivo);
                        lista.add(nuevaReserva);
                    } else if (rB == 2) {
                        metodosDelResto.CancelarReserva(ID, lista);
                    }
                    break;
                case 2:
                    System.out.println("ingrese la clave");
                    auxClave = f.nextInt();
                    while (rA == 2 && claveLocal != auxClave) {
                        System.out.println("tu conntraseña es incorrecta, ingresela nuevamente");
                        auxClave = f.nextInt();
                    }
                    System.out.println("contraseña correcta");
                    metodosDelResto.mostrarReservas(lista);
                    break;
                case 3:
                    siSr = false;
                    break;
            }

        } while (siSr);

    }

}
