package org.hive.weChat.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Dax
 * @version v1.0.0
 * @since 2017/7/17  14:45
 */


public class Params {
    private String name;
    private int age;
    private boolean flag;

    public Params() {
    }

    public Params(String name, int age, boolean flag) {
        this.name = name;
        this.age = age;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
