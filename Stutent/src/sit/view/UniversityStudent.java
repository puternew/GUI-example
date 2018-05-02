/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

/**
 *
 * @author INT105
 */
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
