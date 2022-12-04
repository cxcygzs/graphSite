package cn.graph.site.entity.neo4j.entity;

import cn.graph.site.entity.neo4j.AbstractEntity;
import cn.graph.site.entity.neo4j.relationship.Husband;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/3
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Node("Person")
public class Person extends AbstractEntity {
    @Property
    private String name;
    @Property
    private Integer age;
    @Relationship(value = "Husband", direction = Relationship.Direction.OUTGOING)
    private Husband husband;
}
