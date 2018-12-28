package com.example.fabio.myproof;

/**
 * Created by fabio on 21/06/2017.
 */

public class Other {
    private static long startTime;
    private static long endTime;
    public static long duration;

    public Other() {
        startTime = System.currentTimeMillis();
        endTime = startTime;
        duration = endTime-startTime;
    }
    public static void time() {
        startTime = endTime;
        endTime = System.currentTimeMillis(); //System.nanoTime();
        duration = endTime-startTime;
    }
    public static String getDuration() {
        return String.valueOf(duration);
    }
    static String getExternalName(String name) {
        return name.replace("_"," ");
    }
    static boolean checkName(String name) {
        return name.matches("\\w+");
    }
    static boolean isConstant(String name) {
        if (name.startsWith("\\")) return true;
        if (name.startsWith("§")) return true;
        if (name.startsWith("#")) return true;
        return false;
    }
}
