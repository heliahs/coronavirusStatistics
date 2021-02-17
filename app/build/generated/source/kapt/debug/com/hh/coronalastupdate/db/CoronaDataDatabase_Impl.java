package com.hh.coronalastupdate.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CoronaDataDatabase_Impl extends CoronaDataDatabase {
  private volatile CoronaInfoDao _coronaInfoDao;

  private volatile GlobalDao _globalDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TableCountries` (`Country` TEXT NOT NULL, `CountryCode` TEXT NOT NULL, `Slug` TEXT NOT NULL, `NewConfirmed` INTEGER NOT NULL, `TotalConfirmed` INTEGER NOT NULL, `NewDeaths` INTEGER NOT NULL, `TotalDeaths` INTEGER NOT NULL, `NewRecovered` INTEGER NOT NULL, `TotalRecovered` INTEGER NOT NULL, `Date` TEXT NOT NULL, PRIMARY KEY(`Country`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TableGlobal` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `NewConfirmed` INTEGER NOT NULL, `TotalConfirmed` INTEGER NOT NULL, `NewDeaths` INTEGER NOT NULL, `TotalDeaths` INTEGER NOT NULL, `NewRecovered` INTEGER NOT NULL, `TotalRecovered` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f93226b7383bffe2d1e01d03df85fbfb')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `TableCountries`");
        _db.execSQL("DROP TABLE IF EXISTS `TableGlobal`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTableCountries = new HashMap<String, TableInfo.Column>(10);
        _columnsTableCountries.put("Country", new TableInfo.Column("Country", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableCountries.put("CountryCode", new TableInfo.Column("CountryCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableCountries.put("Slug", new TableInfo.Column("Slug", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableCountries.put("NewConfirmed", new TableInfo.Column("NewConfirmed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableCountries.put("TotalConfirmed", new TableInfo.Column("TotalConfirmed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableCountries.put("NewDeaths", new TableInfo.Column("NewDeaths", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableCountries.put("TotalDeaths", new TableInfo.Column("TotalDeaths", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableCountries.put("NewRecovered", new TableInfo.Column("NewRecovered", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableCountries.put("TotalRecovered", new TableInfo.Column("TotalRecovered", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableCountries.put("Date", new TableInfo.Column("Date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTableCountries = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTableCountries = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTableCountries = new TableInfo("TableCountries", _columnsTableCountries, _foreignKeysTableCountries, _indicesTableCountries);
        final TableInfo _existingTableCountries = TableInfo.read(_db, "TableCountries");
        if (! _infoTableCountries.equals(_existingTableCountries)) {
          return new RoomOpenHelper.ValidationResult(false, "TableCountries(com.hh.coronalastupdate.db.TableCountries).\n"
                  + " Expected:\n" + _infoTableCountries + "\n"
                  + " Found:\n" + _existingTableCountries);
        }
        final HashMap<String, TableInfo.Column> _columnsTableGlobal = new HashMap<String, TableInfo.Column>(7);
        _columnsTableGlobal.put("Id", new TableInfo.Column("Id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableGlobal.put("NewConfirmed", new TableInfo.Column("NewConfirmed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableGlobal.put("TotalConfirmed", new TableInfo.Column("TotalConfirmed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableGlobal.put("NewDeaths", new TableInfo.Column("NewDeaths", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableGlobal.put("TotalDeaths", new TableInfo.Column("TotalDeaths", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableGlobal.put("NewRecovered", new TableInfo.Column("NewRecovered", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTableGlobal.put("TotalRecovered", new TableInfo.Column("TotalRecovered", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTableGlobal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTableGlobal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTableGlobal = new TableInfo("TableGlobal", _columnsTableGlobal, _foreignKeysTableGlobal, _indicesTableGlobal);
        final TableInfo _existingTableGlobal = TableInfo.read(_db, "TableGlobal");
        if (! _infoTableGlobal.equals(_existingTableGlobal)) {
          return new RoomOpenHelper.ValidationResult(false, "TableGlobal(com.hh.coronalastupdate.db.TableGlobal).\n"
                  + " Expected:\n" + _infoTableGlobal + "\n"
                  + " Found:\n" + _existingTableGlobal);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f93226b7383bffe2d1e01d03df85fbfb", "8397db2a34672a9f5fd836164c07d48f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "TableCountries","TableGlobal");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `TableCountries`");
      _db.execSQL("DELETE FROM `TableGlobal`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CoronaInfoDao getCoronaInfoDao() {
    if (_coronaInfoDao != null) {
      return _coronaInfoDao;
    } else {
      synchronized(this) {
        if(_coronaInfoDao == null) {
          _coronaInfoDao = new CoronaInfoDao_Impl(this);
        }
        return _coronaInfoDao;
      }
    }
  }

  @Override
  public GlobalDao getGlobalDao() {
    if (_globalDao != null) {
      return _globalDao;
    } else {
      synchronized(this) {
        if(_globalDao == null) {
          _globalDao = new GlobalDao_Impl(this);
        }
        return _globalDao;
      }
    }
  }
}
