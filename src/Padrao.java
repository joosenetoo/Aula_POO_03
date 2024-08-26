public class Padrao {
    String nome;
    int idade;

    // Construtor padrão
    Padrao(){
        nome = "Desconhecido";
        idade = 0;

    }
    void displayInfo() {
        System.out.println("Nome:" + nome + " Idade: " + idade);
    }
}
