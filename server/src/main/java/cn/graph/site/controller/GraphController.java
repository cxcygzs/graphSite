package cn.graph.site.controller;

import cn.graph.site.entity.neo4j.entity.Person;
import cn.graph.site.service.neo4j.PersonService;
import org.neo4j.cypherdsl.core.*;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/1
 **/
@RestController
@ResponseBody
public class GraphController {
    @Autowired
    PersonService personService;
    @Autowired
    Driver driver;

    @GetMapping("/test")
    public Collection<Person> test() {
        Node a = Cypher.node("Person");
        Node b = Cypher.node("Person");
        Relationship relationship = a.relationshipBetween(b);

        ResultStatement statement = Cypher.match(relationship).returning(a.getRequiredSymbolicName(),
                Functions.collect(relationship),
                Functions.collect(b)).build();
        Collection<Person> all = personService.findAll(statement);
        return all;
    }

    @GetMapping("person/get")
    public Person getPerson(@RequestParam String name) {
        return personService.findByName(name);
    }
}
