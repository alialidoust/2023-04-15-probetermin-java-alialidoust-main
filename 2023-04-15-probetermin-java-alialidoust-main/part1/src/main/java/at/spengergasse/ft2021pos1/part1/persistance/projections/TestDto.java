package at.spengergasse.ft2021pos1.part1.persistance.projections;

import at.spengergasse.ft2021pos1.part1.domain.Test;
import at.spengergasse.ft2021pos1.part1.domain.TestKitType;
import at.spengergasse.ft2021pos1.part1.domain.TestResult;

public record TestDto(Integer Anzahl, TestKitType testKitType,TestResult testResult) {



}
