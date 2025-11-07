package cz.zacpalsps;

public class BankovniUcet {
    private final String cisloUctu;
    private String jmenoMajitele;
    private double stavUctu;

    public BankovniUcet(String cisloUctu, String jmenoMajitele, double stavUctu) {
        this.cisloUctu = cisloUctu;
        this.jmenoMajitele = jmenoMajitele;
        this.stavUctu = 0;
    }
    public boolean vloz(double castka){
        if (castka>0){
            stavUctu+=castka;
            return true;
        }
        return false;
    }

    public String getCisloUctu() {
        return cisloUctu;
    }

    public String getJmenoMajitele() {
        return jmenoMajitele;
    }

    public double getStavUctu() {
        return stavUctu;
    }
    public boolean vyber(double castka){
        if (castka>0 && castka<= stavUctu){
            stavUctu-=castka;
            return true;
        }
        return false;
    }

    public void vypisInfo(){
        System.out.println("číslo účtu:"+cisloUctu);
        System.out.println("vaše jméno:"+jmenoMajitele);
        System.out.println("stav účtu:"+stavUctu);
    }
}
