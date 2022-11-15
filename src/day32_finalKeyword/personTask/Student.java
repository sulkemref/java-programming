package day32_finalKeyword.personTask;

import java.time.LocalDate;

public final class Student extends Person{

    private final String studentId, fieldOfStudy;
    private char grade;
    private final static String schoolName;

    static {
        schoolName = "Cydeo";
    }


    public Student(String name, char gender, LocalDate dateOfBirth, String studentId, String fieldOfStudy, char grade) {
        super(name, gender, dateOfBirth);
        this.studentId = studentId;

        if(fieldOfStudy==null){
            System.err.println("fieldOfStudy should not be set to null");
            System.exit(1);
        }
        if(fieldOfStudy.isBlank()||fieldOfStudy.isEmpty()){
            System.err.println("fieldOfStudy should not be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
        setGrade(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        boolean isValid = grade =='A'|| grade =='B'|| grade =='C'|| grade =='D'|| grade =='F';
        if(!isValid){
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public final void study(){
        System.out.println(getName()+ "is studying");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", studentId=" + studentId +
                ", fieldOfStudy=" + fieldOfStudy +
                ", grade=" + grade +
                ", schoolName=" + schoolName +
                '}';
    }
}
