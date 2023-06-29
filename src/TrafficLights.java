//Write a Java program to create class called "TrafficLight" with attributes for color and duration,
// and methods to change the color and check for red or green.

public class TrafficLights {
    private String color;
    private int Time;

    public TrafficLights(String initialcolor, int initialTime) {
        color = initialcolor;
        Time = initialTime;

    }

    public void setcolor(String newcolor) {
        color = newcolor;
    }

    public void setTime(int newTime) {
        Time = newTime;
    }

    public void changecolortored() {
        color = "RED";
    }

    public void changecolortogreen() {
        color = "GREEN";
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTime() {
        return Time;
    }

    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights("RED", 30);
        System.out.println("initial color:" + trafficLights.getColor());
        System.out.println("initial Time:" + trafficLights.getTime());
        trafficLights.setTime(15);
        System.out.println("Updated Time:" + trafficLights.getTime());
        trafficLights.changecolortogreen();
        System.out.println("Updated Time:" + trafficLights.getColor());
    }
}



