package model;

import java.util.ArrayList;

    public class Sistem{

        private String hola;

        private ArrayList<Vehicle>vehicles;

        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_RESET = "\u001B[0m";

        public Sistem(String hola){
            this.hola = hola;
            vehicles = new ArrayList<Vehicle>();
        }

        public String addMotocycle(double base_price,String mark,String model, double cilinderCapacity, int kilometers, int type, String licensePlate,int motoType, int tankCapacity,double soatPrice, int soatYear, double coverage, double tecnoPrice,int tecnoYear, double carGases,double properPrice,int properYear){

            String out=""; 


            VehicleType isUsed = null;

            switch(type){
                case 1 :
                    isUsed = VehicleType.NEW;
                break;
                case 2 :
                    isUsed = VehicleType.USED;
                break;
            }

            MotocycleType typeMoto = null;

            switch(motoType){
                case 1 :
                    typeMoto = MotocycleType.ESTANDAR;
                break;
                case 2 :
                    typeMoto = MotocycleType.SPORT;
                break;
                case 3 :
                    typeMoto = MotocycleType.SCOOTER;
                break;
                case 4 :
                    typeMoto = MotocycleType.CROSS;
                break;
            }

           // LLenar documentos
            Documents [] documents = new Documents[3];

            if(soatPrice != -1 && soatYear != -1){
                documents [0] = new Soat(soatPrice,soatYear,coverage);
            }

            if(tecnoPrice != -1 && tecnoYear != -1){
                documents [1] = new Tecnomechanic(tecnoPrice, tecnoYear, carGases);
            }
            if(properPrice != -1 && properYear != -1){
                documents[2] = new PropertyCard(properPrice, properYear);
            }


           Motocycle aMoto = new Motocycle(base_price, mark, model, cilinderCapacity, kilometers, isUsed, licensePlate, documents, typeMoto, tankCapacity);

            vehicles.add(aMoto);
            out = "ID of the moto: " + vehicles.indexOf(aMoto) + " \n  The Moto was succesfully registered! \n";

            return out;

        }
        
        
       
        public boolean proveType(int type){

            boolean out = false;

            if(type != 0){
                if(type == 1 || type == 2){
                    out = true;
                }
            }
            return out;
        }

        public boolean proveMotoType(int motoType){
            
            boolean out = false;

            if(motoType!=0){
                if(motoType == 1 || motoType == 2 || motoType == 3 || motoType==3){
                    out = true;
                }
            }
            return out;

        }

        public String addGasCar(double base_price,String mark,String model, double cilinderCapacity, int kilometers, int type, String licensePlate,int carType, int numDoors, boolean polarice,int gasType, int tankCapacity, double soatPrice, int soatYear, double coverage, double tecnoPrice,int tecnoYear, double carGases,double properPrice,int properYear){

            String out=""; 

            

            VehicleType isUsed = null;

            switch(type){
                case 1 :
                    isUsed = VehicleType.NEW;
                break;
                case 2 :
                    isUsed = VehicleType.USED;
                break;
            }

            CarType typeCar = null;

            switch(carType){
                case 1 :
                    typeCar = CarType.SEDAN;
                break;
                case 2:
                    typeCar = CarType.TRUCK;
                break;
            }

            GasolineType gas = null;

            switch(gasType){
                case 1:
                    gas = GasolineType.DIESEL;
                break;
                case 2 :
                    gas = GasolineType.PREMIUM_GAS;
                break;
                case 3:
                    gas = GasolineType.REGULAR_GAS;
                break;

            }

            // LLenar documentos
            Documents [] documents = new Documents[3];

            if(soatPrice != -1 && soatYear != -1){
                documents [0] = new Soat(soatPrice,soatYear,coverage);
            }

            if(tecnoPrice != -1 && tecnoYear != -1){
                documents [1] = new Tecnomechanic(tecnoPrice, tecnoYear, carGases);
            }
            if(properPrice != -1 && properYear != -1){
                documents[2] = new PropertyCard(properPrice, properYear);
            }

            GasolineCar aCar = new GasolineCar(base_price, mark, model, cilinderCapacity, kilometers, isUsed, licensePlate,documents , typeCar, numDoors, polarice, gas, tankCapacity);
            vehicles.add(aCar);
            
             out = " \u001B[31m ID of the car: \u001B[0m " + vehicles.indexOf(aCar) + " \n The car was successfully registered! \n";
            return out;
        }

        public String addElectricCar(double base_price,String mark,String model, double cilinderCapacity, int kilometers, int type, String licensePlate,int carType, int numDoors, boolean polarice,int charger, double batteryDuration,double soatPrice, int soatYear, double coverage, double tecnoPrice,int tecnoYear, double carGases,double properPrice,int properYear){
            
            String out = "";

        
            VehicleType isUsed = null;

            switch(type){
                case 1 :
                    isUsed = VehicleType.NEW;
                break;
                case 2 :
                    isUsed = VehicleType.USED;
                break;
            }

            CarType typeCar = null;

            switch(carType){
                case 1 :
                    typeCar = CarType.SEDAN;
                break;
                case 2:
                    typeCar = CarType.TRUCK;
                break;
            }

            ChargerType typeCharger = null;

            switch(charger){
                case 1:
                    typeCharger = ChargerType.FAST;
                break;
                case 2:
                    typeCharger = ChargerType.NORMAL;
                break;
            }


            // LLenar documentos
            Documents [] documents = new Documents[3];

            if(soatPrice != -1 && soatYear != -1){
                documents [0] = new Soat(soatPrice,soatYear,coverage);
            }

            if(tecnoPrice != -1 && tecnoYear != -1){
                documents [1] = new Tecnomechanic(tecnoPrice, tecnoYear, carGases);
            }
            if(properPrice != -1 && properYear != -1){
                documents[2] = new PropertyCard(properPrice, properYear);
            }

            ElectricCar aElectric = new ElectricCar(base_price, mark, model, cilinderCapacity, kilometers, isUsed, licensePlate, documents, typeCar, numDoors, polarice, typeCharger, batteryDuration);

            vehicles.add(aElectric);

            out = "ID of the car: " + vehicles.indexOf(aElectric) + " \n The Electric car was successfully registered! \n";
                
            return out;

        }

        public String addHybridCar(double base_price,String mark,String model, Double cilinderCapacity, int kilometers, int type, String licensePlate,int carType, int numDoors, boolean polarice,int gasType, int tankCapacity,int charger, double batteryDuration,double soatPrice, int soatYear, double coverage, double tecnoPrice,int tecnoYear, double carGases,double properPrice,int properYear){

            String out = "";


            VehicleType isUsed = null;

            switch(type){
                case 1 :
                    isUsed = VehicleType.NEW;
                break;
                case 2 :
                    isUsed = VehicleType.USED;
                break;
            }

            CarType typeCar = null;

            switch(carType){
                case 1 :
                    typeCar = CarType.SEDAN;
                break;
                case 2:
                    typeCar = CarType.TRUCK;
                break;
            }

            ChargerType typeCharger = null;

            switch(charger){
                case 1:
                    typeCharger = ChargerType.FAST;
                break;
                case 2:
                    typeCharger = ChargerType.NORMAL;
                break;
            }

            GasolineType gas = null;

            switch(gasType){
                case 1:
                    gas = GasolineType.DIESEL;
                break;
                case 2 :
                    gas = GasolineType.PREMIUM_GAS;
                break;
                case 3:
                    gas = GasolineType.REGULAR_GAS;
                break;

            }

            // LLenar documentos
            Documents [] documents = new Documents[3];

            if(soatPrice != -1 && soatYear != -1){
                documents [0] = new Soat(soatPrice,soatYear,coverage);
            }

            if(tecnoPrice != -1 && tecnoYear != -1){
                documents [1] = new Tecnomechanic(tecnoPrice, tecnoYear, carGases);
            }
            if(properPrice != -1 && properYear != -1){
                documents[2] = new PropertyCard(properPrice, properYear);
            }

            HybridCar aHybridCar = new HybridCar(base_price, mark, model, cilinderCapacity, kilometers, isUsed, licensePlate, documents, typeCar, numDoors, polarice, gas, tankCapacity, typeCharger, batteryDuration);
            
            vehicles.add(aHybridCar);

            out = "ID of the car: " + vehicles.indexOf(aHybridCar) + " \n The hybrid car was seccessfully registered \n";

            return out;
        }

        public String showOnlyMotos(){
            
            String out = "";

            for(int i = 0;i<vehicles.size();i++){
                if(vehicles.get(i) instanceof Motocycle){
                    out += vehicles.get(i).toString() + "\n";
                }
            }
            return out;
        }

        public String showGasCars(){
            String out = "";

            for(int i = 0;i<vehicles.size();i++){
                if(vehicles.get(i) instanceof GasolineCar){
                    out += vehicles.get(i).toString() + "\n";
                }
            }
            return out;
        }

        public String showElectricCars(){
            String out = "";

            for(int i = 0;i<vehicles.size();i++){
                if(vehicles.get(i) instanceof ElectricCar){
                    out += vehicles.get(i).toString() + "\n";
                }
            }
            return out;
        }

        public String showHybridCars(){
            String out = "";
            
            for(int i = 0;i<vehicles.size();i++){
                if(vehicles.get(i) instanceof HybridCar){
                    out += vehicles.get(i).toString() + "\n";
                }
            }
            return out;
        }

        public String showFuelGasCars(){
           String out = "";
           
            for(int i = 0;i<vehicles.size();i++){
                if(vehicles.get(i) instanceof GasolineConsume){
                    out += vehicles.get(i).toString() + "\n";
                }
            }
            return out;
        }

        public String showBatteryCars(){
            String out = "";

            for(int i = 0;i<vehicles.size();i++){
                if(vehicles.get(i) instanceof BatteryConsume){
                    out += vehicles.get(i).toString() + "\n";
                }
            }
            return out;
        }

        public String showNewVehicles(){
            String out = "";

            for(int i = 0;i<vehicles.size();i++){
                VehicleType isNew = vehicles.get(i).getVehicleType();
                if(isNew == VehicleType.NEW){
                    out += vehicles.get(i).toString() + "\n";
                }
            }
            return out;
        }

        public String showUsedVehicles(){
            String out = "";

            for(int i = 0;i<vehicles.size();i++){
                VehicleType isNew = vehicles.get(i).getVehicleType();
                if(isNew == VehicleType.USED){
                    out += vehicles.get(i).toString() + "\n";
                }
            }
            return out;
        }

        public String documentsReport(int index){

            String out = "";

            if(vehicles.get(index) == null){
                out= "The IID insert is not found :(";
            }else{
                out = vehicles.get(index).reportDocu();
            }

            return out;
        }
    }

        
    