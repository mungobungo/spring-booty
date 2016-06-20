package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * Created by otaykalo on 6/20/2016.
 */
@Component
public class DummyDataCLR  implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        Stream.of(new Person("Bilbo", "Baggings"), new Person("Gandalf", "tHe GrAy"))
                .forEach(person -> personRepository.save(person));
    }

    @Autowired
    private PersonRepository personRepository;
}
