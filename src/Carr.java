class Carr {
    String model;
    int year;
    String color;

    // Construtor 1: Sem parâmetros (valores padrão)
    Carr() {
        this.model = "Unknown Model";
        this.year = 2020;
        this.color = "White";
    }

    // Construtor 2: Com dois parâmetros
    Carr(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "White"; // Cor padrão
    }

    // Construtor 3: Com três parâmetros
    Carr(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}
