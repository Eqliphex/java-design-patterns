import lombok.Data;

@Data
public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanges() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();


    }

}
