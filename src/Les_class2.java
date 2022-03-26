public class Les_class2 {
    public static void main(String[] args) {

       /* Vehicle myVehicle = new Vehicle();
        myVehicle.maxSpeed = 120;
        myVehicle.Start();
        myVehicle.Accelerate(121);

        Vehicle myVehicle1 = new Vehicle();
        myVehicle1.Start();
        myVehicle1.Accelerate(170);

        System.out.println(myVehicle.hashCode());//hashcode:1705736037
        System.out.println(myVehicle1.hashCode());//hashcode:455659002*/

        Vehicle myVehicle = new Vehicle("bmw", 260); //*constr-r
        System.out.println(myVehicle.name + "," + myVehicle.maxSpeed);

    }
}