/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author yaderv
 */
public class Persona {
    private String name; 
    private int age; 
    private int id; 

    public Persona(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", age=" + age + ", id=" + id + '}';
    }

    
}
