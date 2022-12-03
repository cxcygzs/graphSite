package cn.graph.site.entity;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.util.Set;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/2
 **/
@Data
public class Person {
    @Id
    @GeneratedValue(generatorClass = UUIDStringGenerator.class)
    private String id;

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Relationship(type = "TEAMMATE")
    public Set<Person> teammates;

    public void worksWith(Person person) {
        if (ObjectUtil.isNull(teammates)){
            teammates = CollectionUtil.newHashSet();
        }
        teammates.add(person);
    }
}
