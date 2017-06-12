grammar GoodLang;
@parser :: members {
    static void wr(String x) {System.out.print(x);}
    static void tabs(int amount) {for(int i=0; i<amount; i++) System.out.print(' ');}
}
start
    : functions EOF;


// + functions
functions
    : functionDeclaration[0] (nl functions)?
    ;

functionDeclaration[int amount]
    : functionHeader compoundStatement[amount]
    ;

functionHeader
    : type indefiner lrb arguments? rrb
    ;

arguments
    : argument (','{wr(", ");} argument)?
    ;

argument
    : type indefiner
    ;

// - functions


// + general statements
compoundStatement[int amount]
    :   '{'{wr("{");} nl items[amount + 4]? {tabs(amount);}'}'{wr("}");}
    ;

items[int amount]
    :   item[amount] nl items[amount]?
    ;

item[int amount]
    :   {tabs(amount);}sItem[amount]';'{wr(";");}
    |   {tabs(amount);}nSItem[amount]
    ;

sItem[int amount]
    :   varDeclaration
    |   varAssignation
    |   returnExpression
    |   sMyFunctions[amount]
    ;

nSItem[int amount]
    :   returnExpression
    |   compoundStatement[amount]
    |   ifStatement[amount]
    |   whileStatement[amount]
    |   nSMyFunctions[amount]
    ;

varDeclaration
    :   type varAssignation
    ;

varAssignation
    :   indefiner ('='{wr(" = ");} assignExpression)?
    ;

returnExpression
    : 'return'{wr("return ");} assignExpression
    ;

ifStatement[int amount]
    :   'if'{wr("if ");} lrb assignExpression rrb compoundStatement[amount] ('else'{wr(" else ");} compoundStatement[amount])?
    ;

whileStatement[int amount]
    :   'while'{wr("while ");} lrb assignExpression rrb compoundStatement[amount]
    ;
// - general statements

nSMyFunctions[int amount]
    : myForOneArg[amount]
    | myForTwoArg[amount]
    | myForeach[amount]
    ;

myForOneArg[int amount]
    : 'for'{wr("for");} lrb{wr("auto ind = ");} assignExpression{wr("; i >= 0; i--");} rrb compoundStatement[amount]
    ;

myForTwoArg[int amount]
    : 'for'{wr("for");} lrb{wr("auto ind = ");} assignExpression{wr("; i <= ");} ',' assignExpression{wr("; i++");} rrb compoundStatement[amount]
    ;

// new!
myForeach[int amount]
    : 'foreach(' a=Identifier 'in' b=Identifier ')'{wr("auto iter = begin(" + $b.text + ");\n"); tabs(amount); wr("for (auto " + $a.text + " = iter*; iter != end(" + $b.text + "); iter++)");} compoundStatement[amount]
    ;

sMyFunctions[int amount]
    :   myPrint
    |   myRead
    |   mySwap[amount]
    ;


myPrint
    : 'print('{wr("std::cout << ");} listOfAssignExpression[" << "] ')'
    ;

myRead
    : 'read('{wr("std::cin >> ");} listOfIndefiner[" >> "] ')'
    ;

mySwap[int amount]
    : 'swap(' a=Identifier ',' b = Identifier')'{wr("auto tmp228 = " + $a.text + ";\n"); tabs(amount); wr($a.text + " = " +  $b.text + ";\n"); tabs(amount); wr($b.text + " = tmp228");}
    ;


// + simple expressions
assignExpression
    :   (oneTokenExpression) (operator assignExpression) ?
    |   lrb assignExpression rrb
    |   runFunction
    ;

runFunction
    :   indefiner lrb listOfAssignExpression[", "]? rrb
    ;

listOfAssignExpression[String sep]
    : assignExpression (','{wr(sep);} listOfAssignExpression[sep])?
    ;

listOfIndefiner[String sep]
    : indefiner (','{wr(sep);} listOfIndefiner[sep])?
    ;

operator
    : i=Operator{wr(" " + $i.text + " ");}
    ;

Operator
    : '>=' | '<=' | '!=' | '==' | '&&' | '||' | '+' | '-' | '*' | '/'
    ;

oneTokenExpression
    :   number | indefiner | stringToken
    ;

indefiner
    :   i=Identifier{wr($i.text);};

number
    :   i=NumberConst {wr($i.text);};

stringToken
    :   i=StringToken {wr($i.text);};

StringToken
    : '"'(.)*?'"'
    ;

Identifier
    :   [a-zA-Z_] ( [a-zA-Z_] | [0-9] )*;

NumberConst
    : IntConst ('.' IntConst)?;

IntConst
    :   [0-9]+;
// - simple expressions

type
    :   'char' {wr("char ");}
    |   'short' {wr("short ");}
    |   'int' {wr("int ");}
    |   'float' {wr("float ");}
    |   'double'{wr("double ");}
    ;

lrb
    : '('{wr("(");}
    ;

rrb
    : ')'{wr(") ");}
    ;

nl
    : {wr("\n");}
    ;

Whitespace
    :   [ \t]+ -> skip;

Newline
    :   ('\r' '\n'?|'\n') -> skip
    ;

LineComment
    :   '//' ~[\r\n]* -> skip
    ;