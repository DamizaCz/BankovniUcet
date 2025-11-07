package cz.zacpalsps;

public class BankovniUcetZpoplatneny extends BankovniUcet{
    private double  poplatekZaVyber;

    public BankovniUcetZpoplatneny(String cisloUctu, String jmenoMajitele, double stavUctu) {
        super(cisloUctu, jmenoMajitele,0);
        this.poplatekZaVyber = 25.0;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Poplatek za výběr je:"+poplatekZaVyber);
        System.out.println("Číslo účtu:"+getCisloUctu());

    }

    @Override
    public boolean vyber(double castka) {
        return super.vyber(castka);
    }
}

