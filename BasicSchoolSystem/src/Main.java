public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Jack teacher", "0000", "CAL");
        Teacher t2 = new Teacher("Richard teacher", "1111", "PHY");
        Teacher t3 = new Teacher("Melanie teacher", "2222", "HSY");

        Course calculus = new Course("Calculus", "101", "CAL",0.60,0.40);
        calculus.addTeacher(t1);
        calculus.printTeacher(t1);

        Course physics = new Course("Physics", "101", "PHY",0.80,0.20);
        physics.addTeacher(t2);
        physics.printTeacher(t2);

        Course history = new Course("History", "101", "HSY",0.70,0.30);
        history.addTeacher(t3);
        history.printTeacher(t3);

        System.out.println("-----------------------------------");

        Student s1 = new Student("Felix", "01", "4.grade", calculus, physics, history);
        s1.addBulkExamNote(100,60,50,70,30,80);
        s1.printNote();
        s1.calcAverage();
        s1.isPass();

        System.out.println("-----------------------------------");

        Student s2 = new Student("Adam", "02", "4.grade", calculus, physics, history);
        s2.addBulkExamNote(59,30,20,70,69,40);
        s2.printNote();
        s2.calcAverage();
        s2.isPass();

        System.out.println("-----------------------------------");

        Student s3 = new Student("Lilly", "03", "4.grade", calculus, physics, history);
        s3.addBulkExamNote(50,60,50,30,80,20);
        s3.printNote();
        s3.calcAverage();
        s3.isPass();

    }


}
