package edu.iis.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	
	private int x;
	private int y;
	
	private List<PlotterCommand> plotterCommandList;
	
	public ComplexCommand() {
	}

	@Override
	public void execute(IPlotter plotter) {
		
	}
}
