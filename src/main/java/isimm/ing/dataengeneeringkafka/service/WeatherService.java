package isimm.ing.dataengeneeringkafka.service;

import isimm.ing.dataengeneeringkafka.entities.Units;
import isimm.ing.dataengeneeringkafka.entities.WeatherData;
import isimm.ing.dataengeneeringkafka.repositories.WeatherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;
@Service
@RequiredArgsConstructor
public class WeatherService {
private final WeatherRepository weatherRepository;
    @Bean
    public Consumer<WeatherData>weatherDataConsumer(){
        return (input)->{
            double temperatureCelsius = (input.getTemperature() - 32) * 5 / 9;
            input.setTemperature(temperatureCelsius);
            double windSpeedKmh = input.getWindSpeed() * 1.60934;
            input.setWindSpeed(windSpeedKmh);
            Units units = new Units();
            units.setTemperature("C");
            units.setWindSpeed("kmh");
            input.setUnits(units);
            System.out.println("Converted weather data: " + input);
            weatherRepository.save(input);
        };
    }
}
