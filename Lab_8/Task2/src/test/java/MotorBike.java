public class MotorBike extends Vahicle{
    public MotorBike(double distanceKM,int timeMinutes,int numberOfPassengers){
        this.distanceKM=distanceKM;
        this.timeMinutes=timeMinutes;
        this.numberOfPassengers=numberOfPassengers;
    }
    @Override
    public double perHeadFare() {
        double fare=Math.max(25, distanceKM * 20) / numberOfPassengers;
        return fare - (fare % 5);
    }

    @Override
    public boolean canTakeTrip() {
        return numberOfPassengers>1 &&numberOfPassengers <= 1 && distanceKM <= 10;
    }
}
