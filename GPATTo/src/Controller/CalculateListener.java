/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JTextField;

/**
 *
 * @author INT105
 */
public class CalculateListener implements ActionListener{
    private JTextField txtGrades[];
    private JTextField txtCredits[];
    private JTextField txtGPA;
    
    public CalculateListener(JTextField[] txtGrades, JTextField[] txtCredits,JTextField txtGPA) {
        this.txtGrades = txtGrades;
        this.txtCredits = txtCredits;
        this.txtGPA = txtGPA;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Calculate")){
            calculateGrade();
        }
        else if (e.getActionCommand().equals("Save")) {
            saveToDataFile();
        }
        else if (e.getActionCommand().equals("Save As Object")) {
            saveToObjectFile();
        }
        
    }
    
    public void saveToObjectFile(){
        System.out.println("Saving to Object file... .. .");
    }
    public void saveToDataFile(){
        System.out.println("Saving to Data file... .. .");

    }

    
    public void calculateGrade(){
        System.out.println("Running... .. .");
        float totalGrade = 0;
        float totalCredit = 0;
        float gpa = 0;
            for (int i = 0; i < txtGrades.length; i++) {
                float grade = convertGrate(txtGrades[i].getText());
                float credit = Float.parseFloat(txtCredits[i].getText());
                totalGrade += grade*credit; 
                totalCredit += credit;
            }
                gpa=totalGrade/totalCredit;
                DecimalFormat df = new DecimalFormat("0.00");
                txtGPA.setText(df.format(gpa));
    }
    
    public float convertGrate(String gradeString){
        float grade = 0;
        switch(gradeString){
            case "A"  : grade = 4f;   break;
            case "B+" : grade = 3.5f; break;
            case "B"  : grade = 3f;   break;
            case "C+" : grade = 2.5f; break;
            case "c"  : grade = 2f;   break;
            case "D+" : grade = 1.5f; break;
            case "D"  : grade = 1f;  break;
           
        }
        return grade;
    }
}
