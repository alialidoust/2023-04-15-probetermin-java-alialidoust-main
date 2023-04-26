package at.spengergasse.ft2021pos1.part1.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Person extends AbstractPersistable<Long> {

    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private Integer socialSecurityNumber;
    private String eMail;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name ="countryCode", column = @Column(name = "mobile_country_code")),
            @AttributeOverride(name = "areaCode", column = @Column(name = "mobile_area_code")),
            @AttributeOverride(name = "serialNumber", column = @Column(name = "mobile_serial_number", length=16)),
    })
    private PhoneNumber phoneNumber;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_person_address"))
    private Address address;

}
