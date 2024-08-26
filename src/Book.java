class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;

    // Construtor padrão
    public Book() {
        this.title = "Título Desconhecido";
        this.author = "Autor Desconhecido";
        this.year = 0;
        this.publisher = "Editora Desconhecida";
    }

    // Construtor com título e autor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;
        this.publisher = "Editora Desconhecida";
    }

    // Construtor completo
    public Book(String title, String author, int year, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    // Método para exibir as informações do livro
    public void displayInfo() {
        System.out.println("Título: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("Ano: " + this.year);
        System.out.println("Editora: " + this.publisher);
        System.out.println();
    }

    // Getters e Setters para encapsulamento
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Título inválido!");
        } else {
            this.title = title;
        }
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            System.out.println("Autor inválido!");
        } else {
            this.author = author;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < 0) {
            System.out.println("Ano inválido!");
        } else {
            this.year = year;
        }
    }
}

