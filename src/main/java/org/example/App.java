/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.*;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Prompting for a noun*/
        System.out.println("Enter a noun:");
        String noun = scan.nextLine();

        /*Prompting for a verb*/
        System.out.println("Enter a verb:");
        String verb = scan.nextLine();

        /*Prompting for an adjective*/
        System.out.println("Enter an adjective:");
        String adjective = scan.nextLine();

        /*Prompting for an adverb*/
        System.out.println("Enter a adverb:");
        String adverb = scan.nextLine();

        /*Displaying output of story*/
        System.out.printf("Did you %s the %s %s %s? That's cool!", verb, adjective, noun, adverb);
    }
}
