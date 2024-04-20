package data;


class Employee2 implements java.io.Serializable {
    private int id;
    private String name;

    public Employee2() {
        // Constructor
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

/* 
public class Employee{
    public static void main(String[] args) {
        Employee2 e = new Employee2();
    
        e.setName("gulshan");
    
        System.out.println(e.getName());
    }
    }
    */