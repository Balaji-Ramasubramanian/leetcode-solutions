import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
	    Pattern r = Pattern.compile(p);
	    Matcher m = r.matcher(s);
	    return m.matches();
    }
}