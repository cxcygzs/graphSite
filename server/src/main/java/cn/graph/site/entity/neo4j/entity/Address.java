package cn.graph.site.entity.neo4j.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

/**
 * {@code @author:} xl
 * {@code @date:} 2022/12/5
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Node(value = "Address", primaryLabel = "Address")
public class Address {

    @Property
    private String name;

    @Property
    private String belong_to;

    @Relationship(value = "Home" , direction = Relationship.Direction.INCOMING)
    private String  home;

    @Relationship(value = "WorkUnit" , direction = Relationship.Direction.INCOMING)
    private String  workunit;

    @Relationship(value = "Stopover" , direction = Relationship.Direction.INCOMING)
    private String  stopover;



}
