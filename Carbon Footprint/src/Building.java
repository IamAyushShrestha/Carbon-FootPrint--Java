public class Building implements CarbonFootprint {
    double squareFoot;
    double basement;
    double concrete;
    double steel;
    double carbonFootprint;

    public Building(){}

    public Building(double SquareFoot,double basement, double concrete,double steel){
        this.squareFoot= SquareFoot;
        this.basement=basement;
        this.concrete= concrete;
        this.steel= steel;
    }

    @Override
    public void getCarbonFootprint() {
        carbonFootprint = squareFoot*50 + 20 * basement +47 * concrete +17*steel;
        System.out.println("Building: "+carbonFootprint +" Pounds of Carbon Footprint.");

    }



}