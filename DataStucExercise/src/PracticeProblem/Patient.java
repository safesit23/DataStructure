/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProblem;

import java.util.Comparator;

/**
 *
 * @author PROG
 */
public class Patient{
    private String name;
    private int age;
    private char sex;
    private int damage;
    public static PatientComparator freqDescending = new PatientComparator();
    private static class PatientComparator implements Comparator<Patient>{
        //Descending order
        @Override
        public int compare(Patient o1, Patient o2) {
        return o2.calculatePriority() - o1.calculatePriority();
    }
        
    }
        

    public Patient(String name, int age, char sex, int damage) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    private int calculatePriority(){
        return agePriority()+damage+sexPriority();
    }
    
    private int agePriority(){
        if(age>=60){
            return 5;
        }else if(age>40){
            return 4;
        }else if(age>30){
            return 1;
        }else if(age>10){
            return 3;
        }else{
            return 5;
        }
    }
    
    private int sexPriority(){
        switch(sex){
            case 'M' : return 5;
            case 'F' : return 10;
        }
        return 0;
    }

    
    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", age=" + age + ", sex=" + sex + ", damage=" + damage + ", Total = "+calculatePriority()+"}";
    }
    
    
}
