package grammar;

import java.util.HashMap;
import java.util.Vector;

/**
 * Created by Cawa on 12.06.2017.
 */
public class Grammar {
    public String name;
    HashMap<String, Terminal>terminals;
    HashMap<String, NonTerminal>nonTerminals;

    public Grammar() {
        terminals = new HashMap<String, Terminal>();
        nonTerminals = new HashMap<String, NonTerminal>();
    }

    public void setName(String n) {
        name = n;
    }

    public void addNonTerminal(NonTerminal nt) {
        nonTerminals.put(nt.name, nt);
    }

    public void addTermonal(Terminal t) {
        terminals.put(t.name, t);
    }
}
