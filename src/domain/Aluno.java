package domain;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private String genero;

    public Aluno(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "(" +
                nome +
                ", " + genero +
                ')';
    }

    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

}