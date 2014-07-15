/********************** 
 * SchemeExpr.g4 
 *********************/ 
grammar SchemeExpr; 
 
prog: expr+ # progl 
 ; 
 
expr: '(' op=rator expr* ')' # appl 
 | DOUBLE # doublel 
 | BOOLEAN # booleanl 
 | ID # idl 
 | '(' DEF ID expr ')' # defl 
 | '(' IF expr expr expr ')' # ifl 
 ; 
 
rator: arithRator 
 | relationalRator 
 | booleanRator 
 ; 
 
arithRator: PLUS|MINUS|MUL|DIV 
 ; 
 
relationalRator: EQ|GT|LT 
 ; 
 
booleanRator: AND|OR|NOT 
 ; 
 
DEF: 'def'; 
IF: 'if'; 
BOOLEAN:'true' | 'false'; 
fragment 
DIGIT: [0-9]; 
fragment 
LETTER: [a-zA-Z]; 
DOUBLE: ('-')? DIGIT+ ('.' DIGIT*)?; 
ID: LETTER (LETTER | DIGIT)*; 
WS: [ \t\r\n]+ -> skip; 
PLUS: '+'; 
MINUS: '-'; 
MUL: '*'; 
DIV: '/'; 
EQ: '='; 
GT: '>'; 
LT: '<'; 
AND: '&'; 
OR: '|'; 
NOT: '!'; 
