package cn.graph.site.entity.neo4j.relationship.people_to_people;


import cn.graph.site.entity.neo4j.entity.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

/**
 * 关系  --> 儿子
 * 1. callSuper = true，根据子类自身的字段值和从父类继承的字段值 来生成hashcode，当两个子类对象比较时，只有子类对象的本身的字段值和继承父类的字段值都相同，equals方法的返回值是true。
 * 2. callSuper = false，根据子类自身的字段值 来生成hashcode， 当两个子类对象比较时，只有子类对象的本身的字段值相同，父类字段值可以不同，equals方法的返回值是true。
 * @author heWen
 */
@RelationshipProperties
@Data
@EqualsAndHashCode(of = {"label"}, callSuper = false)
public class Son {
    @TargetNode
    private Person person;

    @Property
    private String label = "Son";

}
