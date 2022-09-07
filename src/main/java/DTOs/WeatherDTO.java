package DTOs;

public class WeatherDTO {
    private CurrentDataDTO CurrentData;
    private String LocationName;

    public WeatherDTO(CurrentDataDTO currentDataDTO, String locationName) {
        this.CurrentData = currentDataDTO;
        this.LocationName = locationName;
    }

    @Override
    public String toString() {
        return "WeatherDTO{" +
                "currentDataDTO=" + CurrentData +
                ", locationName='" + LocationName + '\'' +
                '}';
    }
}
