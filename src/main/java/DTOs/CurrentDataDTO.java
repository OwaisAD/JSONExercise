package DTOs;

public class CurrentDataDTO {
    private int temperature;
    private int humidity;
    private String skyText;
    private String windText;


    public CurrentDataDTO(int temperature, int humidity, String skyText, String windText) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.skyText = skyText;
        this.windText = windText;
    }

    @Override
    public String toString() {
        return "CurrentDataDTO{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", skyText='" + skyText + '\'' +
                ", windText='" + windText + '\'' +
                '}';
    }
}
