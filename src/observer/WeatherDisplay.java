package observer;

public class WeatherDisplay implements Observer {

    private WeatherStation weatherStation;
    private String id;

    public WeatherDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
        this.id = this.toString();
    }

    @Override
    public void update() {
        System.out.println(id + " was notified of state change in weather station (Subject): " + this.weatherStation.getTemperature().toString());
    }
}
