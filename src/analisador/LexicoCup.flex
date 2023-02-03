package analisador;

import java_cup.runtime.Symbol;

%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L = [a-zA-Z_]+
D = [0-9]+
WHITE=[ ,\t,\r,\n,{}]+

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
{WHITE} {/*Ignore*/}

( "" ) {return new Symbol(sym.VAZIO, yychar, yyline, yytext());}
( or ) {return new Symbol(sym.OR, yychar, yyline, yytext());}
( true ) {return new Symbol(sym.TRUE, yychar, yyline, yytext());}
( false ) {return new Symbol(sym.FALSE, yychar, yyline, yytext());}

/* Palavras Reservadas */
( program ) {return new Symbol(sym.PROGRAM, yychar, yyline, yytext());}
( var ) {return new Symbol(sym.VAR, yychar, yyline, yytext());}
( integer ) {return new Symbol(sym.INTEGER, yychar, yyline, yytext());}
( real )    {return new Symbol(sym.REAL, yychar, yyline, yytext());}
( boolean ) {return new Symbol(sym.BOOLEAN, yychar, yyline, yytext());}
( procedure ) {return new Symbol(sym.PROCEDURE, yychar, yyline, yytext());}
( begin ) {return new Symbol(sym.BEGIN, yychar, yyline, yytext());}
( end ) {return new Symbol(sym.END, yychar, yyline, yytext());}
( if ) {return new Symbol(sym.IF, yychar, yyline, yytext());}
( else ) {return new Symbol(sym.ELSE, yychar, yyline, yytext());}
( then ) {return new Symbol(sym.THEN, yychar, yyline, yytext());}
( while ) {return new Symbol(sym.WHILE, yychar, yyline, yytext());}
( do ) {return new Symbol(sym.DO, yychar, yyline, yytext());}
( not ) {return new Symbol(sym.NOT, yychar, yyline, yytext());}

/* Identificadores */
{L}({L}|{D})* {return new Symbol(sym.ID, yychar, yyline, yytext());}

/* Numeros inteiros */
("(-"{D}+")")|{D}+ {return new Symbol(sym.INTEIROS, yychar, yyline, yytext());}

/*Numeros reais*/
("(-"{D}+,{D}+")") {return new Symbol(sym.REAIS, yychar, yyline, yytext());}

/* Delimitadores */
( "." ) {return new Symbol(sym.PONTO, yychar, yyline, yytext());}
( ";" ) {return new Symbol(sym.PONTOVIRG, yychar, yyline, yytext());}
( ":" ) {return new Symbol(sym.DOISPONTOS, yychar, yyline, yytext());}
( "(" ) {return new Symbol(sym.ABREPAR, yychar, yyline, yytext());}
( ")" ) {return new Symbol(sym.FECHAPAR, yychar, yyline, yytext());}

/* Comando de atribuicão */
( ":=" ) {return new Symbol(sym.ATRIBUICAO, yychar, yyline, yytext());}

/* Operadores relacionais */
( "=" | "<" | ">" | "<=" | ">=" | "<>" ) {return new Symbol(sym.RELACIONAIS, yychar, yyline, yytext());}

/* Operadores aditivos */
( "+" | "-" ) {return new Symbol(sym.ADITIVOS, yychar, yyline, yytext());}


/* Operadores Multiplicativos */
( "*" | "/" | "and" )  {return new Symbol(sym.MULTIPLICATIVOS, yychar, yyline, yytext());}
