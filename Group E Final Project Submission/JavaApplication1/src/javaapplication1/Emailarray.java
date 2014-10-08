/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.Serializable;
/**
 *
 * @author x12538083
 */
public class Emailarray implements Serializable{
    private String To;
    private String Subject;
    private String Message;
            
 
public  Emailarray() {
To  = new String();
Subject = new String();
Message = new String();
}

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }
    public String getDetails(){
        return "To:"+To+ "\nSubject:"+Subject+"\nMessage:"+Message;
    }

}
   

