package cn.graph.site.entity.neo4j.relationship.people_to_people;

import cn.graph.site.entity.neo4j.AbstractRelationship;
import cn.graph.site.entity.neo4j.entity.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

/**
 * @author heWen
 * 同餐
 */
@RelationshipProperties
@Data
@EqualsAndHashCode(of = {"label"}, callSuper = false)
public class SameMeal  extends AbstractRelationship {
    @TargetNode
    private Person person;

    @Property
    private String label = "sameMeal";
}
