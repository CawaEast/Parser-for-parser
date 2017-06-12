// Generated from D:/projects/mar/Parser for  parser/src\ParserGrammar.g4 by ANTLR 4.7

    import grammar.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TermName=7, NonTermName=8, 
		MagicChar=9, String=10, Regexp=11, Whitespace=12, Newline=13, LineComment=14;
	public static final int
		RULE_start = 0, RULE_grammarName = 1, RULE_grammarRules = 2, RULE_grammarRule = 3, 
		RULE_termRule = 4, RULE_nonTermRule = 5, RULE_cases = 6, RULE_caseRule = 7, 
		RULE_token = 8;
	public static final String[] ruleNames = {
		"start", "grammarName", "grammarRules", "grammarRule", "termRule", "nonTermRule", 
		"cases", "caseRule", "token"
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

	@Override
	public String getGrammarFileName() { return "ParserGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Grammar grammar = new Grammar();
	    ArrayList<String> words = new ArrayList<String>();
	    static void wr(String x) {System.out.print(x);}
	    static void tabs(int amount) {for(int i=0; i<amount; i++) System.out.print(' ');}

	public ParserGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public GrammarNameContext grammarName() {
			return getRuleContext(GrammarNameContext.class,0);
		}
		public GrammarRulesContext grammarRules() {
			return getRuleContext(GrammarRulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParserGrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			grammarName();
			setState(19);
			grammarRules();
			setState(20);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarNameContext extends ParserRuleContext {
		public Token i;
		public TerminalNode TermName() { return getToken(ParserGrammarParser.TermName, 0); }
		public TerminalNode NonTermName() { return getToken(ParserGrammarParser.NonTermName, 0); }
		public GrammarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).enterGrammarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).exitGrammarName(this);
		}
	}

	public final GrammarNameContext grammarName() throws RecognitionException {
		GrammarNameContext _localctx = new GrammarNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			((GrammarNameContext)_localctx).i = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TermName || _la==NonTermName) ) {
				((GrammarNameContext)_localctx).i = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(24);
			match(T__1);
			grammar.name = (((GrammarNameContext)_localctx).i!=null?((GrammarNameContext)_localctx).i.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRulesContext extends ParserRuleContext {
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public GrammarRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).enterGrammarRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).exitGrammarRules(this);
		}
	}

	public final GrammarRulesContext grammarRules() throws RecognitionException {
		GrammarRulesContext _localctx = new GrammarRulesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				grammarRule();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TermName || _la==NonTermName );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRuleContext extends ParserRuleContext {
		public TermRuleContext termRule() {
			return getRuleContext(TermRuleContext.class,0);
		}
		public NonTermRuleContext nonTermRule() {
			return getRuleContext(NonTermRuleContext.class,0);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).exitGrammarRule(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_grammarRule);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TermName:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				termRule();
				}
				break;
			case NonTermName:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				nonTermRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermRuleContext extends ParserRuleContext {
		public Token name;
		public Token regexp;
		public TerminalNode TermName() { return getToken(ParserGrammarParser.TermName, 0); }
		public TerminalNode Regexp() { return getToken(ParserGrammarParser.Regexp, 0); }
		public TermRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).enterTermRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).exitTermRule(this);
		}
	}

	public final TermRuleContext termRule() throws RecognitionException {
		TermRuleContext _localctx = new TermRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_termRule);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				((TermRuleContext)_localctx).name = match(TermName);
				setState(37);
				match(T__2);
				setState(38);
				((TermRuleContext)_localctx).regexp = match(Regexp);
				setState(39);
				match(T__3);
				setState(40);
				match(T__4);
				setState(41);
				match(T__1);
				RegexpToken rt = new RegexpToken((((TermRuleContext)_localctx).regexp!=null?((TermRuleContext)_localctx).regexp.getText():null)); rt.setSkip(true); grammar.addTermonal(new Terminal((((TermRuleContext)_localctx).name!=null?((TermRuleContext)_localctx).name.getText():null), rt));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((TermRuleContext)_localctx).name = match(TermName);
				setState(44);
				match(T__2);
				setState(45);
				((TermRuleContext)_localctx).regexp = match(Regexp);
				setState(46);
				match(T__1);
				grammar.addTermonal(new Terminal((((TermRuleContext)_localctx).name!=null?((TermRuleContext)_localctx).name.getText():null), new RegexpToken((((TermRuleContext)_localctx).regexp!=null?((TermRuleContext)_localctx).regexp.getText():null))));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTermRuleContext extends ParserRuleContext {
		public Token name;
		public CasesContext cases;
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode NonTermName() { return getToken(ParserGrammarParser.NonTermName, 0); }
		public NonTermRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTermRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).enterNonTermRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).exitNonTermRule(this);
		}
	}

	public final NonTermRuleContext nonTermRule() throws RecognitionException {
		NonTermRuleContext _localctx = new NonTermRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nonTermRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((NonTermRuleContext)_localctx).name = match(NonTermName);
			NonTerminal nt = new NonTerminal((((NonTermRuleContext)_localctx).name!=null?((NonTermRuleContext)_localctx).name.getText():null)); nt.addRule();
			setState(52);
			match(T__2);
			setState(53);
			((NonTermRuleContext)_localctx).cases = cases(nt);
			grammar.addNonTerminal(((NonTermRuleContext)_localctx).cases.nt1);
			setState(55);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasesContext extends ParserRuleContext {
		public NonTerminal nt;
		public NonTerminal nt1;
		public CaseRuleContext caseRule() {
			return getRuleContext(CaseRuleContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CasesContext(ParserRuleContext parent, int invokingState, NonTerminal nt) {
			super(parent, invokingState);
			this.nt = nt;
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).exitCases(this);
		}
	}

	public final CasesContext cases(NonTerminal nt) throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState(), nt);
		enterRule(_localctx, 12, RULE_cases);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				caseRule(nt);
				nt.endRule(); nt.addRule();
				setState(59);
				match(T__5);
				setState(60);
				cases(nt);
				((CasesContext)_localctx).nt1 =  nt;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				caseRule(nt);
				nt.endRule(); ((CasesContext)_localctx).nt1 =  nt;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseRuleContext extends ParserRuleContext {
		public NonTerminal nt;
		public NonTerminal nt1;
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public CaseRuleContext caseRule() {
			return getRuleContext(CaseRuleContext.class,0);
		}
		public CaseRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseRuleContext(ParserRuleContext parent, int invokingState, NonTerminal nt) {
			super(parent, invokingState);
			this.nt = nt;
		}
		@Override public int getRuleIndex() { return RULE_caseRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).enterCaseRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).exitCaseRule(this);
		}
	}

	public final CaseRuleContext caseRule(NonTerminal nt) throws RecognitionException {
		CaseRuleContext _localctx = new CaseRuleContext(_ctx, getState(), nt);
		enterRule(_localctx, 14, RULE_caseRule);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				token(nt);
				((CaseRuleContext)_localctx).nt1 =  nt;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				token(nt);
				setState(72);
				caseRule(nt);
				((CaseRuleContext)_localctx).nt1 =  nt;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenContext extends ParserRuleContext {
		public NonTerminal nt;
		public Token i;
		public TerminalNode TermName() { return getToken(ParserGrammarParser.TermName, 0); }
		public TerminalNode NonTermName() { return getToken(ParserGrammarParser.NonTermName, 0); }
		public TerminalNode String() { return getToken(ParserGrammarParser.String, 0); }
		public TokenContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TokenContext(ParserRuleContext parent, int invokingState, NonTerminal nt) {
			super(parent, invokingState);
			this.nt = nt;
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGrammarListener ) ((ParserGrammarListener)listener).exitToken(this);
		}
	}

	public final TokenContext token(NonTerminal nt) throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState(), nt);
		enterRule(_localctx, 16, RULE_token);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TermName:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				((TokenContext)_localctx).i = match(TermName);
				nt.addToken(new MyGrammarToken((((TokenContext)_localctx).i!=null?((TokenContext)_localctx).i.getText():null), 1));
				}
				break;
			case NonTermName:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				((TokenContext)_localctx).i = match(NonTermName);
				nt.addToken(new MyGrammarToken((((TokenContext)_localctx).i!=null?((TokenContext)_localctx).i.getText():null), 2));
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				((TokenContext)_localctx).i = match(String);
				nt.addToken(new MyGrammarToken((((TokenContext)_localctx).i!=null?((TokenContext)_localctx).i.getText():null), 3));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\6\4\37\n\4\r\4\16\4 \3\5\3\5\5\5%\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bE\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\tN\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nV\n\n\3\n\2\2\13"+
		"\2\4\6\b\n\f\16\20\22\2\3\3\2\t\n\2U\2\24\3\2\2\2\4\30\3\2\2\2\6\36\3"+
		"\2\2\2\b$\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16D\3\2\2\2\20M\3\2\2\2\22"+
		"U\3\2\2\2\24\25\5\4\3\2\25\26\5\6\4\2\26\27\7\2\2\3\27\3\3\2\2\2\30\31"+
		"\7\3\2\2\31\32\t\2\2\2\32\33\7\4\2\2\33\34\b\3\1\2\34\5\3\2\2\2\35\37"+
		"\5\b\5\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\""+
		"%\5\n\6\2#%\5\f\7\2$\"\3\2\2\2$#\3\2\2\2%\t\3\2\2\2&\'\7\t\2\2\'(\7\5"+
		"\2\2()\7\r\2\2)*\7\6\2\2*+\7\7\2\2+,\7\4\2\2,\63\b\6\1\2-.\7\t\2\2./\7"+
		"\5\2\2/\60\7\r\2\2\60\61\7\4\2\2\61\63\b\6\1\2\62&\3\2\2\2\62-\3\2\2\2"+
		"\63\13\3\2\2\2\64\65\7\n\2\2\65\66\b\7\1\2\66\67\7\5\2\2\678\5\16\b\2"+
		"89\b\7\1\29:\7\4\2\2:\r\3\2\2\2;<\5\20\t\2<=\b\b\1\2=>\7\b\2\2>?\5\16"+
		"\b\2?@\b\b\1\2@E\3\2\2\2AB\5\20\t\2BC\b\b\1\2CE\3\2\2\2D;\3\2\2\2DA\3"+
		"\2\2\2E\17\3\2\2\2FG\5\22\n\2GH\b\t\1\2HN\3\2\2\2IJ\5\22\n\2JK\5\20\t"+
		"\2KL\b\t\1\2LN\3\2\2\2MF\3\2\2\2MI\3\2\2\2N\21\3\2\2\2OP\7\t\2\2PV\b\n"+
		"\1\2QR\7\n\2\2RV\b\n\1\2ST\7\f\2\2TV\b\n\1\2UO\3\2\2\2UQ\3\2\2\2US\3\2"+
		"\2\2V\23\3\2\2\2\b $\62DMU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}