package factory;

public class ComputerFactory {


    public static  Computer getComputer(String type , String HDD, String RAM , String CPU){

        if(type.equalsIgnoreCase("Server"))
            return   new Server(HDD,RAM,CPU);

     else if(type.equalsIgnoreCase("PC"))
         return new PC(HDD,RAM,CPU);

     else {
            return null;

    }


    }
}
