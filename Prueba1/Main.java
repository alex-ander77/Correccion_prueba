package Prueba1;

public class Main {
    public static void main(String[]args){

                Drones d1 = new DronLiviano(
                        "DL01",
                        "MiniFly",
                        10,
                        4,
                        2,
                        3,
                        2
                );

                Drones d2 = new DroneCarga(
                        "DC01",
                        "CargoFly",
                        20,
                        15,
                        4,
                        6,
                        1.20
                );

                Drones d3 = new DroneEmergencia(
                        "DE01",
                        "MedicFly",
                        8,
                        5,
                        2,
                        8,
                        20,
                        2
                );

                d1.mostrarInformacion();
                System.out.println("Datos validos: " + d1.validarDatos());

                System.out.println("----------------");

                d2.mostrarInformacion();
                System.out.println("Datos validos: " + d2.validarDatos());

                System.out.println("----------------");

                d3.mostrarInformacion();
                System.out.println("Datos validos: " + d3.validarDatos());
    }
}
