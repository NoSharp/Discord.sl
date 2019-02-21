grammar discordsl;


program
   : statement
   | if_statements
   ;

statement
    : variable
    | math_expr
    ;

comparator
    : Digits comparator Digits
    ;

if_statements
    :
    | IF comparator THEN statement ENDIF
    ;

math_expr
    :
    | Digits operators Digits
    ;

function
    :
    | EVENT Letters THEN statement
    ;

variable
    :
    | SET LetterOrDigit TO Digits AS type
    | SET LetterOrDigit TO NORMALSTRING AS type
    ;

type
    :
    | 'string'
    | 'number'
    ;


operators
    : '*'
    | '/'
    | '+'
    | '-'
    | '**'
    ;

comparators
: '<'
| '>'
| '>='
| '<='
| '=='
;

SET          :    'set'         ;
TO           :    'to'          ;
EVENT        :    'on'          ;
STRING_TYPE  :    'string'      ;
INTEGER      :    'number'      ;
DECIMAL      :    'decimal'     ;
IF           :    'if'          ;
WHILE        :    'while'       ;
SETTINGS     :    'settings'    ;
ENDIF        :    'endif'       ;
ENDWHILE     :    'endwhile'    ;
VAR          :    'set'         ;
VAR_ASSIGN   :    'to'          ;
ELSE         :    'else'        ;
FOR          :    'for'         ;
ENDFOR       :    'endfor'      ;
EXIT         :    'exit'        ;
START_BOT    :    'start'       ;
COMMAND      :    'command'     ;
RETURN       :    'out'         ;
SWITCH       :    'switch'      ;
CASE         :    'case'        ;
THEN         :    'then'        ;
RETURNS      :    'returns'     ;
VOID         :    'nothing'     ;
NULL         :    'empty'       ;
SAY          :    'say'         ;
AS           :    'as'          ;
SPEECH       :    '"'           ;



WS
   : [ \r\n\t]+ -> skip
   ;

NL      :   '\r'? '\n' ;
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);


// REGEX

Digits
     : [0-9]+
     ;

LetterOrDigit
    : Letters
    | [0-9]
    ;

Letters: [a-zA-Z_]+ ;
LABEL
   : ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_') +
   ;

EOL
   : [\r\n] +
   ;
NORMALSTRING
    : '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

fragment
EscapeSequence
    : '\\' [abfnrtvz"'\\]
    | '\\' '\r'? '\n'
    ;