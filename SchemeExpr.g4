/*****************
 * SchemeExpr.g4
 ****************/
grammar SchemeExpr;

prog: expr+ # progl
 ;

expr: DOUBLE                    #doublel
 | BOOLEAN                      #booll
 | ID                           #idl
 | '(' RATOR expr* ')'          #appl
 | '(' 'def' ID expr ')'        #defl
 | '(' 'if' expr expr expr ')'  #ifl
 ;

RATOR: ARITHMETIC | RELATIONAL | BOOLEAN;
ARITHMETIC: PLUS|MINUS|MUL|DIV;
RELATIONAL: EQUAL|GREATER|LESSER;
BOOLEAN: TRUE|FALSE|AND|OR|NOT;
DEF: 'def';
IF: 'if';
fragment
DIGIT: [0-9];
fragment
LETTER: [a-zA-Z];
fragment
UNDERSCORE: '_';
ID: LETTER (LETTER | DIGIT | UNDERSCORE)*;
DOUBLE: ('-')? DIGIT+ ('.' DIGIT*)?;
WS: [ \t\r\n]+ -> skip;
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
EQUAL: '=';
GREATER: '>';
LESSER: '<';
AND: '&';
OR: '|';
NOT: '!';
TRUE: 'true';
FALSE: 'false';
