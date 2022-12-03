package cn.graph.site.entity.neo4j.entity;

import cn.graph.site.entity.neo4j.AbstractEntity;
import cn.graph.site.entity.neo4j.relationship.Husband;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/3
 **/
@Data
@Node("Person")
public class Person extends AbstractEntity {
    @Property
    private String name;
    @Property
    private Integer age;
    @Relationship(value = "Husband", direction = Relationship.Direction.OUTGOING)
    private Husband husband;
}
