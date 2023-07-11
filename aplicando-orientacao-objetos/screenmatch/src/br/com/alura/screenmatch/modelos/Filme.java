package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia() / 2;
    }

    @Override
    public String toString() { //reescrevendo o método da superclasse Object
        return "Filme: " + this.getNome() + " ("+ this.getAnoDeLancamento() + ")" ;
        //return super.toString(); isso devolveria o que a superclasse (mãe) devolve
    }
}
