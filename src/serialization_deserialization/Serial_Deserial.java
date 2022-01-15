package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial_Deserial {
     public static void main(String args[]) throws IOException 
	  {
	    emp obj1 = new emp( "Chaitanya",1,22,"IT","abcdghjhj",958366485);
	    emp obj2 = new emp("yamini",2,25,"FINANCE","xyzsgfg",8865425);
	    FileOutputStream fos= null;
	    ObjectOutputStream oos= null;
	    
	    try{ 
	      fos = new FileOutputStream("C://Users//dell//Documents//MPHASIS//New folder.ser"); 
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj1);
	      oos.writeObject(obj2);
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	    finally{
		      oos.close();
		      fos.close();
	    }
     
	    
	    
	    
     //Deserialization
     emp o=null;
     emp o1=null;
     try{
       FileInputStream fis = new FileInputStream("C://Users//dell//Documents//MPHASIS//New folder.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       o = (emp)ois.readObject();
       o1 = (emp)ois.readObject();
       ois.close();
       fis.close();
     }
     catch(IOException ioe)
     {
        ioe.printStackTrace();
        return;
     }catch(ClassNotFoundException cnfe)
      {
        System.out.println("Student Class is not found.");
        cnfe.printStackTrace();
        return;
      }
     System.out.println(" * employee 1 *");
     System.out.println("employee name:"+o.getName());
     System.out.println("employee id:"+o.getId());
     System.out.println("employee age:"+o.getAge());
     System.out.println("employee department:"+o.getDepartment());
     System.out.println("employee email:"+o.getEmail());
     System.out.println("employee contact number:"+o.getContact());
     
     System.out.println(" * employee 2 *");
     System.out.println("employee name:"+o1.getName());
     System.out.println("employee id:"+o1.getId());
     System.out.println("employee age:"+o1.getAge());
     System.out.println("employee department:"+o1.getDepartment());
     System.out.println("employee email:"+o1.getEmail());
     System.out.println("employee contact number:"+o1.getContact());
  }
}

//------------------------------Student-------------------------//
class emp implements java.io.Serializable{
	  
	  private String  name;
	  private int id;
	  private int age;
	  private String department;  
	  private String email  ; 
	  private int contact;
	  
	  public emp(String name, int id,int age,String department,String email,int contact) {
	    this.name = name;
	    this.id = id;
	    this.age= age;
	    this.department = department;
	    this.email = email;
	    this.contact=contact;
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}
	  
}


	