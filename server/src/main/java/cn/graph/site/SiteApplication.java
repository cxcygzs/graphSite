package cn.graph.site;

import cn.graph.site.entity.neo4j.entity.Person;
import cn.graph.site.entity.neo4j.relationship.Husband;
import cn.graph.site.service.neo4j.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@Slf4j
@EnableNeo4jRepositories
@EnableScheduling
@SpringBootApplication
public class SiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiteApplication.class, args);
    }

    @Bean
    CommandLineRunner demo(PersonService personService) {
        return args -> {
            personService.deleteAll();
            Person a = new Person();
            a.setName("a");
            a.setAge(1);


            Person b = new Person();
            b.setName("b");
            b.setAge(2);

            Husband ab = new Husband();
            ab.setPerson(b);

            a.setHusband(ab);

            Person c = new Person();
            c.setAge(3);
            c.setName("c");
            Husband cb = new Husband();
            cb.setPerson(b);
            c.setHusband(cb);

            personService.save(c);
            personService.save(a);
            personService.save(b);

            log.info("husband关系对应的节点是 {}", personService.findAllByHusbandLabel(ab.getLabel()).toString());
            log.info("husband关系对应的节点是 {}", personService.findAllByHusbandPersonName("b").toString());
            for (Person person : personService.findAllByHusbandPersonName("b")) {
                System.out.println(person.getId());
            }
        };
    }

}
