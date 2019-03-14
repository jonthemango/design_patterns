package command;

public class Light {
    // RECEIVER

    private int lightPower;

    public Light(){
        this.off();
        System.out.println("Initial Light Level: " + this.level());
    }

    public void on(){
        lightPower = 10;
    }

    public void off(){
        lightPower = 0;
    }

    public void up() { lightPower++; }

    public void down(){
        lightPower--;
    }

    public String level() {
        return String.valueOf(lightPower);
    }


}
