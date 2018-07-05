package com.xyz.java.test;

public class CheckMaxInt {

	public static void main(String[] args) {
		
		try {
			for(int i=0;i<10000000;i++){
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}

}
/*
width                     minimum                         maximum

SIGNED
byte:     8 bit                        -128                            +127
short:   16 bit                     -32 768                         +32 767
int:     32 bit              -2 147 483 648                  +2 147 483 647
long:    64 bit  -9 223 372 036 854 775 808      +9 223 372 036 854 775 807

UNSIGNED
char     16 bit                           0                         +65 535
*/