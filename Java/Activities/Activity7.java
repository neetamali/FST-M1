package activities;

public class Activity7 {
	public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        int maxspeed = mb.maxSpeed;
        System.out.println(maxspeed);
        System.out.println(mb.bicycleDesc(maxspeed));
        mb.speedUp(20);
        mb.applyBrake(5);
       
    }
}
