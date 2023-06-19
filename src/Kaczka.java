public class Kaczka extends Zwierze implements IPlywanie, ILatanie{


    public int predkosc,wysokosc, predkosclatania,glebokosc;
    public Kaczka(String nazwa,String gatunek,float waga,int predkosc,int predkosclatania,int wysokosc, int glebokosc){

        super(nazwa,gatunek,waga);
        this.predkosc=predkosc;
        this.predkosclatania=predkosclatania;
        this.wysokosc=wysokosc;
        this.glebokosc=glebokosc;
    }

    public void setWaga(float waga)

    {
        if (this.waga>0f)
        {
            this.waga=waga;
        }else {
            this.waga=0;
        }
    }
    public void setPredkosclatania(int predkosclatania)
    {
        if(this.predkosclatania<0)

        {
            this.predkosclatania=0;
        }else {
            this.predkosclatania=predkosclatania;
        }
    }
    public void wydajGlos()
    {
        System.out.println("kwa kwa");
    }

    public void plywaj(int predkosc,int glebokosc)
    {
        System.out.println("Głebokośc wynosi "+ glebokosc+"a predkosc to"+predkosc);
    }


    public void setPredkosc(int predkosc)
    {
        if(this.predkosc<0)
        {
            this.predkosc=0;
        }else {
            this.predkosc=predkosc;
        }
    }


    public void lataj(int predkosclatania,int wysokosc)
    {
        if(this.predkosclatania<0)
        {
            this.predkosclatania=0;
        }else {
            this.predkosclatania=predkosclatania;
        }
        System.out.println("Predkosćlatania kaczkito "+predkosclatania+" a wysokośc na jaka może wzniesc sie kaczka to "+wysokosc);
    }

    @Override
    public void PokazInformacje()
    {
        System.out.println("waga wynosi "+this.waga+"gatunek to "+this.gatunek+" nazwa to"+this.nazwa);
        wydajGlos();
    }

}
