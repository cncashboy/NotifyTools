package org.github.yippee.china_poem.poem2db.dao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import org.github.yippee.china_poem.poem2db.bean.Tangshi;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "tangshi".
*/
public class TangshiDao extends AbstractDao<Tangshi, Long> {

    public static final String TABLENAME = "tangshi";

    /**
     * Properties of entity Tangshi.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Author = new Property(1, byte[].class, "author", false, "AUTHOR");
        public final static Property Title = new Property(2, byte[].class, "title", false, "TITLE");
        public final static Property Strains = new Property(3, byte[].class, "strains", false, "STRAINS");
        public final static Property Paragraphs = new Property(4, byte[].class, "paragraphs", false, "PARAGRAPHS");
    }


    public TangshiDao(DaoConfig config) {
        super(config);
    }
    
    public TangshiDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"tangshi\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"AUTHOR\" BLOB," + // 1: author
                "\"TITLE\" BLOB," + // 2: title
                "\"STRAINS\" BLOB," + // 3: strains
                "\"PARAGRAPHS\" BLOB);"); // 4: paragraphs
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_tangshi_AUTHOR_TITLE_STRAINS ON tangshi" +
                " (\"AUTHOR\" ASC,\"TITLE\" ASC,\"STRAINS\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"tangshi\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Tangshi entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        byte[] author = entity.getAuthor();
        if (author != null) {
            stmt.bindBlob(2, author);
        }
 
        byte[] title = entity.getTitle();
        if (title != null) {
            stmt.bindBlob(3, title);
        }
 
        byte[] strains = entity.getStrains();
        if (strains != null) {
            stmt.bindBlob(4, strains);
        }
 
        byte[] paragraphs = entity.getParagraphs();
        if (paragraphs != null) {
            stmt.bindBlob(5, paragraphs);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Tangshi entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        byte[] author = entity.getAuthor();
        if (author != null) {
            stmt.bindBlob(2, author);
        }
 
        byte[] title = entity.getTitle();
        if (title != null) {
            stmt.bindBlob(3, title);
        }
 
        byte[] strains = entity.getStrains();
        if (strains != null) {
            stmt.bindBlob(4, strains);
        }
 
        byte[] paragraphs = entity.getParagraphs();
        if (paragraphs != null) {
            stmt.bindBlob(5, paragraphs);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Tangshi readEntity(Cursor cursor, int offset) {
        Tangshi entity = new Tangshi( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getBlob(offset + 1), // author
            cursor.isNull(offset + 2) ? null : cursor.getBlob(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getBlob(offset + 3), // strains
            cursor.isNull(offset + 4) ? null : cursor.getBlob(offset + 4) // paragraphs
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Tangshi entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAuthor(cursor.isNull(offset + 1) ? null : cursor.getBlob(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getBlob(offset + 2));
        entity.setStrains(cursor.isNull(offset + 3) ? null : cursor.getBlob(offset + 3));
        entity.setParagraphs(cursor.isNull(offset + 4) ? null : cursor.getBlob(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Tangshi entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Tangshi entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Tangshi entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
