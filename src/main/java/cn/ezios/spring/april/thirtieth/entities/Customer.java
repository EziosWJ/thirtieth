package cn.ezios.spring.april.thirtieth.entities;

/**
 * @ClassName Customer
 * @Description TODO
 * @Date 2019/4/13 22:50
 * @Creaded By Wangj
 */
public class Customer {
    private String id;
    private String name;
    private String wanted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWanted() {
        return wanted;
    }

    public void setWanted(String wanted) {
        this.wanted = wanted;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", wanted='" + wanted + '\'' +
                '}';
    }
}
