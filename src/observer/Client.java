package observer;

public class Client {
    public static void main(String[] args){
        WeatherStation station = new WeatherStation();

        Observer o = null;
        for (int i=0; i<5; i++){
            o = new WeatherDisplay(station);
            station.attachObserver(o);
        }

        station.setTemperature(99.0f);

        station.detachObserver(o);
        station.setTemperature(100.0f);
    }
}
