public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double midterm;
    double noteCoefficient;
    double midtermCoefficient;

    Course(String name, String code, String prefix, double noteCoefficient, double midtermCoefficient) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        double note = 0;
        double midterm = 0;
        this.noteCoefficient = noteCoefficient;
        this.midtermCoefficient = midtermCoefficient;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Teacher can not be added to this course!");
        }
    }
    void printTeacher(Teacher teacher){
        System.out.println("=====================");
        this.teacher.print();
    }
}
