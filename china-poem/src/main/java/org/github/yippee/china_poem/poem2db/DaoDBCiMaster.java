package org.github.yippee.china_poem.poem2db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;
import org.github.yippee.china_poem.poem2db.dao.gen.DaoMaster;
import org.github.yippee.china_poem.poem2db.dao.gen.TangshiDao;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.database.StandardDatabase;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * Master of DAO (schema version 1): knows all DAOs.
 */
public class DaoDBCiMaster extends DaoMaster {
    public static final int SCHEMA_VERSION = 1;


    public DaoDBCiMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoDBCiMaster(Database db) {
        super(db);
        registerDaoClass(TangshiDao.class);
    }


    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            //createAllTables(db, true);
            SQLiteDatabase database =SQLiteDatabase.create(null);
            //String t_user_sql = "CREATE TABLE tangshi (\n"
            //    + "    _id        INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            //    + "    author     BLOB,\n"
            //    + "    title      BLOB,\n"
            //    + "    paragraphs BLOB,\n"
            //    + "    strains    BLOB\n"
            //    + ");\n)";
            //database.execSQL(t_user_sql);

        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}