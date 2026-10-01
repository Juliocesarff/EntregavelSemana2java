public class Carro {
    String modelo;
    String marca;
    int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void dados(){
        System.out.println("Marca "+ marca);
        System.out.println("Modelo "+ modelo);
        System.out.println("Ano "+ ano);
    }
}
