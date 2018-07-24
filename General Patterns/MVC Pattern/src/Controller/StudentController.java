/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.StudentView;
import model.Student;

/**
 *
 * @author erim
 */
public class StudentController {
    private Student model;
    private StudentView view;
    
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }
    
    public void setStudentName(String name){
        model.setName(name);
    }
    
    public String getStudentName(){
        return model.getName();
    }
    
    public void setStudentRollNo(String roll){
        model.setRollNo(roll);
    }
    
    public String getStudentRollNo(){
        return model.getRollNo();
    }
    
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
