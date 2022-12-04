package cn.graph.site.entity.neo4j.relationship;

import cn.graph.site.entity.neo4j.AbstractRelationship;
import cn.graph.site.entity.neo4j.entity.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

/**
 * 关系 -> 丈夫
 * {@code @author:} wfy
 * {@code @date:} 2022/12/3
 **/
@RelationshipProperties
@Data
@EqualsAndHashCode(of = {"label"}, callSuper = false)
public class Husband extends AbstractRelationship {
    @TargetNode
    private Person person;
    @Property
    private String label = "Husband";
}
