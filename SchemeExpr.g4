/********************** 
 * SchemeExpr.g4 
 *********************/ 
grammar SchemeExpr; 
 
prog: expr+ # progl 
 ;

 
expr: '(' op=rator expr* ')'    # appl
 | DOUBLE                       # doublel
 | BOOLEAN                      # booleanl
 | ID                           # idl
 | '(' DEF ID expr ')'          # defl
 | '(' LET letvardec expr ')'   # letl
 | '(' IF expr expr expr ')'    # ifl
 | '(' PRINT expr ')'           # printl
 | '(' WHILE expr expr ')'      # whilel
 | '(' BEGIN expr+ ')'          # beginl
 | '(' FUN ID expr ')'          #funl
 | '(' CALL expr expr ')'       #calll
 ;

 letvardec: '[' ID expr ']' #letvardecl
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
FUN: 'fun';
CALL: 'call';
PRINT: 'print';
WHILE: 'while';
BEGIN: 'begin';
LET: 'let';
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

/*
file:   (functionDecl | varDecl)+ ;

varDecl
    :   type ID ('=' expr)? ';'
    ;
type:   'float' | 'int' | 'void' ; // user-defined types

functionDecl
    :   type ID '(' formalParameters? ')' block // "void f(int x) {...}"
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   type ID
    ;

block:  '{' stat* '}' ;   // possibly empty statement block

stat:   block
    |   varDecl
    |   'if' expr 'then' stat ('else' stat)?
    |   'return' expr? ';'
    |   expr '=' expr ';' // assignment
    |   expr ';'          // func call
    ;

/* expr below becomes the following non-left recursive rule:
expr[int _p]
    :   ( '-' expr[6]
        | '!' expr[5]
        | ID
        | INT
        | '(' expr ')'
        )
        ( {8 >= $_p}? '*' expr[9]
        | {7 >= $_p}? ('+'|'-') expr[8]
        | {4 >= $_p}? '==' expr[5]
        | {10 >= $_p}? '[' expr ']'
        | {9 >= $_p}? '(' exprList? ')'
        )*
    ;
*/
/*
expr:   ID '(' exprList? ')'    # Call
    |   expr '[' expr ']'       # Index
    |   '-' expr                # Negate
    |   '!' expr                # Not
    |   expr '*' expr           # Mult
    |   expr ('+'|'-') expr     # AddSub
    |   expr '==' expr          # Equal
    |   ID                      # Var
    |   INT                     # Int
    |   '(' expr ')'            # Parens
    ;

exprList : expr (',' expr)* ;   // arg list

K_FLOAT : 'float';
K_INT   : 'int';
K_VOID  : 'void';
ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT :   [0-9]+ ;
*/