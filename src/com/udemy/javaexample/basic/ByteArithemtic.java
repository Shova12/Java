package com.udemy.javaexample.basic;

public class ByteArithemtic {

	public static void main(String[] args) {
		byte num1 = 127;
        byte num2 = 12;
        System.out.println( "Byte Arithmetic Operations" );
        System.out.println( "Number1: " + num1 );
        System.out.println( "Number2: " + num2 );
        byte sum = (byte)( num1 + num2 );
        System.out.println( "Sum = " + sum );
        byte diff = (byte)( num1 - num2 );
        System.out.println( "Diff = " + diff );
        byte product = (byte)( num1 * num2 );
        System.out.println( "Product = " + product ); // because of data type is byte. since byte can stores only 127 numbers
        byte quotient = (byte)( num1 / num2 );
        System.out.println( "Quotient = " + quotient );
        byte remainder = (byte)( num1 % num2 );
        System.out.println( "Remainder = " + remainder );

	}

}
