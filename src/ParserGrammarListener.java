// Generated from D:/projects/mar/Parser for  parser/src\ParserGrammar.g4 by ANTLR 4.7

    import grammar.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserGrammarParser}.
 */
public interface ParserGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ParserGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ParserGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(ParserGrammarParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(ParserGrammarParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRules(ParserGrammarParser.GrammarRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRules(ParserGrammarParser.GrammarRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(ParserGrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(ParserGrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGrammarParser#termRule}.
	 * @param ctx the parse tree
	 */
	void enterTermRule(ParserGrammarParser.TermRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGrammarParser#termRule}.
	 * @param ctx the parse tree
	 */
	void exitTermRule(ParserGrammarParser.TermRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGrammarParser#nonTermRule}.
	 * @param ctx the parse tree
	 */
	void enterNonTermRule(ParserGrammarParser.NonTermRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGrammarParser#nonTermRule}.
	 * @param ctx the parse tree
	 */
	void exitNonTermRule(ParserGrammarParser.NonTermRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGrammarParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(ParserGrammarParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGrammarParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(ParserGrammarParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGrammarParser#caseRule}.
	 * @param ctx the parse tree
	 */
	void enterCaseRule(ParserGrammarParser.CaseRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGrammarParser#caseRule}.
	 * @param ctx the parse tree
	 */
	void exitCaseRule(ParserGrammarParser.CaseRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserGrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(ParserGrammarParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserGrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(ParserGrammarParser.TokenContext ctx);
}