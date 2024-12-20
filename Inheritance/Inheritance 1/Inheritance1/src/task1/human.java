package task1;

public class human  {
    protected String name;
    protected String lastname;
    protected int age;

    human(String name , String lastname , int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name : " + name + "\n" + "Lastname : " + lastname + "\n"+ "Age" + age;
    }
}
