package cn.graph.site.entity.response;

import cn.hutool.core.map.MapUtil;
import lombok.Data;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/5
 **/
public class NodeResponse {
    private NodeEntity p;

    private static class NodeEntity {
        private NodeContent start;
        private NodeContent end;
        private List<Segment> segments;
        private Double length = 1.0;
    }

    private static class Segment {
        private NodeContent start;
        private NodeContent end;
        private RelationshipContent relationship;
    }

    @Data
    public static class NodeContent {
        private String identity;
        private List<String> labels;
        private Map<String, Object> properties = MapUtil.newConcurrentHashMap();
    }

    @Data
    public static class RelationshipContent {
        private Long identity;
        private String start;
        private String end;
        private String type;
        private Map<String, Object> properties;
    }
}
