public abstract class Zwierze {


    public String nazwa ;
    public String gatunek;
    public float waga;

    public Zwierze(String nazwa,String gatunek,float waga){
        this.nazwa=nazwa;
        this.gatunek=gatunek;
        this.waga=waga;


    }
    void setWaga(float waga)
    {
        if(this.waga<0)
        {
            this.waga=0;
        }else {
            this.waga=waga;
        }
    }



    public abstract void wydajGlos();

    public void PokazInformacje()
    {
        System.out.println("waga wynosi "+this.waga+"gatunek to "+this.gatunek+" nazwa to"+this.nazwa);
        wydajGlos();
    }
}

