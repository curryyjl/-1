package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

public class Room
{
    /**
     * Execute the game command entered by the user
     * description Indicates a detailed description of this room
     * exits Store all the exits of the current room, which can lead to another room
     */
    private String description;
    private HashMap<String, Room> exits;

    /**
     * Initialize the room
     * @param description The description of the room, directly stipulated
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * Add a certain exit to the room, pointing to another room
     * @param direction Direction of exit
     * @param neighbor Adjacent room after passing the exit
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * Get a brief description of the room
     * @return The  brief description of the room
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Get a detailed description of the room
     * @return The detailed description of the room
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    /**
     * Get all the exits of the room
     * @return Strings concatenated in all export directions
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Get a room at an exit of the room
     * @param direction The direction of the exit
     * @return Neighbor room
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}


