package dev.yeferson;

import dev.yeferson.model.TollStation;
import dev.yeferson.model.Vehicle;
import dev.yeferson.model.Car;
import dev.yeferson.model.Motorcycle;
import dev.yeferson.model.Truck;
import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        TollStation station = new TollStation("Huerna", "Asturias");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehículo (1: Coche, 2: Moto, 3: Camión):");
        int tipo = scanner.nextInt();

        System.out.println("Ingrese la placa:");
        String placa = scanner.next();

        switch (tipo) {
            case 1:
                station.registerVehicle(new Car(placa));
                break;
            case 2:
                station.registerVehicle(new Motorcycle(placa));
                break;
            case 3:
                System.out.println("Ingrese el número de ejes:");
                int ejes = scanner.nextInt();
                station.registerVehicle(new Truck(placa, ejes));
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                break;
        }

        station.printSummary();

        scanner.close();
    }
}
