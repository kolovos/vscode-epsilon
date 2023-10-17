package org.eclipse.epsilon.lsp;

import com.beust.jcommander.Parameter;

public class CommandLineParameters {
    
    @Parameter(names = {"-p", "-port"}, description = "The port that the language server listens to", required = true)
    protected Integer port;

}
