/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.getpharma.helper;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FactoryProvider {
    public static void main(String args[]){
        System.out.println("project started");
    }
private static SessionFactory factory;
public static SessionFactory getFactory(){
    
        factory=new  Configuration().configure().buildSessionFactory();
   
        return factory;
}
    
   
}
