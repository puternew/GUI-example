/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.CalculateListener;
import com.sun.javafx.css.CalculatedValue;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.StudentGrade;

/**
 *
 * @author INT105
 */
public class StudentGradeView {

    private JFrame frameStudent;
    private JLabel labelSubjects[];
    private JLabel labelGPA;
    private JTextField txtGrades[];
    private JTextField txtCredits[];
    private JTextField txtGPA;
    private JButton buttonCalculate;
    private JButton buttonSave;
    private JButton buttonSaveAs;
    private JPanel jpnStudentGrade;
    private JPanel jpnButton;

    public StudentGradeView(StudentGrade[] gradeProfile) {
        int numOfSubject = gradeProfile.length;

        labelSubjects = new JLabel[numOfSubject];
        txtGrades = new JTextField[numOfSubject];
        txtCredits = new JTextField[numOfSubject];

        loadSubjects(gradeProfile);
        
        frameStudent = new JFrame("GPA-Calculate");
        labelGPA = new JLabel("GPA");
        txtGPA = new JTextField("0.00");
        buttonCalculate = new JButton("Calculate");
        
        //
        CalculateListener cal = new CalculateListener(txtGrades,txtCredits,txtGPA);
        buttonCalculate.addActionListener(cal);
        jpnStudentGrade.add(labelGPA);
        jpnStudentGrade.add(txtGPA);
        jpnStudentGrade.add(buttonCalculate);
        ///////////////////////////PANEL1/////////////////////////////////
        loadButton();
        
        frameStudent.add(jpnStudentGrade, BorderLayout.NORTH);
        frameStudent.add(jpnButton, BorderLayout.CENTER);
        frameStudent.setSize(600,400);
        frameStudent.setVisible(true);
        frameStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void loadButton() {
        jpnButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
          
        buttonSave = new JButton("SAVE");
        buttonSaveAs = new JButton("SAVE AS OBJECT");
        jpnButton.add(buttonSave);
        jpnButton.add(buttonSaveAs);
    
    }
    
    public void loadSubjects(StudentGrade[] gradeRecode) {
        //create panel and set layout
        jpnStudentGrade = new JPanel();
        GridLayout grid = new GridLayout(0, 3);
        jpnStudentGrade.setLayout(grid);
        //
        jpnStudentGrade.add(new JLabel("SUBJECT"));
        jpnStudentGrade.add(new JLabel("GRADE"));
        jpnStudentGrade.add(new JLabel("CREDIT"));
        //add หัวตาราง ^^^^^^^^^^

        for (int i = 0; i < labelSubjects.length; i++) {
            labelSubjects[i] = new JLabel(gradeRecode[i].getSubject());
            txtGrades[i] = new JTextField(gradeRecode[i].getGrade());
            txtCredits[i] = new JTextField(gradeRecode[i].getCredit() + "");
            jpnStudentGrade.add(labelSubjects[i]);
            jpnStudentGrade.add(txtGrades[i]);
            jpnStudentGrade.add(txtCredits[i]);

        }
    }
}
