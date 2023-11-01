/**
 * 
 */
package com.tnsif.basics;
public class Typecasting_Demo {

	/**
	 * @param Sumathi
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// widening implicit type casting
byte b= 10;
int i = b;
System.out.println(i);

float f= 22.14f;
double d = f;
System.out.println(d);

char ch = 'A';
int i3= ch;
System.out.println(i3);

char varl = '\u00A7';
int i4 = varl;
System.out.println(i4);

// narrowing/explicit type casting

double fl = 10.52f;
long l = (long) fl;
System.out.println(l);

long l1 = 923372036854775806l;
int i2 = (int) l1;
System.out.println(i2);

float f2 = 34.56f;
int i1 = (int) f2;
System.out.println(i1);
	}
}
