/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.Serializable;

/**
 *
 * @author x12384261
 */

public class Computer3array implements Serializable{
    private String name;
    private int student;
    private String password;
    private String workshop;
    private int date;
    private double time;
    private String subject;
    
    public Computer3array(){
    name = new String();
    student = 0;
    password = new String();
    workshop = new String();
    date = 0;
    time = 0.0;
    subject = new String();
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }
    
    public String getDetails(){
        return "name:"+name+ "\nworkshop:"+workshop+"\nsubject:"+subject+"\nstudentnumber:"+student+"\npassword:"+password+"\nDateOfWorkshop:"+date+"\nTimeOfWorkshop:"+time;
        
}
}
