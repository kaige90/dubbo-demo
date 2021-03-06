package priv.chenkai.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.chenkai.producer.client.StudentAPI;
import priv.chenkai.producer.client.bo.StudentBo;

import java.util.List;

/**
 * Created by chenkai on 2017/11/21.
 */
@RestController
public class StudentController {
    @Autowired
    private StudentAPI studentAPI;

    @GetMapping("/api/students")
    public List<StudentBo> getList(){
        List<StudentBo> students = studentAPI.getList();
        return students;
    }

    @GetMapping("/api/test")
    public JSONObject test(){
        JSONObject json = new JSONObject();
        json.put("result",0);
        json.put("message","测试成功！");
        return json;
    }
}
