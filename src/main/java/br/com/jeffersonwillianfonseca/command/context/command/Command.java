package br.com.jeffersonwillianfonseca.command.context.command;

import br.com.jeffersonwillianfonseca.command.context.context.CommandContext;

public interface Command {
    void execute(CommandContext context);
}
