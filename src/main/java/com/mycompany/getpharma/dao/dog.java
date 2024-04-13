/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.getpharma.dao;

import com.mycompany.getpharma.entites.User;
import com.mycompany.getpharma.helper.FactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author Utkarsh Kumar
 */
public class dog {

   private     SessionFactory factory;
         public dog (SessionFactory factory){
        this.factory = factory;
    }
    public User getUserByEmail(String email) {
    User user1 =null;
    

    try  {
            String query = "from User where userEmail = :email";
              Session session = this.factory.openSession();
        Query<User> q = session.createQuery(query, User.class);
        q.setParameter("email", email);
        user1 = q.uniqueResult();
    } catch (Exception e) {
        // Handle any exceptions
        e.printStackTrace();
    }
    
    return user1;
}

}
