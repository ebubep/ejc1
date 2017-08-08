/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author OMOBOLAJI JR
 */
public class Employee {
    String name;
    int age;
    int Salary;
    public void empAge(int empAge){
        age=empAge;
    }
    public Employee(String name){
        this.name=name;
    }
    public void empSAlary(int empSalary){
        Salary=empSalary;
    }
    
    public void printemp(){
            System.out.println("name="+ name);
            System.out.println("Age="+ age);
            System.out.println("salary="+ Salary);
        }
     public static void main(String[] args) {
        // TODO code application logic here
        Employee e1= new Employee("Akin ola"); 
        e1.empAge(20);
        e1.empSAlary(250);
        e1.printemp();
        
        
        
    }
}
