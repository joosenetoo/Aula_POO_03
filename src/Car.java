class Car {
    String model;
    int year;

    // Construtor parametrizado
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Construtor padrão
    Car() {
        model = "Desconhecido";
        year = 2000;
    }
}