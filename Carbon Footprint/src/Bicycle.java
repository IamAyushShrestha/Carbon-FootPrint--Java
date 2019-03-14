public class Bicycle implements CarbonFootprint {
    @Override
    public void getCarbonFootprint() {
        System.out.println("Bicycle: 0 pounds of CO2 ");

    }

    public void calculate(){
        getCarbonFootprint();
    }
    }

