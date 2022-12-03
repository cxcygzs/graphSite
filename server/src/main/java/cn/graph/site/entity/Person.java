package cn.graph.site.entity;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/2
 **/
@Data
public class Person {
    @Id
    @GeneratedValue(generatorClass= GeneratedValue.InternalIdGenerator.class)
    private Long id;

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Relationship(type = "TEAMMATE")
    public Set<Person> teammates;

    public void worksWith(Person person) {
        if (teammates == null) {
            teammates = new HashSet<>();
        }
        teammates.add(person);
    }
}
