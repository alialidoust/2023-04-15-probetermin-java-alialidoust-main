package at.spengergasse.ft2021pos1.part1.persistance;

import at.spengergasse.ft2021pos1.part1.domain.Test;
import at.spengergasse.ft2021pos1.part1.persistance.projections.TestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {

    @Query("SELECT  COUNT(t),t.testKitType, t.result " +
            "FROM Test t " +
            "WHERE t.testTimeStamp BETWEEN :startDate AND :endDate " +
            "GROUP BY t.testKitType, t.result")

    List<TestDto> getTestStatisticsByTimePeriod(LocalDateTime startDate, LocalDateTime endDate);


}
