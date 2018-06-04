package factory;

public class PC extends Computer{

    private String HDD;
    private String RAM;
    private String cpu;


    public PC(String hdd , String ram , String cpu)
    {


        this.cpu = cpu;
        this.HDD = hdd;
        this.RAM = ram;
    }

    @Override

    public String getHDD(){
        return this.HDD;
    }
    @Override

    public String getRAM(){
        return this.RAM;
    }

    @Override

    public String getCpu(){
        return this.cpu;
    }



}
