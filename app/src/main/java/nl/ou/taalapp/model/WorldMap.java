package nl.ou.taalapp.model;

import java.util.Map;

public class WorldMap {

    /* worldMapID can be replaced with another type: like ID type */
    private long wordMapID;
    private String name;
    private long owner;
    private Map<Long, Card> cards;
    private Map<Long, Arrow> arrows;

    public WorldMap() {

    }


}
