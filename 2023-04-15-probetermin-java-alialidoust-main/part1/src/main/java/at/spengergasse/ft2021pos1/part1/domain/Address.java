package at.spengergasse.ft2021pos1.part1.domain;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Address extends AbstractPersistable<Long>{

    private String streetNumber;
    private String zipCode;
    private String city;
    private String country;
}
