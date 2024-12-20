package task1;

public class employ extends human{
    protected String employeid;

    employ(String name, String lastname, int age, String emplyid) {
        super(name, lastname, age);
        this.employeid = emplyid;
    }

    public String getEmplyid() {
        return employeid;
    }

    public void setEmplyid(String emplyid) {
        this.employeid = emplyid;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n" + "Lastname : " + lastname + "\n"+ "Age" + age + "\n" +"Employe id : " +
                employeid;

    }
}
