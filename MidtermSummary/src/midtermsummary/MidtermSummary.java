/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermsummary;

import java.util.*;

/**
 *
 * @author Predator
 */
public class MidtermSummary {

    public static void main(String[] args) {
        polymorphism();
        String a = "AbasdffffssxxA",b="abC";
        a+="holy";
        a+=b;
        System.out.println(a);
    }
    public static void basicClass(){
        Person sticky = new Person();
        sticky.foo++;
        System.out.println(sticky.foo);
        sticky.eat();
        System.out.println(sticky.cook());
    }
    
    public static void inheritance(){
        Person sticky = new Person();
        Student stucky = new Student();
        
        System.out.println("------ Note the difference ------");
        System.out.println(sticky.cook());
        System.out.println(stucky.cook());
        System.out.println("----------------------------------");
        System.out.println(stucky.doHomework()+"\n");//Only Student can doHomework()
        System.out.println("-----Note the number of the objects-----");
        System.out.println("Person count: " + Person.personCount);
        System.out.println("Student count: " + Student.studentCount);
    }
    
    public static void polymorphism(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person());
        list.add(new Student());//Note that it can also add Student()
        for(Person person : list){//Easy to use with forEach
            System.out.println("----------------------");
            System.out.println(person.cook());
        }
    }
}


class Person{
    //data fields
    public int foo=5;
    private String name,surname,nickname,nationality,id;
    private Date dateOfBirth;
    public static int personCount = 0;//Static field is common for all object

    //constructors
    public Person(){
        System.out.println("New person!");
        dateOfBirth= new Date();
        personCount++;
    }  
    public Person(String name, String surname) {
        System.out.println("New person!");
        this.name = name;
        this.surname = surname;
        dateOfBirth= new Date();
        personCount++;
    }
    public Person(String name, String surname, String nickname) {
        System.out.println("New person!");
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        dateOfBirth= new Date();
        personCount++;
    }
    public Person(String name, String surname, String nationality, String id) {
        System.out.println("New person!");
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.id = id;
        dateOfBirth= new Date();
        personCount++;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getNickname() {
        return nickname;
    }
    public String getNationality() {
        return nationality;
    }
    public String getId() {
        return id;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    //Methods
    public void eat(){
        System.out.println("Eating");
    }
    public void walk(){
        System.out.println("Walking");
    }
    public void sit(){
        System.out.println("Sitting");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public String cook(){
        System.out.println("Roasting chicken");
        return "Roasted chicken";
    }
    public String work(){
        System.out.println("Working");
        return "Work";
    }
}

class Student extends Person{
    //data field
    private String studentId;
    public static int studentCount = 0;
    
    //constructors
    public Student(){
        System.out.println("New student!");
        studentCount++;
    }
    public Student(String studentId) {
        System.out.println("New student!");
        this.studentId = studentId;
        studentCount++;
    }
    public Student(String studentId, String name, String surname) {
        super(name, surname);
        System.out.println("New student!");
        this.studentId = studentId;
        studentCount++;
    }
    public Student(String studentId, String name, String surname, String nickname) {
        super(name, surname, nickname);
        System.out.println("New student!");
        this.studentId = studentId;
        studentCount++;
    }
    public Student(String studentId, String name, String surname, String nationality, String id) {
        super(name, surname, nationality, id);
        System.out.println("New student!");
        this.studentId = studentId;
        studentCount++;
    }

    //getter
    public String getStudentId() {
        return studentId;
    }
    
    //setter
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    //method
    public String doHomework(){
        System.out.println("Doing java homework");
        return "Homework";
    }
    
    //Overriden method
    @Override
    public String cook(){
        System.out.println("Waiting 3 mins");
        return "Instant noodle";
    }
    
}

