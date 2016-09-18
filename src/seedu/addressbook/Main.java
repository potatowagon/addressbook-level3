package seedu.addressbook;

import javafx.application.Application;

import javafx.stage.Stage;
import seedu.addressbook.logic.Logic;
import seedu.addressbook.ui.Gui;
import seedu.addressbook.ui.Stoppable;

/**
 * Main entry point to the application.
 */
public class Main extends Application implements Stoppable{

    /** Version info of the program. */
    public static final String VERSION = "AddessBook Level 3 - Version 1.0";

    private Gui gui;

    @Override
    public void start(Stage primaryStage) throws Exception{
        gui = new Gui(new Logic(), VERSION);
        gui.start(primaryStage, this);
    }

    public static void main(String[] args) {
        launch(args);
    }
}


