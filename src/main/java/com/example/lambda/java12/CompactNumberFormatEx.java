package com.example.lambda.java12;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatEx {
    public static void main(String[] args) {
        NumberFormat ns = CompactNumberFormat.getCompactNumberInstance(Locale.UK, NumberFormat.Style.LONG);
        String format = ns.format(50000);
        System.out.println(format);
    }
}
