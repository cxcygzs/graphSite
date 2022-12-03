package cn.graph.site.entity.neo4j;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.io.Serializable;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/3
 **/
@Getter
@Setter
@RelationshipProperties
public abstract class AbstractRelationship implements Serializable {
    @RelationshipId
    private Long id;
}
