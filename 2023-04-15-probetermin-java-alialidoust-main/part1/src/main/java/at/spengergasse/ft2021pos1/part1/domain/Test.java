package at.spengergasse.ft2021pos1.part1.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Test extends AbstractPersistable<Long>{

    private LocalDateTime testTimeStamp;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_test_person"))
    private Person person;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_test_station"))
    private TestStation station;

    private Integer testBay;
    private TestKitType testKitType;
    private TestResult result;

}
