/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author x12457182
 */
public class Int_class {
    
    protected String ToTF;
    protected String SubTF;
    protected String MessTF;
    
        public Int_class(){
        ToTF = new String();
        SubTF = new String();
        MessTF = new String();
    }
        
         public String getToTF() {
        return ToTF;
    }

    public void setToTF(String ToTF) {
        this.ToTF = ToTF;
    }

    public String getSubTF() {
        return SubTF;
    }

    public void setSubTF(String SubTF) {
        this.SubTF = SubTF;
    }

    public String getMessTF() {
        return MessTF;
    }

    public void setMessTF(String MessTF) {
        this.MessTF = MessTF;
    }
    
}
