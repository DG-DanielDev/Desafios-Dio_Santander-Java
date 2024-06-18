package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatosSelecionados = {"MATHEUS","GABRIELLA", "TÂNIA","ROBERTA","DANIEL" };
        for(String candidato : candidatosSelecionados) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
	}

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"MATHEUS","GABRIELLA", "TÂNIA","ROBERTA","DANIEL"};

        System.out.println("Forma não abreviada do laço for: ");
        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato para a vaga de índice nº" + (i+1) + " foi " + candidatos[i]);
        }

        System.out.println(" ");
        System.out.println("Forma abreviada do laço como for each: ");
        for(String candidato : candidatos) {
            System.out.println("O candidato para a vaga selecionado para a vaga é " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"MATHEUS","TÂNIA","ROBERTA","DANIEL","AUGUSTO","GABRIELLA","VICTOR","MIRELA","DANIELA","ANTÔNIO"};

        int candidatosSelecionados = 0; // quantos candidados foram selecionados
        int candidatoAtual = 0; // índice do candidato selecionado no momento
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual]; // elemento do índice
            double salarioPretendido = valorPretendido();

            System.out.println(" ");
            System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1750, 2320);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }
        else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}