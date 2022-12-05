package cn.graph.site.entity.response;

import cn.graph.site.entity.neo4j.AbstractEntity;
import cn.graph.site.entity.neo4j.entity.Person;
import cn.graph.site.entity.neo4j.relationship.people_to_people.Husband;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.ReflectUtil;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/5
 **/
@Slf4j
public class ResponseUtil {
    @SneakyThrows
    public static NodeResponse transform(AbstractEntity abstractEntity) {
        // 1.构造实体节点
        buildNode(abstractEntity);

        // 2.遍历关系
        Field[] fields = ReflectUtil.getFields(Person.class);
        for (Field field : fields) {
            field.setAccessible(true);

            // 3.找到关系
            if (field.isAnnotationPresent(Relationship.class)) {
                Object relationship = ReflectUtil.getFieldValue(abstractEntity, field);

                // 4.构造关系节点
            }

        }

        return null;
    }
    @SneakyThrows
    public static NodeResponse.RelationshipContent buildRelationship(Object target){
        NodeResponse.RelationshipContent relationshipContent = new NodeResponse.RelationshipContent();
        Object label = ReflectUtil.getFieldValue(target, "label");
//        relationshipContent.setType();

        Field[] fields = ReflectUtil.getFields(target.getClass());
        for (Field field : fields) {

        }
        return null;
    }


    @SneakyThrows
    public static NodeResponse.NodeContent buildNode(Object target) {
        Field[] fields = ReflectUtil.getFields(target.getClass());
        NodeResponse.NodeContent node = new NodeResponse.NodeContent();
        node.setIdentity(Convert.convert(String.class, ReflectUtil.getFieldValue(target, "id")));
        Node annotation = target.getClass().getAnnotation(Node.class);
        String label = annotation.primaryLabel();
        node.setLabels(ListUtil.of(label));
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Relationship.class)) {
                continue;
            }
            Object value = ReflectUtil.getFieldValue(target, field);
            if (ObjectUtil.isNull(value)){
                continue;
            }
            node.getProperties().put(field.getName(), value );
        }
        log.info("构造节点对象为{}", node);
        return node;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(89);
        Husband husband = new Husband();
        husband.setId(23423L);
        person.setId("idxxxxxxxx");
        person.setHusband(husband);
        transform(person);
    }
}
