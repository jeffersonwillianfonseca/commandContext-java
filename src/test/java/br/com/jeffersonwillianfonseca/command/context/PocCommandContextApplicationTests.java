package br.com.jeffersonwillianfonseca.command.context;

import java.util.Arrays;

import br.com.jeffersonwillianfonseca.command.context.context.CommandContext;
import br.com.jeffersonwillianfonseca.command.context.command.CriarUsuarioCommand;
import org.junit.jupiter.api.Test;

import br.com.jeffersonwillianfonseca.command.context.command.ProcessUserCommand;
import br.com.jeffersonwillianfonseca.command.context.processors.CommandProcessor;

class PocCommandContextApplicationTests {

	@Test
	void testCommandContext() {

		CommandContext context = new CommandContext();
        
        CommandProcessor processor = new CommandProcessor(
            Arrays.asList(new CriarUsuarioCommand(), new ProcessUserCommand())
        );

        processor.process(context);
	}

}
