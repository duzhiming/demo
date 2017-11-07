package com.duzhiming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017/10/23.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlRepsotory girlRepsotory;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "index.html";
    }

    @GetMapping(value = "/girl/save")
    public String save(){
        for(int i=0;i<6;i++){
            Girl girl = new Girl();
            girl.setName("xxx");
            girl.setAge(18);
            girlRepsotory.save(girl);
        }
        return "添加成功";
    }

    @GetMapping(value = "/girl/list")
    public List<Girl> list(){
        List<Girl> list= girlRepsotory.findAll();
        return list;
    }

    @GetMapping(value = "/girl/list")
    public List<Girl> lista(){
        List<Girl> list= girlRepsotory.findAll();
        return list;
    }
}
