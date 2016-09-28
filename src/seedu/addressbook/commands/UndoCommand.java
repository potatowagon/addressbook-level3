package seedu.addressbook.commands;

public class UndoCommand extends Command{
	 
	 boolean modifiesData=false;
	
	 public static final String COMMAND_WORD = "undo";
	 
	 public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Undos previous action that modifies address book information.\n\t"
	            + "Example: " + COMMAND_WORD;

	@Override
	public CommandResult execute() {
		
		return null;
	}

}
