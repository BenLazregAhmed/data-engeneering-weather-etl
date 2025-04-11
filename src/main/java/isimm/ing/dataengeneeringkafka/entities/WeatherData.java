package isimm.ing.dataengeneeringkafka.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Document(collection = "weather_data")
public class WeatherData {

    private String sensorId;
    private Double temperature; // In Fahrenheit
    private Integer humidity; // In percentage
    private Double windSpeed; // In miles per hour
    private String condition;
    private LocalDateTime timestamp;

    private Location location;
    private Units units;

}
