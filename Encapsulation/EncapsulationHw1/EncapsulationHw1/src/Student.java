public class Student {
    private String name;
    private String secondname;
    private int age;
    private int course;
    private float avrgresult;

    Student(String name,String secondname,int age,int course,float avrgresult){
        this.name = name;
        this.secondname = secondname;
        this.age = age;
        this.course = course;
        this.avrgresult = avrgresult;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSecondname(){
        return secondname;
    }
    public void setSecondname(String secondname){
        this.secondname = secondname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getCourse(){
        return course;
    }
    public void setCourse(int course){
        this.course = course;
    }
    public float getAvrgresult(){
        return avrgresult;
    }
    public void setAvrgresult(float avrgresult){
        this.avrgresult = avrgresult;
    }

    public void display(){
        System.out.println("First Name : " + name);
        System.out.println("Last Name : " + secondname);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
        System.out.println("Average Grade : " + avrgresult);
        System.out.println();
        }
    }

