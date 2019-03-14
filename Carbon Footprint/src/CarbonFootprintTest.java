public abstract class CarbonFootprintTest implements CarbonFootprint {
    public static void main(String[] args) {

        CarbonFootprint[] cf = new CarbonFootprint[3];
        cf[0] = new Bicycle();
        cf[1]= new Car(25.5);
        cf[2]= new Building(22,10,18,20);

        for(int i=0; i<cf.length;i++){
            cf[i].getCarbonFootprint();
        }



        }


    }
