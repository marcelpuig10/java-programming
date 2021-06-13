package day53_inheritance.Tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla...", "Model Y", 48190.0 , 2021, 326 );
        ec1.drive(50);
        System.out.println(ec1.toString());
        //System.out.println(ec1.make);
        //System.out.println(ElectricCar.make);
        System.out.println("ec1 make = " + ec1.getMake("tesla"));
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year = " + ec1.getPrice());
        System.out.println("ec1 range = " + ec1.getRange());

        if(ec1.getPrice() > 10000){
            //System.out.println(ec1.getMake() + " " + );
        }else{
            System.out.println("purchasing " + ec1.toString());
        }

        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla", " cybertruck" , 59900 , 2022 , 300);

        System.out.println(ec2.toString());
        System.out.println("count = " + ec2.getCount());
        System.out.println("count = " + ElectricCar.getCount());

        ModelX myModelX = new ModelX("Tesla" , "Model X", 89990.0, 2021 , 360);
        System.out.println(myModelX.toString());
        myModelX.drive(10);
        System.out.println("Having lunch...");
        myModelX.drive(10);
        //System.out.println("Range remaining = " + myModelX.);
        System.out.println("Range remaining = " + myModelX.getRange());
        System.out.println("Total electric cars count = " + ElectricCar.getCount());






    }
}
