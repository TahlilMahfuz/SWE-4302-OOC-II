public class Student {
    public String id,name;
    StudentProgram program;
    double cgpa;

    public Student(String name, double cgpa) {
        this.name=name;
        this.cgpa=cgpa;
    }
    public String setId(String id) throws InvalidStudentIDException{
        if(id.length()==9){
            return this.id=id;
        }
        else throw new InvalidStudentIDException("Invalid Id!");
    }
    public void study(){
        System.out.println("I am studying");
    }
    public void play(){
        System.out.println("I am playing");
    }
}
