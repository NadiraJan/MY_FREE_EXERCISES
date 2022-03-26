public class Vehicle {

    //create constructor: cons-r is altijd public
    public Vehicle(String vehicleName, int vehicleMaxSpeed) { //* CONSTR-R
     //   name = vehicleName;
       // maxSpeed = vehicleMaxSpeed;

        this.name = name;// мы обратились к <public String name>
        this.maxSpeed = maxSpeed; //для понимания программы куда мы обращаемся

    }


    public Vehicle() {
//empty constructor
    }



    public String name;

    public int maxSpeed;

    public void Start() {
        System.out.println("Engine started");
    }

    public String Accelerate(int speed) {
        if (speed <= maxSpeed)
            System.out.println("speed increased to " + speed);
        else
            System.out.println("speed is too high!");

        return null;
    }

    public String getVehicleName() {

        return name;


    }
}
//hier zijn de eigenschappen van vehicle