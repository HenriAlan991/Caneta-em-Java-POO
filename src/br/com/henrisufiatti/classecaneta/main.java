package br.com.henrisufiatti.classecaneta;
public class main{
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.tamanhoPonta = 0.5f;
        c1.tintaRestante = 100;
        

        
        c1.acharTampa();
        
        c1.rabiscar(70);
        c1.fechar();
        

        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.tamanhoPonta = 0.7f;
        c2.tintaRestante = 100;;

        c2.acharTampa();
        c2.rabiscar(20);
        c2.fechar();

        c1.status();
        c2.status();
        
    }
}