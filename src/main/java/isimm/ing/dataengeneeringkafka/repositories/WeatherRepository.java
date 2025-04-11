package isimm.ing.dataengeneeringkafka.repositories;

import isimm.ing.dataengeneeringkafka.entities.WeatherData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherRepository extends MongoRepository<WeatherData,String> {
}
