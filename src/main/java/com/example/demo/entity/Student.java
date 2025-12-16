import com.example.demo.entity;

public class Student{
    private Long id;
    private String name;
    private String email;
    private float cgpa;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setId(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setId(String email){
        this.email=email;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setId(float cgpa){
        this.cgpa=cgpa;
    }
}