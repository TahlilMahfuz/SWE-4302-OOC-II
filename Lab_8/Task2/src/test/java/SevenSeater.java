public class SevenSeater extends Vahicle{
    public SevenSeater(double distanceKM,int timeMinutes,int numberOfPassengers){
        this.distanceKM=distanceKM;
        this.timeMinutes=timeMinutes;
        this.numberOfPassengers=numberOfPassengers;
    }
    @Override
    public double perHeadFare() {
        return distanceKM * 30 / numberOfPassengers;
    }

    @Override
    public boolean canTakeTrip() {
        return numberOfPassengers>1 && numberOfPassengers <= 7 && distanceKM >= 10;
    }
}
