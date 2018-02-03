package main.cl.panarch.model;


public class ApplesInventoryException extends Exception{

    public ApplesInventoryException(Exception e){
       e.printStackTrace();
    }

    public ApplesInventoryException(String message){
        System.out.println(message);
    }

}
