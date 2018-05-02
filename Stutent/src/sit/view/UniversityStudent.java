package sit.view;

public class UniversityStudent extends Student{
    private double educationSupportFee;
    private boolean scholarship;
    private boolean alumni;

    public UniversityStudent() {
    }

    public UniversityStudent(double educationSupportFee, boolean scholarship, boolean alumni, long studentId, String studentName, double tuition) {
        super(studentId, studentName, tuition);
        this.educationSupportFee = educationSupportFee;
        this.scholarship = scholarship;
        this.alumni = alumni;
    }
   
    @Override
    public double expensePerSemester() {
        if (scholarship) {
            this.tuition = this.tuition-(this.tuition*0.1);     
        }if (alumni) {
            tuition = tuition-(tuition*0.05);
            }
        return tuition+this.educationSupportFee;
    }

    @Override
    public String toString() {
        return "UniversityStudent{" + "educationSupportFee=" + educationSupportFee + ", scholarship=" + scholarship + ", alumni=" + alumni + '}'
                +"Student{" + "studentId=" + studentId + ", studentName=" + studentName +'}';
    }   
}
