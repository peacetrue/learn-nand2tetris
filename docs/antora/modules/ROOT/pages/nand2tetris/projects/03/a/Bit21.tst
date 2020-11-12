load Bit2.hdl,
output-file Bit2.out,
output-list time%S1.4.1 in1%B2.1.2 out1%B2.1.2;

set in1 1,
tick,output;

set in1 0,
tock,output;

set in1 0,
tick,output;

set in1 1,
tock,output;

set in1 0,
tick,output;

set in1 1,
tock,output;

set in1 1,
tick,output;

set in1 0,
tock,output;

set in1 1,
tick,output;

set in1 0,
tock,output;


