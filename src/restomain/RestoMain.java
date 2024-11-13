/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restomain;

import java.util.Scanner;
import java.util.Random;

public class RestoMain {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int ID, numeroComensales, fecha, hora, rA, auxClave, claveLocal = 52645341;
        String nombre , motivo, apellido;
        String horario[] = {"10:00", "11:00", "12:00", "13:00", "14:00", "14:30", "19:00", "19:30", "20:00", "21:00", "21:30", "22:00", "22:30"};
        System.out.println("1- Cliente" + "\n" + "2- Local");
        rA = f.nextInt();
        if (rA == 1) {
            metodosDelResto.crearReserva(nombre, apellido,numeroComensales,horario,hora,fecha,motivo);
        } else if (rA == 2) {
            System.out.println("ingrese la clave");
            auxClave = f.nextInt();
            while (rA == 2 && claveLocal != auxClave){
                System.out.println("tu conntraseña es incorrecta, ingresela nuevamente");
            }System.out.println("contraseña correcta");
            

        }

    }
}
