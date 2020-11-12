// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Fill.asm

// Runs an infinite loop that listens to the keyboard input.
// When a key is pressed (any key), the program blackens the screen,
// i.e. writes "black" in every pixel;
// the screen should remain fully black as long as the key is pressed.
// When no key is pressed, the program clears the screen, i.e. writes
// "white" in every pixel;
// the screen should remain fully clear as long as no key is pressed.

// Put your code here.

//i=0
@i
M=0

(LOOP)
//D=M[KBD]
@KBD
D=M

//if M[KBD]>0 then goto ADD else goto remove
@ADD
D;JGT

//REMOVE
//D=M[i]
@i
D=M

//if i<=0 then goto LOOP
@LOOP
D;JLE

//i=i-1
@i
M=M-1

//R[i]=0
@SCREEN
D=A
@i
A=D+M
M=0
@LOOP
0;JMP

(ADD)
// if i>=1000 then goto LOOP
@i
D=M
@8192
D=D-A
@LOOP
D;JGE

//R[i]=1
@SCREEN
D=A
@i
A=D+M
M=-1

//i=i+1
@i
M=M+1

@LOOP
0;JMP

