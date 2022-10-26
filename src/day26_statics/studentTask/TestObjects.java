package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 20, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 20, 'M', "E27");
        Student student6 = new Student("Igor", 21, 'M', "A17");
        Student student7 = new Student("Ivan", 29, 'M', "B84");
        Student student8 = new Student("Alena", 27, 'F', "C59");
        Student student9 = new Student("Marat", 29, 'M', "D40");
        Student student10 = new Student("Rustam", 19, 'M', "E23");
        Student student11 = new Student("Yulduz", 18, 'F', "A11");
        Student student12 = new Student("Fazillat", 24, 'F', "B84");
        Student student13 = new Student("Lena", 25, 'F', "C66");
        Student student14 = new Student("Irina", 29, 'F', "D73");
        Student student15 = new Student("Sasha", 24, 'F', "E17");
        Student student16 = new Student("Lilya", 18, 'F', "M10");
        Student student17 = new Student("Megan", 24, 'F', "B24");
        Student student18 = new Student("Willa", 19, 'F', "C56");
        Student student19 = new Student("Monika", 20, 'F', "D78");
        Student student20 = new Student("Muhabbat", 23, 'F', "E97");

        Student[] students1 = {student2,student3,student4,student5};

        StudentsGroup group1 = new StudentsGroup("Java Turtles",1);
        group1.addStudent(student1);
        group1.addStudent(students1);

        Student[] students2 = {student6,student7,student8,student9,student10};
        Student[] students3 = {student11,student12,student13,student14,student15};
        Student[] students4 = {student16,student17,student18,student19,student20};



        group1.addStudent("Khashayar", 34, 'M', "F35");

        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name+" : "+each.id);
        }

        StudentsGroup group2 = new StudentsGroup("Java Turtles",2);
        group2.addStudent(students2);
        StudentsGroup group3 = new StudentsGroup("Java Turtles",3);
        group3.addStudent(students3);
        StudentsGroup group4 = new StudentsGroup("Java Turtles",4);
        group4.addStudent(students4);
        StudentsGroup[] groups = {group1,group2,group3,group4};

        System.out.println("----------------------------------------------------------------");

        for (StudentsGroup group : groups) {
           // if(group.groupId==1)
            for (Student student : group.students) {
                if(student.age >21&&student.gender=='M')
                System.out.println(student.name+" : "+student.id);
            }
        }


    }


}
