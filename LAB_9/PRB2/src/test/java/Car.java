public class Car implements IEngine,IRadioService,ICameraService{
    public void cameraOn() {
        System.out.println("Camera On");
    }
    public void cameraOff() {
        System.out.println("Camera off");
    }
    public void startEngine() {
        System.out.println("Engine Started");
    }

    public void radioOn() {
        System.out.println("Radio On");
    }

    public void radioOff() {
        System.out.println("Radio Off");
    }
}
