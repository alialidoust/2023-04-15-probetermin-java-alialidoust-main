package at.spengergasse.ft2021pos1.part1.domain;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class TestStation extends AbstractPersistable<Long> {

    private String stationName;
}
