package at.spengergasse.ft2021pos1.part2.service;

import at.spengergasse.ft2021pos1.part2.persistence.TestRepository;
import at.spengergasse.ft2021pos1.part2.persistence.projections.StatisticDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestService {

    private final TestRepository testRepository;

    public List<StatisticDto> statistic(){

        return null;
    }


}
