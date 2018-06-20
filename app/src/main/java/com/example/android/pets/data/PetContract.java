package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Iwona on 03.06.2018.
 */

public class PetContract {

    private PetContract(){}

    public static abstract class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

//        public static final String SQL_CREATE_ENTRIES = "CREATE_TABLE" + PetEntry.TABLE_NAME + "(" +
//                PetEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT" + PetEntry.COLUMN_PET_NAME + "TEXT NOT NULL" +
//                PetEntry.COLUMN_PET_BREED + "TEXT" + PetEntry.COLUMN_PET_GENDER + "INTEGER NOT NULL" +
//                PetEntry.COLUMN_PET_WEIGHT + "INTEGER NOT NULL DEFAULT 0" + ");";


//        public static final String SQL_DELETE_ENTRIES = ""
        /**
         * Possible values for the gender: 0- Unknown, 1-Male, 2-Female
         */
        public static final int GENDER_UNKOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}
