package br.com.jeffersonwillianfonseca.command.context.processors;

import java.util.List;

import br.com.jeffersonwillianfonseca.command.context.context.CommandContext;
import br.com.jeffersonwillianfonseca.command.context.command.Command;

public class CommandProcessor {
    private final List<Command> commands;

    public CommandProcessor(List<Command> commands) {
        this.commands = commands;
    }

    public void process(CommandContext context) {
        for (Command command : commands) {
            command.execute(context);
        }
    }
}
