package ui;

import java.util.ArrayList;

import javax.swing.text.DocumentFilter;

import model.*;

public class InitModel {
    
    public static ArrayList<Vehicle> createVehicles(){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        Documents document1 = new Soat(12000, 2020, 120440);
        Documents document2 = new Tecnomechanic(30000, 2019, 4213);
        Documents document3 = new PropertyCard(21000, 2021);
        
        Documents [] documents = new Documents [3];
        documents [0] = document1;
        documents [1] = document2;
        documents [2] = document3;

        GasolineCar vehicle1 = new GasolineCar(200000, "Nissan", 2011, 70, 120 , VehicleType.USED, "hjk-088", documents, CarType.SEDAN, 4, true, GasolineType.DIESEL, 95);
        vehicles.add(vehicle1);

        Documents document6 = new Soat(12380, 2017, 124540);
        Documents document4 = new Tecnomechanic(10500, 2013, 4213);
        Documents document5 = new PropertyCard(21000, 2015);
        Documents [] documents1 = new Documents [3];
        documents1 [0] = document6;
        documents1 [1] = document4;
        documents1 [2] = document5;
        GasolineCar vehicle2 = new GasolineCar(202000, "Chevrolet", 2014, 50, 86 , VehicleType.USED, "ydh-876", documents1, CarType.TRUCK, 4, true, GasolineType.PREMIUM_GAS, 95);
        vehicles.add(vehicle2);

        Documents document7 = new Soat(92380, 2019, 98540);
        Documents document8 = new Tecnomechanic(6000, 2011, 4213);
        Documents document9 = new PropertyCard(7800, 2005);
        Documents [] documents2 = new Documents [3];
        documents2 [0] = document7;
        documents2 [1] = document8;
        documents2 [2] = document9;
        GasolineCar vehicle3 = new GasolineCar(202000, "Chevrolet", 2011, 50, 86 , VehicleType.USED, "ydh-000", documents2, CarType.TRUCK, 4, true, GasolineType.PREMIUM_GAS, 95);
        vehicles.add(vehicle3);

        
        return vehicles;
    }

}
