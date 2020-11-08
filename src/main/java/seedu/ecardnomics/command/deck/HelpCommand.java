package seedu.ecardnomics.command.deck;

import seedu.ecardnomics.Ui;

public class HelpCommand extends DeckCommand {
    public static final String DECK_HELP = ""
            + "eCardnomics.\n"
            + "Deck Mode.\n"
            + "\n"
            + "Usage:\n"
            + "  add         [<qn> /ans <ans>]          Adds a new flash card to the current deck.\n"
            + "  list        [/ans]                     Lists all flash cards in the current deck, optionally with"
            + "answers.\n"
            + "  delete <ix> [-y]                       Deletes the flash card at list index <ix> from the current"
            + " deck.\n"
            + "  update <ix>                            Updates the flash card at list index <ix> from the current"
            + " deck.\n"
            + "  pptx        [-y] [-cs <index> |        Creates a PowerPoint slides based on the current deck.\n"
            + "              -oc <bg color> <txt color>]\n"
            + "  start                                  Enter Game Mode for this deck! Do your best!\n"
            + "  done                                   Exits from Deck Mode and returns to Normal Mode.\n"
            + "  exit                                   Exits the program.\n"
            + "  help                                   Show this output.\n"
            + "\n"
            + "Options:\n"
            + "  --version                        Show version.";

    public HelpCommand() {
        super();
    }

    @Override
    public void execute() {
        Ui.printHelp(DECK_HELP);
    }
}
