
//set R2=0
@2
M=0

//if R0<=0 return
@0
D=M //D=R0
@END
D;JLE //over

//if R1<=0 return
(LOOP)
@1
D=M //D=R1

@END
D;JLE //over

//R1=R1-1
@1
M=D-1

//R2=R2+R0
@0
D=M //D=R0
@2
M=D+M //R2=D+R2

@LOOP
0;JMP

(END)
@END
0;JMP
