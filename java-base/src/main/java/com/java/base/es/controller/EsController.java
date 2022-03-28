package com.java.base.es.controller;

import com.java.base.es.model.Stu;
import com.java.base.es.service.StuRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@Controller
@RequestMapping("/es")
public class EsController {

    @Resource
    private StuRepository stuRepository;

    @RequestMapping("/save")
    public void saveStu() {
        Stu stu = new Stu();
        stu.setId(1L);
        stu.setUsername("panbin");
        stu.setRemark("ahsaasdfsa");
        stuRepository.save(stu);
    }


    @RequestMapping("/get")
    public String getValue() {
        Iterable<Stu> stuRepositoryAll = stuRepository.findAll();
        List<Stu> stuList = new ArrayList<>();
        stuRepositoryAll.forEach(data -> {
            stuList.add(data);
        });
        return "成功";
    }
}
