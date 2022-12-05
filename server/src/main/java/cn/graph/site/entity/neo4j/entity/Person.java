package cn.graph.site.entity.neo4j.entity;

import cn.graph.site.entity.neo4j.AbstractEntity;
import cn.graph.site.entity.neo4j.relationship.people_to_people.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/3
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Node(value = "Person", primaryLabel = "Person")
public class Person extends AbstractEntity {
    @Property
    private String name;

    @Property
    private Integer age;
    @Property
    private String sex;

    @Relationship(value = "Husband", direction = Relationship.Direction.OUTGOING)
    private Husband husband;

    @Relationship(value = "son", direction = Relationship.Direction.OUTGOING)
    private Son son;

    @Relationship(value = "daughterInLaw", direction = Relationship.Direction.OUTGOING)
    private DaughterInLaw daughterInLaw;

    @Relationship(value = "eldestGranddaughter", direction = Relationship.Direction.OUTGOING)
    private EldestGranddaughter eldestGranddaughter;

    @Relationship(value = "secondGranddaughter", direction = Relationship.Direction.OUTGOING)
    private SecondGranddaughter secondGranddaughter;

    @Relationship(value = "daughter", direction = Relationship.Direction.OUTGOING)
    private Daughter daughter;

    @Relationship(value = "grandson", direction = Relationship.Direction.OUTGOING)
    private Grandson grandson;

    @Relationship(value = "mother", direction = Relationship.Direction.OUTGOING)
    private Mother mother;

    @Relationship(value = "brothers", direction = Relationship.Direction.OUTGOING)
    private Brothers brothers;

    @Relationship(value = "bigSister", direction = Relationship.Direction.OUTGOING)
    private BigSister bigSister;

    @Relationship(value = "friend", direction = Relationship.Direction.OUTGOING)
    private Friend friend;

    @Relationship(value = "boss", direction = Relationship.Direction.OUTGOING)
    private Boss boss;

    @Relationship(value = "doctor", direction = Relationship.Direction.OUTGOING)
    private Doctor doctor;

    @Relationship(value = "sameMeal", direction = Relationship.Direction.OUTGOING)
    private SameMeal sameMeal;

    @Relationship(value = "nucleicAcidHomotubule", direction = Relationship.Direction.OUTGOING)
    private NucleicAcidHomotubule nucleicAcidHomotubule;

    @Relationship(value = "staff", direction = Relationship.Direction.OUTGOING)
    private Staff staff;

    @Relationship(value = "father", direction = Relationship.Direction.OUTGOING)
    private Father father;
}

