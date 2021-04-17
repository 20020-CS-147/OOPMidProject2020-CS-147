/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.management.system;

/**
 *
 * @author Balawal
 */
public class teacher extends person {

    
    public teacher(int ID, String password, String Email, String name,String result) {
        super(ID, password, Email, name,result);
        this.setID(ID);
        this.Email=Email;
        this.password=password;
        this.setname(name);
        this.result=result;
    }
    private String Result;
    public void setResult(String Result)
    {
    this.Result=Result;
    }
    public String getResult()
    {
    return Result;
    }
    
    public void AddResult(String Result)
    {
    
    }
      public void RemoveResult()
    {
    
    }
          public void EditResult(String Result)
    {
    
    }
          public String toString()
                  
          {
           return null;
          }

    Object getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
