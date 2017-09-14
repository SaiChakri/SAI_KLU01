



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
    private Object birthDate;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

    StudentGroup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public Student[]getStudents() throws IllegalArgumentException{
            ArrayList b=new ArrayList();
		try{
            if(students==null){
            throw new IllegalArgumentException();
        }
            else{
                for(int i=0;i<students.length;i++){
                    b.add(students[i]);
                }
            }
                }
            catch( IllegalArgumentException e ){
                   System.out.println(e);
                    }
		return b;
	}

	public void setStudents(Student[] students)throws IllegalArgumentException {
		// Add your implementation here
        }
	public Student getStudent(int index) {
		 ArrayList c=new ArrayList();
                 try{
                     if(index<0 && index>=students.length){
            throw new IllegalArgumentException();
        }
                     else{
                         for(int i=0;i<students.length;i++){
                           if(i==index){
                               c.add(students[i]);
                           }  
                           
                         }
                         
                     }
                 }
                 catch(IllegalArgumentException e){
                     System.out.println(e);
                 }
		return c;
	}

	public void setStudent(Student student, int index)throws IllegalArgumentException {
		// Add your implementation here
                
                try{
                    if((index<0 && index>=students.length)||(students==null)){
            throw new IllegalArgumentException();
        }
                    else
                    {
                        for(int i=index;i<students.length;i++)
                        {
                            students[i+1]=students[i];
                        }
                        students[index]=student;
                    }
        }
                 catch(IllegalArgumentException e){
                     System.out.println(e);
                 }
	}

	public void addFirst(Student student) throws IllegalArgumentException {
		// Add your implementation here
               try{
                   if(students==null){
                       throw new IllegalArgumentException();
                   }
                   else{
                   
               }
               }
               catch(IllegalArgumentException e){
                   System.out.println(e);
               }
	}

	public void addLast(Student student) throws IllegalArgumentException {
		if (students==null)
		{
			throw new IllegalArgumentException();
		}
		 Arrays.copyOf(students,students.length+1);
		 students[students.length-1]=student;
		
        }

	public void add(Student student, int index) throws IllegalArgumentException {
		int i=0;
		
		if(index<0 || index>=students.length || students==null)
		{
			throw new IllegalArgumentException();
		}
		Student s[]=new Student[students.length+1];
		for( i=0;i<index;i++)
		{
			s[i]=students[i];
		}
		s[index]=student;
		for(i=index+1;i<s.length;i++)
		{
			s[i]=students[i-1];
		}
		
		 Arrays.copyOf(students,students.length+1);
		 for( i=0;i<s.length;i++)
		 {
			 students[i]=s[i];
		 }
		
		
	}

	public void remove(int index)throws IllegalArgumentException {
  // Add your implementation here
                 // Add your implementation here
                  try{
        if(index<0 && index>=students.length){
             throw new IllegalArgumentException();
        }
        else{
            for(int i=0;i<index;i++){
    if(students[i]==students[index]){
        students[i]=students[i+1];
    }
}
        }
                  }

        catch(IllegalArgumentException e){
    System.out.println(e);
}
 }

 
 public void remove(Student student) throws IllegalArgumentException{
  try{
            if(student==null){
            throw new IllegalArgumentException();
        }
            
       
            
            for(int i=0;i<students.length;i++){
    if(students[i]==student){
        students[i]=students[i+1];
    }
}
        }

        catch(IllegalArgumentException e){
System.out.println(e);
}
 }

 
 public void removeFromIndex(int index)throws IllegalArgumentException {
  try{ 
            if(index<0 || students.length>=index){
                 throw new IllegalArgumentException();   
            }
            else{
                int i;
            
                    for(i=index+1;i<students.length;i++){
                        students[i]=null;
                }
 }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
                
 }

 
 public void removeFromElement(Student student)throws IllegalArgumentException {
  try{ 
            if(student==null){
                 throw new IllegalArgumentException();   
            }
            else{
                int i,g = 0;
            for(i=0;i<students.length;i++){
                if(students[i]==student){
                     g=i;
                     break;
                }
            }
                    for(i=g+1;i<students.length;i++){
                        students[i]=null;
                }
 }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
 }

 
 public void removeToIndex(int index) throws IllegalArgumentException{
            int i;
  try{ 
            if(index<0 || students.length>=index){
                 throw new IllegalArgumentException();   
            }
            else{
                for(i=0;i<index;i++){
                    students[i]=null;
                }
                int k=0;
                int g=students.length-i;
                for(i=index;i<g;i++){
                students[k]=students[i];
                
            }
                }
                }
            catch(IllegalArgumentException e){
                    System.out.println(e);
                    }
 }

 
 public void removeToElement(Student student)throws IllegalArgumentException {
  try{ 
            if(student==null){
                 throw new IllegalArgumentException();   
            }
            else{
                 int i,index = 0;
            for(i=0;i<students.length;i++){
                if(students[i]==student){
                     index=i;
                     break;
                }
            }
             for(i=0;i<index;i++){
                    students[i]=null;
                }
                int k=0;
                int g=students.length-i;
                for(i=index;i<g;i++){
                students[k]=students[i];
                
            }
            
            }
 }
                catch(IllegalArgumentException e){
                    System.out.println(e);
                }
        }
public void bubbleSort() throws IllegalArgumentException{
  // Add your implementation here
               Student dog=students;
                for(int i=0;i<students.length;i++){
                    for(int j=i+1;j<students.length;j++){
                       dog[i] =students[i];
                        students[i]=students[i+1];
                        students[i+1]=dog[i];
                    }
                }
                
 }

	public Student[] getByBirthDate(Date date)throws IllegalArgumentException {
  // Add your implementation here
                ArrayList a=new ArrayList();
                try{
                if(date==null){
                    throw new IllegalArgumentException();
                }
                else{
                    for(int i=0;i<students.length;i++){
                        if(students[i].getBirthDate()==date){
                            a.add(students[i]);
                        }
                    }
                }
                }catch(IllegalArgumentException e){
                    System.out.println(e);
                }
  return a;
 }

	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) throws IllegalArgumentException{
  // Add your implementation here
                ArrayList a=new ArrayList();
                try{
                    if(students==null){
                        throw new IllegalArgumentException();
                    }
                    else{
                 for(int i=0;i<students.length;i++){
                     if((students[i].getBirthDate()>firstDate)&&(students[i].getBirthDate()<lastDate)){
                         a.add(students[i]);
                     }
                     else{
                         throw new IllegalArgumentException();
                     }
                 }   
                }
                }
                catch(IllegalArgumentException e){
                    System.out.println(e);
                }
  return a;
 }

	public Student[] getNearBirthDate(Date date, int days) throws IllegalArgumentException{
  // Add your implementation here
                ArrayList a=new ArrayList();
                for(int i=0;i<students.length;i++){
                   Date d=students[i].getBirthDate();
                  int day1;
                    day1 =Days.BetweenDays(d,date);
                   if(days<day1){
                       a.add(students[i]);
                   }
                }
  return a;
 }

	public int getCurrentAgeByDate(int indexOfStudent) throws IllegalArgumentException{
  // Add your implementation here
                int s=0;
                try{
                if(indexOfStudent==0){
                    throw new IllegalArgumentException();
                }
                else{
                   Date p=students[indexOfStudent].getBirthDate();
                   Date w=new Date();
                   int year = p.getYear();  
                   int y1=w.getYear();
                   s=y1-year;
                }
                }catch(IllegalArgumentException e){
                    System.out.println(e);
                }
  return s;
 }

 public Student[] getStudentsByAge(int age)throws IllegalArgumentException {
  // Add your implementation here
                ArrayList a=new ArrayList();
                for(int i=0;i<students.length;i++){
                    Date q=students[i].getBirthDate();
                    int p=q.getYear();
                    if(age+p==2017){
                        a.add(students[i]);
                    }
                }
  return a;
 }
        @Override
        public Student[] getStudentsWithMaxAvgMark()throws IllegalArgumentException {
 ArrayList a=new ArrayList();
            int i=0; 
            double m=students[0].getAvgMark();
                for( i=1;i<students.length;i++){
                    if(m<students[i].getAvgMark()){
                        m=students[i].getAvgMark();
                    }
                }
                for(i=0;i<students.length;i++){
                if(students[i].getAvgMark()==m){
                    a.add(students[i]);
                }    
                }
                //students=null;
               Student[] students= (Student[])a.toArray();
  return students;
 }

 
 public Student getNextStudent(Student student)throws IllegalArgumentException {
             int i=0,index = 0;
            try{
  if(student==null){
                    throw new IllegalArgumentException();  
                }
               
            for(i=0;i<students.length;i++){
                if(students[i]==student){
                     index=i;
                     break;
                }
            }
          
            }
 
            catch(IllegalArgumentException e){
                    System.out.println(e);
                        }
          return students[i+1];
        }

    //To change body of generated methods, choose Tools | Templates.
    }

