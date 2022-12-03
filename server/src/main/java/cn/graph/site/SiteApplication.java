package cn.graph.site;

import cn.graph.site.entity.neo4j.entity.Person;
import cn.graph.site.entity.neo4j.relationship.Husband;
import cn.graph.site.service.neo4j.HusbandService;
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
    CommandLineRunner demo(PersonService personService, HusbandService husbandService) {
        return args -> {
            personService.deleteAll();
            Person a = new Person();
            a.setName("a");
            a.setAge(1);


            Person b = new Person();
            b.setName("b");
            b.setAge(2);

            Husband husband = new Husband();
            husband.setPerson(b);

            a.setHusband(husband);
            personService.save(a);
            personService.save(b);

            System.out.println(personService.findAllByHusbandName(husband.getName()));

        };
    }

}
