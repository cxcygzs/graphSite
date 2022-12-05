package cn.graph.site.entity.neo4j.relationship.people_to_address;

import cn.graph.site.entity.neo4j.entity.Address;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

/**
 * 关系->居住地
 * {@code @author:} xl
 * {@code @date:} 2022/12/5
 **/

@RelationshipProperties
@Data
@EqualsAndHashCode(of = {"label"}, callSuper = false)
public class Home {
    @TargetNode
    private Address address;

    @Property
    private String label ="Home";

}
