package at.spengergasse.ft2021pos1.part1.persistance;

import at.spengergasse.ft2021pos1.part1.domain.Person;
import at.spengergasse.ft2021pos1.part1.domain.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findPersonByPhoneNumber(PhoneNumber phoneNumber);

    List<Person> findAllByAddress_ZipCode(String zipCode);

    List<Person> findAllByAddressContainingIgnoreCase(String Ortsnamensteils);

}
