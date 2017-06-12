package grammar;

/**
 * Created by Cawa on 12.06.2017.
 */
public class RegexpToken {
    String regexp;
    boolean skip = false;
    public RegexpToken(String r) {
        regexp = r;
    }

    public void setSkip(boolean b) {
        skip = b;
    }
}
