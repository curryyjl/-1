package cn.edu.whut.sept.zuul;

public class Command
{
    /**
     * Instruction information
     */
    private String commandWord;
    private String secondWord;

    //Instruction constructor
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /**
     * Get the first field of the command.
     * @returnGet the first field of the command.
     */
    public String getCommandWord()
    {
        return commandWord;
    }

    /**
     * Get the second field of the command.
     * @return the second field of the command.
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * Determine whether the first field of the command is empty.
     * @return  Return true if it is empty, otherwise return false.
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    /**
     * Determine whether the second field of the command is empty.
     * @return  Return true if it is empty, otherwise return false.
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
