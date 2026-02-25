public class Main {
    public static void main(String[] args){
        carro meuCarro = new carro("vermelho", "fusca", 1980);
        meuCarro.acelerar();
        meuCarro.frear();
        System.out.println();
        carro meuCarro1 = new carro("cinza", "creta", 2016 );
        meuCarro1.acelerar();
        meuCarro1.frear();
        System.out.println();
        carro meuCarro2 = new carro("Branco", "fusion ", 2015);
        meuCarro2.acelerar();
        meuCarro2.frear();
        System.out.println();
        carro meuCarro3 = new carro("amarelo", "fusca", 1980);
        meuCarro3.acelerar();
        meuCarro3.frear();
    }

}
