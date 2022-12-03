package cn.graph.site.service.neo4j;


import cn.graph.site.entity.neo4j.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/2
 **/
public interface PersonService extends Neo4jRepository<Person, String> {
    Person findByName(String name);


    List<Person> findAllByHusbandLabel(String name);

    List<Person> findAllByHusbandPersonName(String name);
}
