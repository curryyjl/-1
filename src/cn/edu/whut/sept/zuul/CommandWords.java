package cn.edu.whut.sept.zuul;

public class CommandWords
{
    //Specifies the effective first field set of the command
    private static final String[] validCommands = {
            "go", "quit", "help","look","back"
    };

    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * Get the command string and judge whether it is a legal string
     * @return return returns true if it is a valid string, otherwise it returns false
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }

    //Output all valid commands
    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
