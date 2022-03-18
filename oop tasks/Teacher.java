package task2;

import java.util.Arrays;

public class Teacher extends Person {
    int numOfCourses = 5;
    String [] courses = new String[numOfCourses];
    
    //constructors
    Teacher(String name , String address){
        super(name , address);  //inheretens from person
    }    
    
    //methods:
    //add course
    public boolean addCourse(String course){
        for(int i=0; i<courses.length; i++){
            if(courses[i]==course){
                return false;
            }else if (courses[i]== null){
                courses[i]=course;
                break;
            }
        }
        return false;   
    }
    //remove course
    public boolean removeCourse(String course){
        for(int i=0; i<5; i++){
            if(courses[i]== course){
                courses[i] = " ";
            }
        }
        return false;
    }
    //to string (override method)
    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", address= " + address + ", numOfCourses=" + numOfCourses + ", courses=" + Arrays.toString(courses) + '}';
    }
   
    


  
    
    
    
    //add course
//    public boolean addCourse(String course){
//        for(int i=0; i<courses.length; i++){
//           if(courses[i].equals(course) == false){ // if not equals
//               courses[i]=course;
//           }else{
//               return false;
//           }
//        }
//        return false;   
//    }
//    //remove course
//    public boolean removeCourse(String course){
//        for(int i=0; i<courses.length; i++){
//           if(courses[i].equals(course) == true){ //if equals
//               courses[i]="";
//           }else{
//               return false;
//           }
//        }
//        return false;
//    }

    
    
}
