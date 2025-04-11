package isimm.ing.dataengeneeringkafka.entities;

import lombok.Data;

@Data
public class Location {

    private String city;
    private String country;
    private Double latitude;
    private Double longitude;

}

