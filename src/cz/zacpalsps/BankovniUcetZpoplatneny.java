package cz.zacpalsps;

public class BankovniUcetZpoplatneny extends BankovniUcet{
    private double  poplatekZaVyber;

    public BankovniUcetZpoplatneny(String cisloUctu, String jmenoMajitele, double stavUctu) {
        super(cisloUctu, jmenoMajitele,0);
        this.poplatekZaVyber = poplatekZaVyber;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Poplatek za výběr je:"+poplatekZaVyber);

    }

}

