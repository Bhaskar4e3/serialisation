package Serialisation;

import java.io.Serializable;

public class EmployeS implements Serializable {

    
    private static final long serialVersionUID=1L;

    private int id;
    private String name;

    public EmployeS(){

    }
    
    public EmployeS(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "EmployeS [id=" + id + ", name=" + name + "]";
    }

    
    
}
