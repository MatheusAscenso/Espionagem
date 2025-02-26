package main.java.br.com.espionagem.model;

public class Espionagem {
    private boolean cavaleiroAcordado;
    private boolean arqueiroAcordado;
    private boolean prisioneiroAcordado;

    public Espionagem(boolean cavaleiroAcordado, boolean arqueiroAcordado, boolean prisioneiroAcordado) {
        this.cavaleiroAcordado = cavaleiroAcordado;
        this.arqueiroAcordado = arqueiroAcordado;
        this.prisioneiroAcordado = prisioneiroAcordado;
    }

    public boolean isCavaleiroAcordado() {
        return cavaleiroAcordado;
    }

    public boolean isArqueiroAcordado() {
        return arqueiroAcordado;
    }

    public boolean isPrisioneiroAcordado() {
        return prisioneiroAcordado;
    }
}
