/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceDesStages;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Queue;
import javax.naming.Context;
import javax.jms.Session;
import javax.jms.Connection;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public abstract class Gestion_Pre_Conv implements Serializable {
    
    
    
    
    
    
    
    
    
    /*
    protected Context namingContext;
    private Connection connexion;
    protected Session session;
    
    
   
        
    Context ctx;
    
    public Gestion_Pre_Conv() {
        Hashtable properties = new Hashtable(2);
        properties.put(Context.PROVIDER_URL,"iiop://127.0.0.1:3700");
        properties.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.appserv.naming.S1ASCtxFactory");
        try {
            ctx = new InitialContext(properties);
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }
   public Object lookup(String name){
        try {
            return ctx.lookup(name);
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Gestion_Pre_Conv client = new Gestion_Pre_Conv() {};
        try{
            ConnectionFactory     connectionFactory = (ConnectionFactory)client.lookup("jms/ConnectionFactory");
            Queue     queue = (Queue)client.lookup("jms/tQueue");
              connection = connectionFactory.createConnection();
            javax.jms.Session        session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(queue);
            for(int i=0;i<5;i++) {
                ObjectMessage message = session.createTextMessage("It is a message from main class "+  ": "+ i);
                System.out.println( "It come from main class:"+ message.getText());
                messageProducer.send(message);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
   */
}

         
    
    

