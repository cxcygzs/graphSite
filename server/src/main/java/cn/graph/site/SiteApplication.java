package cn.graph.site;

import cn.graph.site.entity.Person;
import cn.graph.site.service.neo4j.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Arrays;
import java.util.List;


@Slf4j
@EnableNeo4jRepositories
@SpringBootApplication
public class SiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiteApplication.class, args);
    }

    @Bean
    CommandLineRunner demo(PersonService personService) {
        return args -> {

            personService.deleteAll();

            Person greg = new Person("Greg");
            Person roy = new Person("Roy");
            Person craig = new Person("Craig");

            List<Person> team = Arrays.asList(greg, roy, craig);

            log.info("Before linking up with Neo4j...");

            team.stream().forEach(person -> log.info("\t" + person.toString()));

            personService.save(greg);
            personService.save(roy);
            personService.save(craig);

            greg = personService.findByName(greg.getName());
            greg.worksWith(roy);
            greg.worksWith(craig);
            personService.save(greg);

            roy = personService.findByName(roy.getName());
            roy.worksWith(craig);
            // We already know that roy works with greg
            personService.save(roy);

            // We already know craig works with roy and greg

            log.info("Lookup each person by name...");
            team.stream().forEach(person -> log.info(
                    "\t" + personService.findByName(person.getName()).toString()));

            List<Person> teammates = personService.findByTeammatesName(greg.getName());
            log.info("The following have Greg as a teammate...");
            teammates.stream().forEach(person -> log.info("\t" + person.getName()));
        };
    }

}
