package sit.view;

public class KinderGartenStudent extends Student{
    private double schoolBusFee;
    private double annualFee;
    private String parentName;

    public KinderGartenStudent() {
    }

    public KinderGartenStudent(double schoolBusFee, double annualFee, String parentName, long studentId, String studentName, double tuition) {
        super(studentId, studentName, tuition);
        this.schoolBusFee = schoolBusFee;
        this.annualFee = annualFee;
        this.parentName = parentName;
    }

    @Override
    public double expensePerSemester() {
        return this.schoolBusFee+this.annualFee+this.tuition;
    }

    @Override
    public String toString() {
        return "KinderGartenStudent{" + "schoolBusFee=" + schoolBusFee + ", annualFee=" + annualFee + ", parentName=" + parentName + '}'
                +"Student{" + "studentId=" + studentId + ", studentName=" + studentName +'}';
    }     
}
