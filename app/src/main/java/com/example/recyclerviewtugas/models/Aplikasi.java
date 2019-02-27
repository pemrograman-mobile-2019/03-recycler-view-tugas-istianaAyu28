package com.example.recyclerviewtugas.models;

import java.util.ArrayList;

public class Aplikasi {
    private String mName;
    private boolean mOnline;

    public Aplikasi(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }

    private static int lastAplikasiId = 0;

    public static ArrayList<Aplikasi> createContactsList(int numAplikasis) {
        ArrayList<Aplikasi> contacts = new ArrayList<Aplikasi>();

        for (int i = 1; i <= numAplikasis; i++) {
            contacts.add(new Aplikasi("Person " + ++lastAplikasiId, i <= numAplikasis / 2));
        }

        return contacts;
    }
}
