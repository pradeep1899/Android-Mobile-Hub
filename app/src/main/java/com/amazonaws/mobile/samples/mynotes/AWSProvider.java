package com.amazonaws.mobile.samples.mynotes;

/**
 * Created by pradeepbo on 04-Jan-18.
 */

public class AWSProvider {
    private static final AWSProvider ourInstance = new AWSProvider();

    public static AWSProvider getInstance() {
        return ourInstance;
    }

    private AWSProvider() {
    }
}
