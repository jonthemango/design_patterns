package observer;

public class WeatherStation extends Subject {

    private Float temperature;

    public void setTemperature(Float temperature){
        System.out.println("Weather Station (Subject) updated it's temperature to: " + temperature.toString());
        this.temperature = temperature;
        this.notifyObservers();
    }

    public Float getTemperature(){
        return this.temperature;
    }
}
