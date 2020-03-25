package nl.ou.taalapp.model;

import java.util.Map;

public class WordMap {

    /* worldMapID can be replaced with another type: like ID type */
    private long wordMapID;
    private String name;
    private long owner;
    /* The Long type can be replaced by a class ID  */
    private Map<Long, Card> cards;
    private Map<Long, Arrow> arrows;

    public WordMap() {

    }


}
