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
public class student extends person {

    //static String[] split(String string) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    String result;
    
   public student(int ID, String password, String Email, String name,String result) {
        super(ID, password, Email, name,result);
        this.setID(ID);
        this.Email=Email;
        this.password=password;
        this.setname(name);
        this.result=result;
    }
    
    private String projectname;

   /*void student(int ID,String password,String Email,String name,String result) {
        throw new student("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.result = result;
    }*/
    public void setprojectname(String projectname)
    {
        this.projectname=projectname;
    }
    public String getprojectname()
    {
    return this.projectname;
    }
    
    public  String submitproject(String description)
    {
        return null;
    
    }
    public void Removeproject(String projectname)
    {
        
    }
    public void EditStudent(String name,int ID,String Email,String paassword)
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

  
    
    

