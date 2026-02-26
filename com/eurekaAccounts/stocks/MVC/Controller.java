package com.eurekaAccounts.stocks.MVC;

import java.sql.SQLException;

public class Controller {
     public static void main(String[] args){
         try{
             Service service = new Service();
             System.out.println(service.getallsph());
         }catch(SQLException e){
             System.out.println("An error occured");
         }
    }

}
