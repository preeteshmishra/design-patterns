package factory;

public  abstract  class Computer {

    public abstract String getHDD();

    public abstract String getRAM();

    public abstract String getCpu();

    @Override
    public String toString() {
        return "HDD = " + this.getHDD() + " RAM = " + this.getRAM() + " CPU = " + this.getCpu();
    }
}
