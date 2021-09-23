import javax.print.DocFlavor;

public class Student {

    private int id;
    private String name;
    private String postalcode;
    private int age;

    public Student(int id, String name, String postalcode, int age) {
        this.id = id;
        this.name = name;
        this.postalcode = postalcode;
        this.age = age;
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

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", postalcode='" + postalcode + '\'' +
                ", age=" + age
                ;
    }
}
