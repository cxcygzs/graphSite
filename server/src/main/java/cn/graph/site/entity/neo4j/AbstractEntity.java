package cn.graph.site.entity.neo4j;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import java.io.Serializable;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/3
 **/
@Getter
@Setter
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(generatorClass = GeneratedValue.UUIDGenerator.class)
    private String id;
}
