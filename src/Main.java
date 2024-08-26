public class Main {
    public static void main(String[] args) {
        // Usando o construtor parametrizado
        Car car1 = new Car("Toyota", 2022);

        // Usando o construtor padrão
        Car car2 = new Car();

        // Usando o construtor padrão (sem parâmetros)
        Carr carr1 = new Carr();
        carr1.displayInfo(); // Saída: Model: Unknown Model, Year: 2020, Color: White

        // Usando o construtor com dois parâmetros
        Carr carr2 = new Carr("Model X", 2022);
        carr2.displayInfo(); // Saída: Model: Model X, Year: 2022, Color: White

        // Usando o construtor com três parâmetros
        Carr carr3 = new Carr("Model Y", 2023, "Red");
        carr3.displayInfo(); // Saída: Model: Model Y, Year: 2023, Color: Red

        //
        ReutilizarConst recarro1 = new ReutilizarConst();
        recarro1.displayInfo();

        ReutilizarConst recarro2 = new ReutilizarConst("Fusca", 2021);
        recarro2.displayInfo();

        ReutilizarConst recarro3 = new ReutilizarConst("Fusca", 2022, "Branco");
        recarro3.displayInfo();

        // Usando o construtor padrão
        Book book1 = new Book();
        book1.displayInfo();

        // Usando o construtor com título e autor
        Book book2 = new Book("1984", "George Orwell");
        book2.setYear(1949);
        book2.displayInfo();

        // Usando o construtor completo
        Book book3 = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Allen & Unwin");
        book3.displayInfo();

        // Testando os modificadores de acesso
        book3.setTitle("O Hobbit");
        System.out.println("Novo título do book3: " + book3.getTitle());

    }
}