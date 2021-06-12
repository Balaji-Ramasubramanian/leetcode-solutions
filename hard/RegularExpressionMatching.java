//Problem URL: https://leetcode.com/problems/regular-expression-matching/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularExpressionMatching {

	// Using Pattern class & Matcher class to check the regex matching for given string
    public boolean isMatch(String s, String p) {
	    Pattern r = Pattern.compile(p);
	    Matcher m = r.matcher(s);
	    return m.matches();
    }
}