public class Main {
    static void main() {
        Pessoa p1 = new Pessoa("Marcio",22, "Dev BackEnd");
        Pessoa p2 = new Pessoa("Junior",23, "Dev FrontEnd");
        Pessoa p3 = new Pessoa("Freire",24, "Dev FullStack");

        Pessoa maisVelha = p1;
        if (p2.idade > maisVelha.idade){
            maisVelha = p2;
        }
        if(p3.idade > maisVelha.idade){
            maisVelha = p3;
        }
        System.out.println("O mais velho é " + maisVelha.nome +
                " com " + maisVelha.idade + " anos.");

        Carro carro1 = new Carro("Volkswagen", "UP", 2020);
        Carro carro2 = new Carro("Chevrolet", "Onix", 2021);

        System.out.println("dados antes de mudanca");
        carro1.dados();
        carro2.dados();

        carro1.ano = 2024;
        System.out.println("dados apos mudanca");
        carro1.dados();
        carro2.dados();
//         *
//         * RESPOSTA DO EXERCÍCIO 2:
//         *
//         * Por que a alteração em um carro não afetou o outro?
//         *
//         * Na Programação Orientada a Objetos, a classe (Carro) serve apenas como um "molde".
//         * Quando usamos o operador 'new', cada objeto (carro1 e carro2) é alocado em um espaço
//         * independente na memória heap.
//         *
//         * Cada instância possui sua própria cópia dos atributos. Portanto, alterar o atributo 'ano'
//         * do objeto 'carro1' modifica apenas o valor armazenado na memória daquela instância específica,
//         * sem interferir no estado ou nos dados da instância 'carro2'.
//
    }

}