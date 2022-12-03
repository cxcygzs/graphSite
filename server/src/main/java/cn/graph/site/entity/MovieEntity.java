package cn.graph.site.entity;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/2
 **/


@Node("Movie")
public class MovieEntity {

    @Id
    private final String title;

    @Property("tagline")
    private final String description;

//    @Relationship(type = "ACTED_IN", direction = Relationship.Direction.INCOMING)
//    private List<Roles> actorsAndRoles;
//
//    @Relationship(type = "DIRECTED", direction = Relationship.Direction.INCOMING)
//    private List<PersonEntity> directors = new ArrayList<>();

    public MovieEntity(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters omitted for brevity
}

