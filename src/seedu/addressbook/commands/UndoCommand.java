package seedu.addressbook.commands;

import java.util.EmptyStackException;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.logic.Logic;

public class UndoCommand extends Command{
	 
	 public static boolean modifiesData=false;
	
	 public static final String COMMAND_WORD = "undo";
	 
	 public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Undos previous action that modifies address book information.\n\t"
	            + "Example: " + COMMAND_WORD;

	@Override
	public CommandResult execute() {
		try{
		addressBook=Logic.stateStack.pop();
		Command undoneAction=Logic.modifyingDataCommandHistory.pop();
		return new CommandResult("Successfully undid previous "+undoneAction.COMMAND_WORD);
		
		} catch (EmptyStackException e){
			return new CommandResult("No actions to undo.");
		}
		
				
	}

}
