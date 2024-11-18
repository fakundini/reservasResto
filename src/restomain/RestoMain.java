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
        System.out.println("EL SECRETO DE LA NONA");
       //Aqui coloque un  bucle do while con la condicion de que el booleano "siSr" sea "true" para que siga funcionando y se salga cuando el usuario seleccione, la opcion "salir" 
        do {
            System.out.println("1- Cliente " + "\n" + "2- Local" + "\n" + "3- Salir");
            rA = f.nextInt();
            //Para el menu decidi cambiar el if anidado por un switch, ya  que me parece mas eficiente y organizado, e incluso practico en el caso de que desee agregar otra opcion 
            switch (rA) {
                case 1:
                    System.out.println("1- hacer reserva" + "\n" + "2- cancelar reserva"+"\n"+"3- Actualizar reserva");
                    rB = f.nextInt();
                    //Aqui desarrolle el menu de Reservas, con el cual el usuario puede crear una reserva, darla de baja, o actualizarla
                    if (rB == 1) {
                        //  Aqui se crea un objeto "nuevaReserva", mediante el metodo "crearReserva"
                        Reserva nuevaReserva = metodosDelResto.crearReserva(nombre, apellido, hora, fecha, numeroComensales, motivo);
                        lista.add(nuevaReserva);
                    } else if (rB == 2) {
                        metodosDelResto.CancelarReserva(ID, lista);
                    } else if (rB == 3) {
                        metodosDelResto.actualizarReserva(ID, numeroComensales, fecha, hora, nombre, motivo, apellido, claveLocal, lista, horario, dias);
                    }
                    break;
                case 2:
                    //Este es el menu del local. que pide una contraseña ya establesida(claveLocal) "52645341", y si es correcta, muestra el listado de reservas alojado en el ArrayList "lista"
                    System.out.println("Ingrese la clave");
                    auxClave = f.nextInt();
                    while (claveLocal != auxClave) {
                        System.out.println("La contraseña es incorrecta, ingrecela nuevamente");
                        auxClave = f.nextInt();
                    }
                    System.out.println("Contraseña correcta");
                    metodosDelResto.mostrarReservas(lista);
                    break;
                case 3:
                    siSr = false;
                    break;
            }
            
        } while (siSr);
        
    }
    
}
