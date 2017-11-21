package priv.chenkai.producer.client;

import priv.chenkai.producer.client.bo.StudentBo;

import java.util.List;

/**
 * Created by chenkai on 2017/11/21.
 */
public interface StudentAPI {
    List<StudentBo> getList();
}
