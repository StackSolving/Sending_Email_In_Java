package com.stacksolving.sendingemail;

/**
 *
 * @author mac
 */
public class EmailOnThread extends Thread {

    @Override
    public void run() {

        System.out.println("This code is now running on a different thread!");

        SimpleEmail.simpleEmail();
    }
}
