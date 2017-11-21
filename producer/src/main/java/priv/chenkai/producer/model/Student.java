package priv.chenkai.producer.model;

/**
 * 学生
 * Created by chenkai on 2017/11/21.
 */
public class Student {
    private String name;    //姓名
    private Integer age;    //年龄
    private String sex; //性别
    private String mobile;  //手机

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
