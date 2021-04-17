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
public class person {
    int ID;
   String Email;
    String password;
    String name;
    String result;
    
    public person(int ID,String password,String Email,String name,String result)
    {
    this.name=name;
    this.ID=ID;
    this.Email=Email;
    this.password=password;
    this.result=result;
    }
    
        
    public String getresult(String result)
    {
    return this.result;
    }
    public int getID(int ID)
    {
      return this.ID;
    }
    
   public String getEail(String Email)
    {
        return this.Email;
       
    }
   
     public String getpassword(String password)
    {
        return this.password;
       
    }

     public  String tostring()
     {
       return null;  
     }
     public void setresult(String result)
     {
     this.result=result;
     }
       public void  setID(int n)
  {
     ID=n; 
  }
       
            public void  setEmail(String E)
  {
     Email=E; 
  } 
              public void  setpassword(String P)
  {
     password=P; 
  }       
    
    public void  setname(String N)
  {
     name=N; 
  }                    

    Object getresults() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getResult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
