package Sunburst;
import java.util.HashMap;
import java.util.Map;

public class StopWords {

	public static Map<String, Boolean> getStopWords() {
		Map<String, Boolean> map = new HashMap<String, Boolean>();

		// special words in this project
		map.put("layout", true);
		map.put("post", true);
		map.put("modified", true);
		map.put("categories", true);
		map.put("excerpt", true);
		map.put("tags", true);
		map.put("image", true);
		map.put("feature", true);
		map.put("date", true);
		map.put("line", true);
		map.put("number", true);
		map.put("blog", true);
		map.put("life", true);
		map.put("tech", true);
		map.put("s", true);
		map.put("title", true);
		map.put("kg", true);
		map.put("case", true);
		map.put("cookies", true);
		map.put("http", true);
		map.put("site", true);
		map.put("view", true);
		map.put("controller", true);
		map.put("com", true);
		map.put("model", true);
		map.put("images", true);
		map.put("input", true);
		map.put("url", true);
		map.put("jpg", true);
		map.put("output", true);
		map.put("www", true);
		map.put("gallery", true);
		map.put("center", true);
		map.put("export", true);
		map.put("iframe", true);
		map.put("format", true);
		map.put("frameborder", true);
		map.put("embed", true);
		map.put("oembed", true);
		map.put("order", true);
		map.put("row", true);
		map.put("height", true);
		map.put("here", true);
		map.put("src", true);
		map.put("odata", true);
		map.put("true", true);
		map.put("false", true);
		map.put("org", true);
		map.put("file", true);

		// chinese stop words
		map.put("人", true);

		// normal stop words
		map.put("a", true);
		map.put("able", true);
		map.put("about", true);
		map.put("across", true);
		map.put("after", true);
		map.put("all", true);
		map.put("almost", true);
		map.put("also", true);
		map.put("am", true);
		map.put("among", true);
		map.put("an", true);
		map.put("and", true);
		map.put("any", true);
		map.put("are", true);
		map.put("as", true);
		map.put("at", true);
		map.put("be", true);
		map.put("because", true);
		map.put("been", true);
		map.put("but", true);
		map.put("by", true);
		map.put("can", true);
		map.put("cannot", true);
		map.put("could", true);
		map.put("dear", true);
		map.put("did", true);
		map.put("do", true);
		map.put("does", true);
		map.put("either", true);
		map.put("else", true);
		map.put("ever", true);
		map.put("every", true);
		map.put("for", true);
		map.put("from", true);
		map.put("get", true);
		map.put("got", true);
		map.put("had", true);
		map.put("has", true);
		map.put("have", true);
		map.put("he", true);
		map.put("her", true);
		map.put("hers", true);
		map.put("him", true);
		map.put("his", true);
		map.put("how", true);
		map.put("however", true);
		map.put("i", true);
		map.put("if", true);
		map.put("in", true);
		map.put("into", true);
		map.put("is", true);
		map.put("it", true);
		map.put("its", true);
		map.put("just", true);
		map.put("least", true);
		map.put("let", true);
		map.put("like", true);
		map.put("likely", true);
		map.put("may", true);
		map.put("me", true);
		map.put("might", true);
		map.put("most", true);
		map.put("must", true);
		map.put("my", true);
		map.put("neither", true);
		map.put("no", true);
		map.put("nor", true);
		map.put("not", true);
		map.put("of", true);
		map.put("off", true);
		map.put("often", true);
		map.put("on", true);
		map.put("only", true);
		map.put("or", true);
		map.put("other", true);
		map.put("our", true);
		map.put("own", true);
		map.put("rather", true);
		map.put("said", true);
		map.put("say", true);
		map.put("says", true);
		map.put("she", true);
		map.put("should", true);
		map.put("since", true);
		map.put("so", true);
		map.put("some", true);
		map.put("than", true);
		map.put("that", true);
		map.put("the", true);
		map.put("their", true);
		map.put("them", true);
		map.put("then", true);
		map.put("there", true);
		map.put("these", true);
		map.put("they", true);
		map.put("this", true);
		map.put("tis", true);
		map.put("to", true);
		map.put("too", true);
		map.put("twas", true);
		map.put("us", true);
		map.put("wants", true);
		map.put("was", true);
		map.put("we", true);
		map.put("were", true);
		map.put("what", true);
		map.put("when", true);
		map.put("where", true);
		map.put("which", true);
		map.put("while", true);
		map.put("who", true);
		map.put("whom", true);
		map.put("why", true);
		map.put("will", true);
		map.put("with", true);
		map.put("would", true);
		map.put("yet", true);
		map.put("you", true);
		map.put("your", true);
		return map;
	}
}
