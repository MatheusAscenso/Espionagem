package main.java.br.com.espionagem.service;

import main.java.br.com.espionagem.model.Espionagem;

public class EspionagemService {
    public boolean podeEspionar(Espionagem espionagem) {
    	return espionagem.isPrisioneiroAcordado() || 
    	           (!espionagem.isCavaleiroAcordado() && !espionagem.isArqueiroAcordado());
    }
}