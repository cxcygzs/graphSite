package cn.graph.site.entity.neo4j.entity;

import cn.graph.site.entity.neo4j.AbstractEntity;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/3
 **/
@Data
@Node("Person2")
public class Person extends AbstractEntity {
    @Property
    private String name;

}
