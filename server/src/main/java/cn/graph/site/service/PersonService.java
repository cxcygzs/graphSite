package cn.graph.site.service;

import cn.graph.site.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/2
 **/
public interface PersonService extends Neo4jRepository<Person, Long> {
    Person findByName(String name);
    List<Person> findByTeammatesName(String name);
}
