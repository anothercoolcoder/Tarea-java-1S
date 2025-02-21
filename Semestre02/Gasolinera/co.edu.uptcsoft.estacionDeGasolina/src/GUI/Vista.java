package GUI;
import LOGICA.Dispensador;
import LOGICA.Vehiculo;

import java.util.Scanner;
public class Vista {
    public void ingresoInfo(){

        Scanner sc = new Scanner(System.in);

        //Solicitando valores -> Dispensador
        System.out.println("Precio del combustible: ");
        int precio = sc.nextInt();
        Dispensador disp1 = new Dispensador(precio);

        //bienvenida
        System.out.println("Bienvenido usuario");
        System.out.println("El dia de hoy, los precios para el combustible son: $" + precio+ " pesos colombianos (cop) por galon.");

        //tipo
        System.out.println("Por favor, indique el tipo de combustible de su vehiculo");
        System.out.println("1. Gasolina");
        System.out.println("2. Diesel");
        byte tipo = sc.nextByte();


        System.out.println("Capacidad del tanque: (En galones)");
        byte cap = sc.nextByte();
        System.out.println("Nivel del tanque: (En galones)");
        byte nivel = sc.nextByte();

        //Creando el vehículo
        Vehiculo veh1 = new Vehiculo(cap, nivel,tipo);
        System.out.println("Su vehiculo tiene las siguientes caracteristicas:");
        System.out.println("Capacidad del tanque: "+veh1.getCapacidad());
        System.out.println("Nivel actual del tanque: "+veh1.getNivel());
        System.out.println("Tipo : "+veh1.getTipo());

        //Tanqueo
        System.out.println("¿Como desea tanquear su vehiculo?");
        System.out.println("1. Lleno");
        System.out.println("2. Parcial");
        byte tanqueo = sc.nextByte();
        if (tanqueo == 1){
            System.out.println("El vehiculo se ha tanqueado completamente");
        }else{
            System.out.println("El vehiculo se ha tanqueado parcialmente");
        }
    }
}

