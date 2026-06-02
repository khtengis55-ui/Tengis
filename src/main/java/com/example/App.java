package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Cube cube = new Cube(3);
        @SuppressWarnings("unused")
        Cube cube1 = new Cube(5);
        @SuppressWarnings("unused")
        Cube cube2 = new Cube(10.5);
       // System.out.println( "Hello World!" );
       System.out.println(cube.getVolume());
       System.out.println(cube.getSurfaceArea());
       System.out.println("hhe" );
    }
}
