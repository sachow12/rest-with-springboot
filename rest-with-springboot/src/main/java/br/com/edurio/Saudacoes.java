package br.com.edurio;
//model
public class Saudacoes {
    private final long id;
    private final String content;

    public Saudacoes(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }
}
