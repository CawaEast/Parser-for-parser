package grammar;

import java.util.Vector;

/**
 * Created by Cawa on 12.06.2017.
 */
public class Terminal {
    String name;
    RegexpToken regexp;

    public Terminal(String s, RegexpToken r) {
        name = s;
        regexp = r;
    }
}
