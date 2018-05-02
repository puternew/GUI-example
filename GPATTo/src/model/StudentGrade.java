/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author INT105
 */
public class StudentGrade {

    private String subject;
    private String grade;
    private float credit;

    public StudentGrade() {
    }

    public StudentGrade(String subject, String grade, float credit) {
        this.subject = subject;
        this.grade = grade;
        this.credit = credit;
    }

    public String getSubject() {
        return subject;
    }

    public String getGrade() {
        return grade;
    }

    public float getCredit() {
        return credit;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "StudentGrade{" + "subject=" + subject + ", grade=" + grade + ", credit=" + credit + '}';
    }
    
    
    
}
