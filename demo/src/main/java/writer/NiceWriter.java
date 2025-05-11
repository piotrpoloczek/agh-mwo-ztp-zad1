package writer;

public class NiceWriter implements IWriter {
    private IOzdobnik ozdobnik;

    public void setOzdobnik(IOzdobnik ozdobnik) {
        this.ozdobnik = ozdobnik;
    }

    public void writer(String s) {
        System.out.println(ozdobnik.ozdob(s));
    }
}
