package task2;

import java.util.Arrays;

public class Student extends Person {
    int numOfCourses = 30;
    String[] courses = new String[numOfCourses];
    int[] grades = new int[numOfCourses];
   
    //constructor
    Student(String name, String address){
        super(name , address);   //inheretens from person
    }
    
    //methods:
    //add course and grade
    public void addCourseGrade(String course , int grade){
        for(int i=0 ;i < courses.length ; i++ ){
            if(courses[i] == null){
            courses[i]= course;
            grades[i]= grade;
            break;}
        }
    }
    //print grdae
    public void printGrades(){
        for(int i=0; i< grades.length; i++){
            System.out.print(courses[i] +"  ");
            System.out.println(grades[i]);
        }
    }
    //get average
    public double getAverageGrade(){
        double sum = 0;
        double average;
        int count =0 ;
        for(int i=0; i< grades.length;i++){
            if(grades[i] != 0){
             count++ ;   
             sum = sum + grades[i];
            }
        }
        
        average = sum/count;
        return average;
    }  
    //to string (override method)
    @Override
    public String toString() {
        return "Stuident{" + "name=" + name + ", address=" + address + "numOfCourses=" + numOfCourses + ", courses=" + Arrays.toString(courses) + ", grades=" + Arrays.toString(grades) + '}';
    }
    
    
}
