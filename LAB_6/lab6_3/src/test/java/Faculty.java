public class Faculty extends Person{
    public String designation;
    @Override
    public String toString() {
        return "Faculty:"+name+" "+age+" "+address+" "+designation;
    }
}
