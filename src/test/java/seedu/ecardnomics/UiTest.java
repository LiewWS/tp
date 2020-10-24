package seedu.ecardnomics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seedu.ecardnomics.deck.Deck;
import seedu.ecardnomics.deck.FlashCard;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.ecardnomics.Ui.printNewDeck;
import static seedu.ecardnomics.Ui.printDeletedDeckQuestion;
import static seedu.ecardnomics.Ui.printDeckDeletedLine;
import static seedu.ecardnomics.Ui.printUpdateQuestionLine;
import static seedu.ecardnomics.Ui.printUpdateAnswerLine;

public class UiTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void printMessage_singleLine_goodFormat() {
        String singleLine = "Hello! Welcome to eCardnomics!\t\t\tFlashCards Application.";
        String message = Ui.DASH_LINES + System.lineSeparator() + singleLine + System.lineSeparator()
                + Ui.DASH_LINES + System.lineSeparator();
        Ui.printMessage(singleLine);
        assertEquals(message, outContent.toString());
    }

    @Test
    void printNormalPrompt() {
    }

    @Test
    void printDeckPrompt() {
    }

    @Test
    void printPrompt() {
    }

    @Test
    void printNormalWelcome() {
    }

    @Test
    void printDeckWelcome() {
    }

    @Test
    void printGreeting() {
    }

    @Test
    void printExitLine() {
    }

    @Test
    void printNotRecognisedLine() {
    }

    @Test
    void printAddFlashCardLine() {
    }

    @Test
    void printEnterQuestionLine() {
    }

    @Test
    void printEnterAnswerLine() {
    }

    @Test
    void printFlashCardAddedLine() {
    }

    @Test
    void printDeck() {
    }

    @Test
    void printDeleteFlashCardLine() {
    }

    @Test
    void printFlashCardDeletedLine() {
    }

    @Test
    void printHelp() {
    }

    @Test
    void printNewDeck_newDeckName_deckName() {

        String expectedOutput =  "------------------------------------------------------------" + System.lineSeparator()
                + "New deck created: Pokemon" + System.lineSeparator()
                + "------------------------------------------------------------" + System.lineSeparator();
        printNewDeck(new Deck("Pokemon"));
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void printDeckList() {
    }

    @Test
    void printDeletedDeckQuestion_deletedDeckName_questionLine() {
        String expectedOutput = "Do you want to delete Pokemon deck? [y/n]";
        Ui.printDeletedDeckQuestion("Pokemon");
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void printDeletedDeck_deletedDeckName_confirmation() {
        String expectedOutput = "Pokemon has been deleted." + System.lineSeparator();
        printDeckDeletedLine("Pokemon");
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void printUpdateQuestionLine_existingFlashCard_updateQuestionLine() {
        String question = "Old question";
        String answer = "Old answer";
        FlashCard existingCard = new FlashCard(question, answer);
        String expectedOutput = existingCard.toString(true, 0) + System.lineSeparator()
                + "New Question: " + System.lineSeparator() + "  > ";
        printUpdateQuestionLine(existingCard);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void printUpdateAnswerLine_existingFlashCard_updateAnswerLine() {
        String question = "Old question";
        String answer = "Old answer";
        FlashCard existingCard = new FlashCard(question, answer);
        String expectedOutput = existingCard.toString(false, 0) + System.lineSeparator()
                + "New Answer: " + System.lineSeparator() + "  > ";
        printUpdateAnswerLine(existingCard);
        assertEquals(expectedOutput, outContent.toString());
    }
}
