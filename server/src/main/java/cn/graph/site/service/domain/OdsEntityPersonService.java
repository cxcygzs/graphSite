package cn.graph.site.service.domain;

import cn.graph.site.entity.domain.OdsEntityPerson;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.scheduling.annotation.Scheduled;

/**
* @author wangfeiyu
* @description 针对表【ods_entity_person(人物实体信息)】的数据库操作Service
* @createDate 2022-12-03 11:29:11
*/
public interface OdsEntityPersonService extends IService<OdsEntityPerson> {
    /**
     * 定时调度
     */
    @Scheduled(cron = "*/10 * * * * ?")
    void syncNeo4j();
}
