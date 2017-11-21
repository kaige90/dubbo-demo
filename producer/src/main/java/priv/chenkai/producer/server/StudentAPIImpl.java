package priv.chenkai.producer.server;

import org.springframework.beans.factory.annotation.Autowired;
import priv.chenkai.producer.client.StudentAPI;
import priv.chenkai.producer.client.bo.StudentBo;
import priv.chenkai.producer.service.StudentService;

import java.util.List;

/**
 * Created by chenkai on 2017/11/21.
 */
public class StudentAPIImpl implements StudentAPI{
    @Autowired
    private StudentService studentService;

    @Override
    public List<StudentBo> getList() {
        return studentService.getList();
    }
}
