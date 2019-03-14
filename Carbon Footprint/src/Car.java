public class Car implements CarbonFootprint {
    double a,c;

    public Car(){

    }

    public Car(double a){
        this.a= a;
    }
    @Override
    public void getCarbonFootprint() {
        this.c=a*20;
        System.out.println("Car: "+c+" Pounds of Carbon Footprint.");

    }


}