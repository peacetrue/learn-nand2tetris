@261
D=A
@SP
M=D
(Sys.init)
@4
D=A
@0
A=M
M=D
@0
M=M+1
@56
D=A
@SP
A=M
M=D
@SP
M=M+1
@LCL
D=M
@SP
A=M
M=D
@SP
M=M+1
@ARG
D=M
@SP
A=M
M=D
@SP
M=M+1
@THIS
D=M
@SP
A=M
M=D
@SP
M=M+1
@THAT
D=M
@SP
A=M
M=D
@SP
M=M+1
@SP
D=M
@LCL
M=D
@6
D=D-A
@ARG
M=D
@Main.fibonacci
0;JMP
(Sys.init$WHILE)
@Sys.init$WHILE
0;JMP
(Main.fibonacci)
@2
D=M
@0
A=D+A
D=M
@0
A=M
M=D
@0
M=M+1
@2
D=A
@0
A=M
M=D
@0
M=M+1
@0
M=M-1
A=M
D=M
@0
M=M-1
A=M
D=M-D
@MATCH1
D;JLT
@0
A=M
M=0
@END1
0;JMP
(MATCH1)
@0
A=M
M=-1
(END1)
@0
M=M+1
@0
M=M-1
A=M
D=M
@Main.fibonacci$IF_TRUE
D;JLT
@Main.fibonacci$IF_FALSE
0;JMP
(Main.fibonacci$IF_TRUE)
@2
D=M
@0
A=D+A
D=M
@0
A=M
M=D
@0
M=M+1
@SP
M=M-1
A=M
D=M
@13
M=D
@LCL
D=M
@SP
M=D
@ARG
D=M
@14
M=D
@SP
M=M-1
A=M
D=M
@THAT
M=D
@SP
M=M-1
A=M
D=M
@THIS
M=D
@SP
M=M-1
A=M
D=M
@ARG
M=D
@SP
M=M-1
A=M
D=M
@LCL
M=D
@SP
M=M-1
A=M
D=M
@15
M=D
@14
D=M
@SP
M=D
@13
D=M
@SP
A=M
M=D
@SP
M=M+1
@15
A=M
0;JMP
(Main.fibonacci$IF_FALSE)
@2
D=M
@0
A=D+A
D=M
@0
A=M
M=D
@0
M=M+1
@2
D=A
@0
A=M
M=D
@0
M=M+1
@0
M=M-1
A=M
D=M
@0
M=M-1
A=M
D=M-D
M=D
@0
M=M+1
@244
D=A
@SP
A=M
M=D
@SP
M=M+1
@LCL
D=M
@SP
A=M
M=D
@SP
M=M+1
@ARG
D=M
@SP
A=M
M=D
@SP
M=M+1
@THIS
D=M
@SP
A=M
M=D
@SP
M=M+1
@THAT
D=M
@SP
A=M
M=D
@SP
M=M+1
@SP
D=M
@LCL
M=D
@6
D=D-A
@ARG
M=D
@Main.fibonacci
0;JMP
@2
D=M
@0
A=D+A
D=M
@0
A=M
M=D
@0
M=M+1
@1
D=A
@0
A=M
M=D
@0
M=M+1
@0
M=M-1
A=M
D=M
@0
M=M-1
A=M
D=M-D
M=D
@0
M=M+1
@317
D=A
@SP
A=M
M=D
@SP
M=M+1
@LCL
D=M
@SP
A=M
M=D
@SP
M=M+1
@ARG
D=M
@SP
A=M
M=D
@SP
M=M+1
@THIS
D=M
@SP
A=M
M=D
@SP
M=M+1
@THAT
D=M
@SP
A=M
M=D
@SP
M=M+1
@SP
D=M
@LCL
M=D
@6
D=D-A
@ARG
M=D
@Main.fibonacci
0;JMP
@0
M=M-1
A=M
D=M
@0
M=M-1
A=M
D=D+M
M=D
@0
M=M+1
@SP
M=M-1
A=M
D=M
@13
M=D
@LCL
D=M
@SP
M=D
@ARG
D=M
@14
M=D
@SP
M=M-1
A=M
D=M
@THAT
M=D
@SP
M=M-1
A=M
D=M
@THIS
M=D
@SP
M=M-1
A=M
D=M
@ARG
M=D
@SP
M=M-1
A=M
D=M
@LCL
M=D
@SP
M=M-1
A=M
D=M
@15
M=D
@14
D=M
@SP
M=D
@13
D=M
@SP
A=M
M=D
@SP
M=M+1
@15
A=M
0;JMP