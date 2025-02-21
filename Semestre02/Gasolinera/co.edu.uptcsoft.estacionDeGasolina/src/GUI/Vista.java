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
        while (nivel > cap || nivel < 0){
            System.out.println("El nivel del tanque no puede ser mayor que la capacidad del tanque, intentelo de nuevo: ");
            nivel = sc.nextByte();
        }

        //Creando el vehículo
        Vehiculo veh1 = new Vehiculo(cap, nivel,tipo);
        System.out.println("Su vehiculo tiene las siguientes caracteristicas:");
        System.out.println("Capacidad del tanque: "+veh1.getCapacidad());
        System.out.println("Nivel actual del tanque: "+veh1.getNivel());
        System.out.println("Tipo : "+veh1.getTipo());

        //Diferencia
        int diferencia = veh1.getCapacidad() - veh1.getNivel();
        System.out.print("la diferencia entre el nivel del combustible y la capacidad total, es " + diferencia);
        //Tanqueo
        System.out.println("¿Como desea tanquear su vehiculo?");
        System.out.println("1. Lleno");
        System.out.println("2. Parcial.");
        byte tanqueo = sc.nextByte();
        if (tanqueo == 1){
            System.out.println("El vehiculo se ha tanqueado completamente, thx");
        }else{
            System.out.println("¿Cuanto desea llenar?");
            byte tanqueoParcial = sc.nextByte();
            while (tanqueoParcial >= diferencia || tanqueoParcial < 0){
                System.out.println("El valor tiene que ser menor a la diferencia total, porque sino seria un tanqueo total y no puede ser cero ni negativo.");
                tanqueoParcial = sc.nextByte();
            }
        }
    }
}

