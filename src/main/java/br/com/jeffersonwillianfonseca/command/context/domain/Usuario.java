package br.com.jeffersonwillianfonseca.command.context.domain;

public record Usuario(
    String id, 
    String name
) {

    public boolean isProcessed(boolean processed) {
        // Simula o processamento do usuário
        if (processed) {
            System.out.println("Usuário " + name + " já processado.");
            return false;
        }
        System.out.println("Usuário " + name + " processado: " + processed);
        return processed;
    }

}
