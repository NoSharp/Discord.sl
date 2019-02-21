grammar discordsl;

start
    : 'settings:'
      settings
      statements+
    ;

settings:
    'token:' token
    'command_prefix:' command_prefix
    'enable_help:' enable_help
    'status:' status
    'game:' game
    ;

game:
    NORMALSTRING
    ;

enable_help:
    NORMALSTRING
    ;

status:
    NORMALSTRING
    ;
command_prefix:
    NORMALSTRING
    ;

token:
    NORMALSTRING
    ;


statements
    : variable
    | say
    | maths_equations
    ;

say
    : 'say' statements
    | 'say' NORMALSTRING
    | 'say' LetterOrDigit
    ;

maths_equations
    : Digits operators Digits
    | maths_equations operators maths_equations
    | Digits operators maths_equations
    | maths_equations operators Digits
    ;


/**
comparator
    : Digits comparator Digits
    ;

if_statements
    :
    | IF comparator THEN statement ENDIF
    ;
**/
/**
math_expr
    :
    | Digits operators Digits
    ;

function
    :
    | EVENT Letters THEN statement
    ;
**/

variable
    : SET identifier TO var_value AS type
    ;

identifier
    : LetterOrDigit
    ;

var_value
   : Digits
   | NORMALSTRING
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