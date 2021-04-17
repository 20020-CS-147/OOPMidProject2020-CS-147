/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.management.system;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Balawal
 */
public class ProjectManagementSystem {
     private  ArrayList<teacher> teachers=new ArrayList<>();
   ArrayList<student>students=new ArrayList<student>();
   ArrayList<person>results=new ArrayList<>();
   private String project;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
          Main_Screen n=new Main_Screen();
          n.setVisible(true);
    }
    
 
  
    public ProjectManagementSystem() {
        this.teachers = new ArrayList<>();
    }
    public ArrayList<student>getstudent()
    {
     return this.students;
    }
    public ArrayList<teacher>getteacher()
    {
      return this.teachers;
    }
    public ArrayList<person>getresult()
     
    {
        return this.results;
    }
            
            
    public void setstudent(student s)
    {
      this.students.add(s);
    }
    public void setteacher(teacher t)
    {
        this.teachers.add(t);    
    }
    public void setresult(person r)
    {
    this.results.add(r);
    }
   public boolean EditStudent(int id,student s )
        
    {
    int size=this.students.size();
    for(int i=0;i<size;i++)
    {
    if(this.students.get(i).getID().equals(id))
    {
      this.students.set(i, s);
      return true;
    }
   
    }
     return false;
    }
   public boolean EditTeacher(int id,teacher t )
        
    {
    int size=this.teachers.size();
    for(int i=0;i<size;i++)
    {
    if(this.teachers.get(i).getID().equals(id))
    {
      this.teachers.set(i, t);
      return true;
    }
   
    }
     return false;
    }
       public boolean ADDStudent(student s)
    {
    try{
    this.setstudent(s);
    return true;
    }
    catch(Exception ex)
    {
    return false;
    }
    }
    
      public boolean ADDteacher(teacher t)
      
    {
        try{
            this.setteacher(t);
            return true;
        }
        catch(Exception ex)
        {
        return false;
        }
        
        }
        
    
     public boolean DeleteStudent(int id )
        
    {
    int size=this.students.size();
    for(int i=0;i<size;i++)
    {
    if(this.students.get(i).getID().equals(id))
    {
      this.students.remove(i);
      return true;
    }
   
    }
         return false;
      
    }
    
       public boolean DeleteTeacher(int id )
        
    {
    int size=this.teachers.size();
    for(int i=0;i<size;i++)
    {
    if(this.teachers.get(i).getID().equals(id))
    {
      this.teachers.remove(i);
      return true;
    }
   
    }
         return false;
      
    }
        public boolean EditResult(String resultt,person o )
        
    {
    int size=this.results.size();
    for(int i=0;i<size;i++)
    {
    if(this.results.get(i).getresults().equals(resultt))
    {
      this.teachers.set(i, (teacher) o);
      return true;
    }
   
    }
     return false;
    }
       
        public boolean Deleteresult(String result )
        
    {
    int size=this.results.size();
    for(int i=0;i<size;i++)
    {
    if(this.results.get(i).getResult().equals(result))
    {
      this.results.remove(i);
      return true;
    }
   
    }
         return false;
      
    }
       
       public boolean ADDresult(person p)
      
    {
        try{
            this.setteacher((teacher) p);
            return true;
        }
        catch(Exception ex)
        {
        return false;
        }
        
        }  
              
     public boolean searchstudent(int id)
     {
         int size = this.students.size();
         for(int i=0;i<size;i++)
         {
             if(this.students.get(i).getID().equals(id))
             {
                 //this.technicalBook.remove(i);
                 return true;
             }
         }
         return false;
     }   
     
      public boolean searchteacher(int id)
     {
         int size = this.teachers.size();
         for(int i=0;i<size;i++)
         {
             if(this.teachers.get(i).getID().equals(id))
             {
                 //this.technicalBook.remove(i);
                 return true;
             }
         }
         return false;
     }   
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    
          public  String submitproject(String description)
    {
        return null;
    
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
   public void login(String name,String password)
          {
          
          }
   public void logout()
          {
          
          }
  }

          
          
          
          
          
          
          
          
          
    
    

