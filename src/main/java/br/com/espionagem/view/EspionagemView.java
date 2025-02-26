package main.java.br.com.espionagem.view;

import java.util.Scanner;

import main.java.br.com.espionagem.model.Espionagem;
import main.java.br.com.espionagem.service.EspionagemService;

public class EspionagemView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O cavaleiro está acordado? (true/false): ");
        boolean cavaleiro = scanner.nextBoolean();

        System.out.println("O arqueiro está acordado? (true/false): ");
        boolean arqueiro = scanner.nextBoolean();

        System.out.println("O prisioneiro está acordado? (true/false): ");
        boolean prisioneiro = scanner.nextBoolean();

        Espionagem espionagem = new Espionagem(cavaleiro, arqueiro, prisioneiro);
        EspionagemService service = new EspionagemService();
        boolean resultado = service.podeEspionar(espionagem);

        System.out.println("O grupo pode ser espionado? " + resultado);
        
        scanner.close();
    }
}
