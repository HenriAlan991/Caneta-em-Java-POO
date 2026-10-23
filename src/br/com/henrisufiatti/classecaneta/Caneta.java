package br.com.henrisufiatti.classecaneta;

public class Caneta{

    String cor;
    float tamanhoPonta;
    int tintaRestante;


    boolean existeTampa;
    boolean tampado;
    

    void status(){
        
        System.out.println("COR: " + cor);
        System.out.println("TAMANHO PONTA: " + tamanhoPonta);
        System.out.println("TINTA RESTANTE: " + tintaRestante + "%");
        System.out.println("EXISTE TAMPA: " + existeTampa);
        System.out.println("TAMPADO: " + tampado);
    }

    void abrir(){
        if(existeTampa){
            if(tampado == true){
                this.tampado = false;
                System.out.println("A Caneta foi aberta!");

            }
            else{
                System.out.println("A Caneta já está aberta!");

            }
        }
        else{
            System.out.println("Não encontrei a tampa para eu abrir!");
        }
    }
    
    void fechar(){
        if(existeTampa){
                if(tampado == false){
                    this.tampado = true;
                    System.out.println("A Caneta foi tampada!");

                }
                else{
                    System.out.println("A Caneta já está tampada!");
                }



        }
        else{
            System.out.println("Não encontrei a tampa para eu fechar!");
        }
    }

    void acharTampa(){
        if(existeTampa){
            System.out.println("A Tampa já possui uma tampa!");
        }
        else{
            this.existeTampa = true;
    }
    }

    void rabiscar(int vezes){
        if(!tampado){
            if(tintaRestante >= vezes){
                if(vezes <=100 && vezes >= 1){
                    this.tintaRestante -= vezes;
                    
                    System.out.println("RABISCANDO...");
                    if(vezes == 100){
                        System.out.println("Você usou 100% da tinta!");
                        System.out.println("Você não possui mais tinta restante.");
                    }
                    else{
                        System.out.println("Você usou " + vezes + "% da tinta.");
                        System.out.println("Você possui " + tintaRestante + "% de tinta restante.");
                    }
                    
                    

                }
                else{
                    System.out.println("Coloque um valor válido de vezes!");
                }

            }
            else{
                System.out.println("Você não possui tinta suficiente para rabiscar essa quantidade de vezes!");
            }

        }
        else{
            System.out.println("Não é possível rabiscar, a caneta está tampada!");
        }
    }


}
