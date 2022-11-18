public class Drone implements ICameraService,IDronePowerSwitch{
    public void cameraOn() {
        System.out.println("Drone Camera On");
    }
    public void cameraOff() {
        System.out.println("Drone Camera off");
    }


    public void powerOn() {
        System.out.println("Drone power on");
    }


    public void powerOff() {
        System.out.println("Drone power off");
    }
}
