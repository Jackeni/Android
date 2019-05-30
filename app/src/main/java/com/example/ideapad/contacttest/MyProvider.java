package com.example.ideapad.contacttest;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class MyProvider extends ContentProvider {
//    public static final int TABLE1_DIR = 0;
//    public static final int TABLE1_ITEM = 1;
//    public static final int TABLE2_DIR = 2;
//    public static final int TABLE2_ITEM =3;
    public static final int PHONE_NAME = 0;
    public static final int PHONE_NUMBER= 1;
    public static final int PHONE_SEX= 2;
    private static UriMatcher uriMatcher;

    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
//        uriMatcher.addURI("com.example.app.provider", "table1", TABLE1_DIR);
//        uriMatcher.addURI("com.example.app.provider", "table1/#", TABLE1_ITEM);
//        uriMatcher.addURI("com.example.app.provider", "table2", TABLE2_DIR);
//        uriMatcher.addURI("com.example.app.provider", "table2/#", TABLE2_ITEM);
        uriMatcher.addURI("com.example.app.provider", "contacts", PHONE_NAME);
        uriMatcher.addURI("com.example.app.provider", "contacts/#", PHONE_NUMBER);
        uriMatcher.addURI("com.example.app.provider", "contacts/#", PHONE_SEX);
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
//        switch (uriMatcher.match(uri)) {
//            case TABLE1_DIR:
//                break;
//            case TABLE1_ITEM:
//                break;
//            case TABLE2_DIR:
//                break;
//            case TABLE2_ITEM:
//                break;
//        }
        switch (uriMatcher.match(uri)) {
            case PHONE_NAME:
                break;
            case PHONE_NUMBER:
                break;
            case PHONE_SEX:
                break;
        }
        return null;
    }

    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }

    public  int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    public String getType(Uri uri) {
        switch (uriMatcher.match(uri)) {
//            case TABLE1_DIR:
//                return "vnd.android.cursor.dir/vnd.com.example.app.provider.table1";
//            case TABLE1_ITEM:
//                return "vnd.android.cursor.item/vnd.com.example.app.provider.table1";
//            case TABLE2_DIR:
//                return "vnd.android.cursor.dir/vnd.com.example.app.provider.table2";
//            case TABLE2_ITEM:
//                return "vnd.android.cursor.item/vnd.com.example.app.provider.table2";
            case PHONE_NAME:
                return "vnd.android.cursor.dir/vnd.com.example.app.provider.contacts";
            case PHONE_NUMBER:
                return "vnd.android.cursor.item/vnd.com.example.app.provider.contacts";
            case PHONE_SEX:
                return "vnd.android.cursor.dir/vnd.com.example.app.provider.contacts";
            default:
                break;
        }
        return null;
    }
}
