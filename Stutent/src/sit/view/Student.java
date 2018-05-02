package sit.view;

public abstract class Student {
    protected long studentId;
    protected String studentName;
    protected double tuition;

    public Student() {
    }

    public Student(long studentId, String studentName, double tuition) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.tuition = tuition;
    }
    
    public abstract double expensePerSemester();

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName +'}';
    } 
}
