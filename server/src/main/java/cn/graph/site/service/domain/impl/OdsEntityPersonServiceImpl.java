package cn.graph.site.service.domain.impl;

import cn.graph.site.entity.domain.OdsEntityPerson;
import cn.graph.site.mapper.domain.OdsEntityPersonMapper;
import cn.graph.site.service.domain.OdsEntityPersonService;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author wangfeiyu
* @description 针对表【ods_entity_person(人物实体信息)】的数据库操作Service
* @createDate 2022-12-03 11:29:11
*/
@Service
public class OdsEntityPersonServiceImpl extends ServiceImpl<OdsEntityPersonMapper, OdsEntityPerson> implements OdsEntityPersonService {

}
