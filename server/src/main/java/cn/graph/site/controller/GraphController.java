package cn.graph.site.controller;

import cn.graph.site.entity.Person;
import cn.graph.site.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @author:} wfy
 * {@code @date:} 2022/12/1
 **/
@RestController
@ResponseBody
public class GraphController {
    @Autowired
    PersonService personService;

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }

    @GetMapping("person/get")
    public Person getPerson(@RequestParam String name) {
        return personService.findByName(name);
    }
}
