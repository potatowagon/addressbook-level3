package seedu.addressbook.commands;

import seedu.addressbook.logic.Logic;

public class UndoCommand extends Command{
	 
	 boolean modifiesData=false;
	
	 public static final String COMMAND_WORD = "undo";
	 
	 public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Undos previous action that modifies address book information.\n\t"
	            + "Example: " + COMMAND_WORD;

	@Override
	public CommandResult execute() {
		addressBook=Logic.stateStack.pop();
		Command undoneAction=Logic.modifyingDataCommandHistory.pop();
		return new CommandResult("Successfully undid previous "+undoneAction.COMMAND_WORD);		
	}

}
