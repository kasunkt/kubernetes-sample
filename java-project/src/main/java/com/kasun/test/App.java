package com.kasun.test;

/**
 * Hello world!
 *
 */
 
import java.util.Map;

public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		
		Map<String, String> env = System.getenv();
		env.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
