package priv.chenkai.producer.service;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import priv.chenkai.producer.client.bo.StudentBo;

import java.util.List;

/**
 * Created by chenkai on 2017/11/21.
 */
@Service
public class StudentService {
    public List<StudentBo> getList(){
        StudentBo bo1 = new StudentBo();
        bo1.setName("刘德华");
        bo1.setAge(25);
        bo1.setMobile("1231233213212");
        bo1.setSex("男");

        StudentBo bo2 = new StudentBo();
        bo2.setName("宋祖英");
        bo2.setAge(18);
        bo2.setMobile("13591011231");
        bo2.setSex("女");

        return Lists.newArrayList(bo1,bo2);
    }

}
