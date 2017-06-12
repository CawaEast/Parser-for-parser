package grammar;

import java.util.Vector;

/**
 * Created by Cawa on 12.06.2017.
 */

public class NonTerminal {
    String name;
    Vector<Vector<MyGrammarToken>> rules;
    Vector<MyGrammarToken> rule;

    public NonTerminal(String s) {
        name = s;
        rules = new Vector<Vector<MyGrammarToken>>();
    }


    public void addRule() {
        rule = new Vector<MyGrammarToken>();
    }

    public void addToken(MyGrammarToken t) {
        rule.add(t);
    }

    public void endRule() {
        rules.add(rule);
    }
}
