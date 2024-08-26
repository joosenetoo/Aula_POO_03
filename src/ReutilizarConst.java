class ReutilizarConst {
    String model;
    int year;
    String color;

    // Construtor 1: Sem parâmetros (valores padrão)
    ReutilizarConst() {
        this("Unknown Model", 2020, "White"); // Chamando o construtor 3 com valores padrão
    }

    // Construtor 2: Com dois parâmetros
    ReutilizarConst(String model, int year) {
        this(model, year, "White"); // Chamando o construtor 3 e definindo a cor padrão como "White"
    }

    // Construtor 3: Com três parâmetros
    ReutilizarConst(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}