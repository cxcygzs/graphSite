package cn.graph.site.service.domain.impl;

import cn.graph.site.entity.domain.OdsEntityPerson;
import cn.graph.site.entity.neo4j.entity.Person;
import cn.graph.site.mapper.domain.OdsEntityPersonMapper;
import cn.graph.site.service.domain.OdsEntityPersonService;
import cn.graph.site.service.neo4j.PersonService;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangfeiyu
 * @description 针对表【ods_entity_person(人物实体信息)】的数据库操作Service
 * @createDate 2022-12-03 11:29:11
 */
@Service
@Slf4j
public class OdsEntityPersonServiceImpl extends ServiceImpl<OdsEntityPersonMapper, OdsEntityPerson> implements OdsEntityPersonService {

    @Autowired
    PersonService personService;

    @Override
    @Scheduled(cron = "*/10 * * * * ?")
    public void syncNeo4j() {
//        List<OdsEntityPerson> list = this.list();
//        if (ObjectUtil.isEmpty(list)) {
//            return;
//        }
//        for (OdsEntityPerson odsEntityPerson : list) {
//            Person person = Person.builder().name(odsEntityPerson.getName())
//                    .age(odsEntityPerson.getAge()).build();
//            personService.save(person);
//        }
        log.info("sync -> ");
    }
}
