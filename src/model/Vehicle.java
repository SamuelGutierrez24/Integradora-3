package model;

public abstract class Vehicle {

    protected double base_price;

    protected double sellPrice;

    protected String mark;

    protected String model;

    protected double cilinderCapacity;

    protected int kilometers;

    protected VehicleType type;

    protected String licensePlate;

    protected Documents [] documents;


        public Vehicle(double base_price,String mark,String model, double cilinderCapacity, int kilometers, VehicleType type, String licensePlate, Documents [] documents ){
            this.base_price = base_price;
            this.mark = mark;
            this.model = model;
            this.cilinderCapacity = cilinderCapacity;
            this.kilometers = kilometers;
            this.type = type;
            this.licensePlate = licensePlate;
            this.documents = documents;
        }

        public abstract double calculateSellPrice();

        public String toString(){
            return  "Base price : " + base_price + 
            "\n Brand : " + mark + 
            "\n Model : " + model +
            "\n Cilinder capacity :" + cilinderCapacity +
            "\n kilometers : " + kilometers +
            "\n The car is :" + type +
            "\n License plate = " + licensePlate +
            "\n Docuemnts list : " + "\n" + docuString() + "\n";
        }

        public String docuString(){
            String out = "";
            for(int i = 0;i<3;i++){
                if(documents[i] !=null)
                out += documents[i].toString();
            }
            return out;
        }

        public VehicleType getVehicleType(){
            return type;
        }
    
}
