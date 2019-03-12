package org.launchcode.f_introducing_classes;

import java.time.ZoneId;
import java.util.TimeZone;

public class TimeZoneTest {

    public static void main(String[] args) {

        TimeZone t = TimeZone.getTimeZone("America/Newyork");

        System.out.println("--->00" + t.getDisplayName( false,TimeZone.SHORT));
        ZoneId z = t.toZoneId();


        System.out.println(t.getDisplayName());
        System.out.println(z);
        System.out.println(ZoneId.of("America/NewYork"));
    }
}
