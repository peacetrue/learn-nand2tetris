//VM 翻译器
grammar VMCompiler;
@header {
    package com.github.peacetrue.learn.nand2tetris.vm;
}

functions
    : function * EOF
    ;

function
    : functionDeclare commands
    ;

functionDeclare
    : 'function' functionName localCount
    ;

functionName
    : ID
    ;

localCount
    : NUMBERS
    ;

return0
    : 'return'
    ;

commands
    : command *
    ;

command
    :memoryAccessCommand
    |arithmeticAndLogicalCommand
    |programFlowCommand
    |functionCallingCommand
    |return0
    ;

//内存访问命令
memoryAccessCommand
    : push
    | pop
    ;

push
    : 'push' pushSegment index
    ;

pushSegment
    :'constant'
    |COMMON_SEGMENT
    ;

pop
    : 'pop' popSegment index
    ;

popSegment
    : COMMON_SEGMENT
    ;

COMMON_SEGMENT
    : 'argument'
    | 'local'
    | 'static'
    | 'this'
    | 'that'
    | 'pointer'
    | 'temp'
    ;

index
    : NUMBERS
    ;


//算术和逻辑命令(9)
arithmeticAndLogicalCommand
    : 'add'
    | 'sub'
    | 'neg'
    | 'eq'
    | 'gt'
    | 'lt'
    | 'and'
    | 'or'
    | 'not'
    ;

//程序流程控制命令(3）
programFlowCommand
    : label
    | gotos
    | ifGoto
    ;

label
    : 'label' symbol
    ;

gotos
    : 'goto' symbol
    ;

ifGoto
    : 'if-goto' symbol
    ;

symbol
    : ID
    ;


//函数调用命令
functionCallingCommand
    : 'call' functionName argsCount
    ;

argsCount
    : NUMBERS
    ;


fragment
NUMBER:[0-9];
NUMBERS:NUMBER+;
fragment
LETTER:[a-zA-Z];
fragment
LETTERS:LETTER+;
fragment
SEP:'_'|'.'|'$';
ID: LETTER+NUMBER*(SEP(LETTER|NUMBER)+)*;

WS:	[ \t\r\n]+ -> skip ;
COMNT:  '//' .*? '\n' -> skip ;
