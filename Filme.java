public class Filme {
    private String titulo;  // Nome do filme
    private int duracao;    // Duração do filme
    private String genero;  // Gênero do filme

    // Construtor
    public Filme(String titulo, int duracao, String genero) {
        setTitulo(titulo);
        setDuracao(duracao);
        setGenero(genero);
    }

    // Getter e Setter para título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        // Verificação de título
        if (titulo == null && titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode estar vazio.");
        }
        this.titulo = titulo;
    }

    // Getter e Setter para duração
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            throw new IllegalArgumentException("A duração deve ser maior que zero.");
        }
        this.duracao = duracao;
    }

    // Getter e Setter para gênero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (!genero.equals("Romance") && !genero.equals("Terror") && !genero.equals("Comédia")) {
            throw new IllegalArgumentException("O gênero deve ser 'Romance', 'Terror' ou 'Comédia'.");
        }
        this.genero = genero;
    }

    // Sobrescrita do método toString para exibir as informações do filme
    @Override
    public String toString() {
        return String.format("Filme: %s, Duração: %d min, Gênero: %s", titulo, duracao, genero);
    }

    // Exemplo de uso
    public static void main(String[] args) {
        try {
            // Criação de um filme com dados válidos
            Filme filme1 = new Filme("Como Eu Era Antes de Você", 110, "Romance");
            System.out.println(filme1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
