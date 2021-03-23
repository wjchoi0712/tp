package seedu.duke.command;

import seedu.duke.DailyRoute;
import seedu.duke.History;
import seedu.duke.NotesManager;
import seedu.duke.routing.Router;
import seedu.duke.UiManager;

public class ListNoteCommand extends Command {
    public ListNoteCommand(String userInput) {
        super(userInput);
    }

    @Override
    public void execute(Router router, UiManager ui, History history, NotesManager notesManager, DailyRoute dailyRoute) {
        notesManager.parseListNotesCommandAndListNotes(userInput);;
    }
}
