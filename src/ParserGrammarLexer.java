// Generated from D:/projects/mar/Parser for  parser/src\ParserGrammar.g4 by ANTLR 4.7

    import grammar.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TermName=7, NonTermName=8, 
		MagicChar=9, String=10, Regexp=11, Whitespace=12, Newline=13, LineComment=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TermName", "NonTermName", 
		"MagicChar", "String", "Regexp", "Whitespace", "Newline", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grammar'", "';'", "':'", "'->'", "'skip'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TermName", "NonTermName", "MagicChar", 
		"String", "Regexp", "Whitespace", "Newline", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    Grammar grammar = new Grammar();
	    ArrayList<String> words = new ArrayList<String>();
	    static void wr(String x) {System.out.print(x);}
	    static void tabs(int amount) {for(int i=0; i<amount; i++) System.out.print(' ');}


	public ParserGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\7\b"+
		"8\n\b\f\b\16\b;\13\b\3\t\3\t\7\t?\n\t\f\t\16\tB\13\t\3\n\3\n\3\13\3\13"+
		"\7\13H\n\13\f\13\16\13K\13\13\3\13\3\13\3\f\3\f\7\fQ\n\f\f\f\16\fT\13"+
		"\f\3\f\3\f\5\fX\n\f\3\f\6\f[\n\f\r\f\16\f\\\3\f\5\f`\n\f\5\fb\n\f\3\r"+
		"\6\re\n\r\r\r\16\rf\3\r\3\r\3\16\3\16\5\16m\n\16\3\16\5\16p\n\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\7\17x\n\17\f\17\16\17{\13\17\3\17\3\17\4IR\2"+
		"\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\3\2\t\3\2C\\\4\2C\\c|\3\2c|\4\2,-AA\n\2)-\61\61AAC\\^^c|~~\u0080\u0080"+
		"\4\2\13\13\"\"\4\2\f\f\17\17\2\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\3\37\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13.\3\2\2\2\r\63\3"+
		"\2\2\2\17\65\3\2\2\2\21<\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27a\3\2\2\2\31"+
		"d\3\2\2\2\33o\3\2\2\2\35s\3\2\2\2\37 \7i\2\2 !\7t\2\2!\"\7c\2\2\"#\7o"+
		"\2\2#$\7o\2\2$%\7c\2\2%&\7t\2\2&\4\3\2\2\2\'(\7=\2\2(\6\3\2\2\2)*\7<\2"+
		"\2*\b\3\2\2\2+,\7/\2\2,-\7@\2\2-\n\3\2\2\2./\7u\2\2/\60\7m\2\2\60\61\7"+
		"k\2\2\61\62\7r\2\2\62\f\3\2\2\2\63\64\7~\2\2\64\16\3\2\2\2\659\t\2\2\2"+
		"\668\t\3\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\20\3\2\2\2"+
		";9\3\2\2\2<@\t\4\2\2=?\t\3\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2"+
		"A\22\3\2\2\2B@\3\2\2\2CD\t\5\2\2D\24\3\2\2\2EI\7)\2\2FH\13\2\2\2GF\3\2"+
		"\2\2HK\3\2\2\2IJ\3\2\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7)\2\2M\26\3"+
		"\2\2\2NR\7]\2\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SU\3"+
		"\2\2\2TR\3\2\2\2UW\7_\2\2VX\5\27\f\2WV\3\2\2\2WX\3\2\2\2Xb\3\2\2\2Y[\t"+
		"\6\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\5\27\f\2"+
		"_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2aN\3\2\2\2aZ\3\2\2\2b\30\3\2\2\2ce\t\7\2"+
		"\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\r\2\2i\32\3\2"+
		"\2\2jl\7\17\2\2km\7\f\2\2lk\3\2\2\2lm\3\2\2\2mp\3\2\2\2np\7\f\2\2oj\3"+
		"\2\2\2on\3\2\2\2pq\3\2\2\2qr\b\16\2\2r\34\3\2\2\2st\7\61\2\2tu\7\61\2"+
		"\2uy\3\2\2\2vx\n\b\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2"+
		"\2{y\3\2\2\2|}\b\17\2\2}\36\3\2\2\2\17\29@IRW\\_afloy\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}