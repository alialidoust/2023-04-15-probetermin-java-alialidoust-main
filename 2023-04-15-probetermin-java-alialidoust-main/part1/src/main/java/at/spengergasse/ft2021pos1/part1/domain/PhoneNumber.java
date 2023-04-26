package at.spengergasse.ft2021pos1.part1.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;


@Embeddable
public class PhoneNumber {

    private Integer countryCode;
    private Integer areaCode;
    private Integer serialNumber;

}
