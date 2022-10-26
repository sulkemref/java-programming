package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { //StudentGroup HAS A Student

    public String groupName;
    public int groupId;
    public ArrayList<Student> students; // = new ArrayList<>(); can be used

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>(); //size: 0
    }

    public void addStudent(Student student){
        students.add(student);
    } // Takes one student object, and adds it to the arrray:ist of students

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudent(String name, int age, char gender, String id){
       // Student student = new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
    }// takes name,age,gender,id of student info, creates student object by using the given info, then adds the student object to the arrList

    public void removeStudent(String id){
        students.removeIf(p->p.id.equals(id));
    } // Takes id and then remove objects from arrayList

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */