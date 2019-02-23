grammar discordsl;

start
    : 'settings:'
      settings
      event+
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

statement
    : variable
    | say
    | list_assign
    | math_sum_full
    | if_statement
    ;

math_sum
    : math_sum operators+ math_sums
    | math_sum operators+ Digits
    | Digits operators+ math_sums
    | Digits operators+ Digits
    | brackets math_sum operators+ math_sums brackets
    | brackets math_sum operators+ Digits brackets
    | brackets Digits operators+ math_sums brackets
    | brackets Digits operators+ Digits brackets
    ;

brackets
    : '('
    | ')'
    ;

statements
    : statement+
    ;

math_sum_full
    : math_sums
    ;

math_sums
    : math_sum+
    ;

event
    : EVENT event_name statements 'endevent';


event_param
    : LetterOrDigit ;

say
    : 'say' statements
    | 'say' NORMALSTRING
    | 'say' LetterOrDigit
    ;

if_operand
    : NORMALSTRING
    | Digits
    | math_sum_full
    | statement
    ;

condition
    : if_operand comparators if_operand
    ;



if_statement
    :  IF condition THEN conditional_statement ELSE conditional_statement ENDIF
    |  IF condition THEN conditional_statement ENDIF
    ;

send_message
    : 'send' Letters TO 'channel' Letters
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

conditional_statement
    : statements
    ;

variable
    : SET identifier TO var_value AS type
    ;

identifier
    : LetterOrDigit
    ;



event_name
    : LetterOrDigit
    ;


var_value
   : Digits
   | NORMALSTRING
   | math_sum_full
   ;

type
    :
    | 'string'
    | 'number'
    ;

list_assign
    :SET identifier TO NORMALSTRING 'which is list of type' type
    ;


operators
    : '^'
    | '/'
    | '+'
    | '-'
    | '*'
    | '('
    | ')'
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
LB           :    '('           ;
RB           :    ')'           ;



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