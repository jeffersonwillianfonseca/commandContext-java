package br.com.jeffersonwillianfonseca.command.context.command;

import br.com.jeffersonwillianfonseca.command.context.context.CommandContext;
import br.com.jeffersonwillianfonseca.command.context.domain.Usuario;

public class CriarUsuarioCommand implements Command {
    @Override
    public void execute(CommandContext context) {
        Usuario user = new Usuario("123", "Jeff");
        context.put("user", user);
        System.out.println("Usuário carregado: " + user);
    }
}
