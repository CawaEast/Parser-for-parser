grammar ParserGrammar;
@header {
    import grammar.*;
    import java.util.ArrayList;
}

@members {
    Grammar grammar = new Grammar();
    ArrayList<String> words = new ArrayList<String>();
    static void wr(String x) {System.out.print(x);}
    static void tabs(int amount) {for(int i=0; i<amount; i++) System.out.print(' ');}
}

start
    : grammarName grammarRules EOF
    ;

grammarName
    : 'grammar' i = (TermName | NonTermName) ';'{grammar.name = $i.text;}
    ;

grammarRules
    :   grammarRule+
    ;

grammarRule
    :   termRule
    |   nonTermRule
    ;

termRule
    :   name = TermName ':' regexp = Regexp '->' 'skip' ';'{RegexpToken rt = new RegexpToken($regexp.text); rt.setSkip(true); grammar.addTermonal(new Terminal($name.text, rt));}
    |   name = TermName ':' regexp = Regexp  ';'{grammar.addTermonal(new Terminal($name.text, new RegexpToken($regexp.text)));}
    ;

nonTermRule
    :   name = NonTermName{NonTerminal nt = new NonTerminal($name.text); nt.addRule();} ':' cases[nt]{grammar.addNonTerminal($cases.nt1);} ';'
    ;

cases[NonTerminal nt] returns [NonTerminal nt1]
    :   caseRule[nt]{nt.endRule(); nt.addRule();} '|' cases[nt]{$nt1 = nt;}
    |   caseRule[nt]{nt.endRule(); $nt1 = nt;}
    ;

caseRule[NonTerminal nt] returns [NonTerminal nt1]
    :   token[nt] {$nt1 = nt;}
    |   token[nt] caseRule[nt]{$nt1 = nt;}
    ;

token[NonTerminal nt]
    :   i = TermName{nt.addToken(new MyGrammarToken($i.text, 1));}
    |   i = NonTermName{nt.addToken(new MyGrammarToken($i.text, 2));}
    |   i = String{nt.addToken(new MyGrammarToken($i.text, 3));}
    ;

TermName
    :   [A-Z][a-zA-Z]*
    ;

NonTermName
    :   [a-z][a-zA-Z]*
    ;


MagicChar
    :   '+' | '?' | '*'
    ;

String
    : '\''.*?'\''
    ;

Regexp
    :   '['.*? ']' Regexp?
    |   [~+)a-zA-Z\\(?|*/']+ Regexp?
    ;

Whitespace
    :   [ \t]+ -> skip;

Newline
    :   ('\r''\n'?|'\n') -> skip
    ;

LineComment
    :   '//'~[\r\n]* -> skip
    ;