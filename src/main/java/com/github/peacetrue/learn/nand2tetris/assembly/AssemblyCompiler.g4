grammar AssemblyCompiler;

@header {
package com.github.peacetrue.learn.nand2tetris.assembly;
}

commands
    : command+ EOF
    ;

command
    :commandA
    |commandC
    |commandL
    ;

commandA
    : '@'(address|labels|var)
    ;

address:ZO|NUMBER|NUMBERS;
labels:'SP'|'LCL'|'ARG'|'THIS'|'THAT'
|'R0'|'R1'|'R2'|'R3'|'R4'|'R5'|'R6'|'R7'|'R8'|'R9'|'R10'|'R11'|'R12'|'R13'|'R14'|'R15'
|'SCREEN'|'KBD';
var:LETTERS|ID;

commandC
    : (dests'=')?comp(';'jump)?
    ;

dests:ADM|ADMS;
comp: ZO|'-1'|ADM|'!D'|'!A'|'-D'|'-A'|'D+1'|'A+1'|'D-1'|'A-1'|'D+A'|'D-A'|'A-D'|'D&A'|'D|A'
           |'!M'|'-M'|'M+1'|'M-1'|'D+M'|'D-M'|'M-D'|'D&M'|'D|M';
jump:'JGT'|'JEQ'|'JGE'|'JLT'|'JNE'|'JLE'|'JMP';

commandL: '('var')';

ZO:[01];
NUMBER:[0-9];
NUMBERS:NUMBER+;
ADM:'A'|'D'|'M';
ADMS:ADM+;
LETTER:[a-zA-Z];
LETTERS:LETTER+;
SEP:'_'|'.'|'$';
ID: LETTER+NUMBER*(SEP(LETTER|NUMBER)+)*;

WS:	[ \t\r\n]+ -> skip ;
COMNT:  '//' .*? '\n' -> skip ;
