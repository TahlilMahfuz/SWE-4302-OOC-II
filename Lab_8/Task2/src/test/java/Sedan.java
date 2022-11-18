public class Sedan extends Vahicle{
    public Sedan(double distanceKM,int timeMinutes,int numberOfPassengers){
        this.distanceKM=distanceKM;
        this.timeMinutes=timeMinutes;
        this.numberOfPassengers=numberOfPassengers;
    }

    @Override
    public double perHeadFare() {
        double fare=(50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
        return fare - (fare % 5);
    }

    @Override
    public boolean canTakeTrip() {
        return numberOfPassengers>1 && numberOfPassengers <= 4 && distanceKM <= 25;
    }
}
