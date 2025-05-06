package br.com.jeffersonwillianfonseca.command.context.command;

import br.com.jeffersonwillianfonseca.command.context.context.CommandContext;
import br.com.jeffersonwillianfonseca.command.context.domain.Usuario;

public class ProcessUserCommand implements Command {
    @Override
    public void execute(CommandContext context) {
        context.get("user", Usuario.class).ifPresent(user -> {
            user.isProcessed(true);
            System.out.println("Usuário processado: " + user);
        });
    }
}
