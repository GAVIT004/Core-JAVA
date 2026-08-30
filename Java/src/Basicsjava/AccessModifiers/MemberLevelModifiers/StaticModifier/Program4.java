package Basicsjava.AccessModifiers.MemberLevelModifiers.StaticModifier;

class Student{

    String name;
    int rollNo;
    int marks;
    static String collageName;

    public String getstudentInfo(){
        return name+""+marks;
    }

    public static int getAverage(int x,int y){
        return x+y/2;
    }

    public static String getCollageInfo(){
        return collageName;
    }

    public String getCompleteInfo(){
        return name+" "+rollNo+""+marks+""+collageName;
    }
}
public class Program4 extends Student{

    public static void main(String[] args) {

        Student student=new Student();
        student.getstudentInfo();
        Student.getAverage(10,20);
        Student.getCollageInfo();
        student.getCompleteInfo();
    }
}
