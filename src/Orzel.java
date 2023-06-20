public class Orzel extends Zwierze implements ILatanie {



    public Orzel(String nazwa,String gatunek,float waga)
    {
        super(nazwa,gatunek,waga);
    }


    public void wydajGlos()
    {
        System.out.println("kra");
    }
    public void lataj(int predkosclatania,int wysokosc)
    {
        System.out.println("predkosc latania orła wynosi "+predkosclatania+ "  ma wysokosci  "+wysokosc);
    }
    public void PokazInformacje()
    {
        System.out.println("waga wynosi "+this.waga+"gatunek to "+this.gatunek+" nazwa to"+this.nazwa);
        wydajGlos();
    }
}
