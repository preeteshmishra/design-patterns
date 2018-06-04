package factory;

public class ComputerFactoryTest {

public static void main(String []args){

    Computer pc = ComputerFactory.getComputer("pc","500 GB","8 GB" , "4");
    Computer server = ComputerFactory.getComputer("server","1024 GB" , "50 GB" , "16");

    System.out.println("PC configuration: " + pc);
    System.out.println("Server configuration:  " + server);


    
}


}
