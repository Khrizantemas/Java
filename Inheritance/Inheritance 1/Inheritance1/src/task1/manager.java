package task1;

public class manager extends employ {
   protected String managerid;

    manager(String name, String lastname, int age, String employid, String managerid) {
        super(name, lastname, age, employid);
        this.managerid = managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

   public String getManagerid() {
        return managerid;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n" + "Lastname : " + lastname + "\n"+ "Age" + age + "\n" +"Employe id : " +
                employeid + "\n" + "Manager id : " + managerid;
    }
}
