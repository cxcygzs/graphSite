package cn.graph.site.service.neo4j;

import cn.graph.site.entity.neo4j.relationship.people_to_people.Husband;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/3
 **/
public interface HusbandService extends Neo4jRepository<Husband, Long> {
}
