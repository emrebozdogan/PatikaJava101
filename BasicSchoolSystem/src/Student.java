public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int midterm1, int note2, int midterm2, int note3, int midterm3){
        if(note1 >= 0 && note1 <=100){
            this.c1.note = note1 * this.c1.noteCoefficient;
        }
        if(midterm1 >= 0 && midterm1 <=100){
            this.c1.midterm = midterm1 * this.c1.midtermCoefficient;
        }
        if(note2 >= 0 && note2 <=100){
            this.c2.note = note2 * this.c2.noteCoefficient;
        }
        if(midterm2 >= 0 && midterm2 <=100){
            this.c2.midterm = midterm2 * this.c2.midtermCoefficient;
        }
        if(note3 >= 0 && note3 <=100){
            this.c3.note = note3 * this.c3.noteCoefficient;
        }
        if(midterm3 >= 0 && midterm3 <=100){
            this.c3.midterm = midterm3 * this.c3.midtermCoefficient;
        }
    }

    void calcAverage(){
        this.average = ((this.c1.note + this.c1.midterm) + (this.c2.note + this.c2.midterm) + (this.c3.note + this.c3.midterm)) / 3.0;
        System.out.println("Your average is: " + this.average);
    }

    void isPass(){
        if(this.average >= 55){
            System.out.println("Congratulations you passed the class");
        }else{
            System.out.println("Sorry you failed.");
        }
    }

    void printNote(){
        System.out.println("Hi " + this.name + " there is your note:\n "
                + this.c1.name + ": " + (this.c1.note + this.c1.midterm) + "\n "
                + this.c2.name + ": " + (this.c2.note + this.c2.midterm) + "\n "
                + this.c3.name + ": " + (this.c3.note + this.c3.midterm));
    }

}
