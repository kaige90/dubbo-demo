package priv.chenkai.producer.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenkai on 2017/11/20.
 */
@RestController
public class Index {

    @GetMapping("/")
    public String index(){
        return "init success !";
    }

    @GetMapping("/test")
    public JSONObject test(){
        JSONObject json = new JSONObject();
        json.put("result",0);
        json.put("message","测试成功！");
        return json;
    }

}
