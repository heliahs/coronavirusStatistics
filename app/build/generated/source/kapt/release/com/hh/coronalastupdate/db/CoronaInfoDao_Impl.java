package com.hh.coronalastupdate.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CoronaInfoDao_Impl implements CoronaInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TableCountries> __insertionAdapterOfTableCountries;

  public CoronaInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTableCountries = new EntityInsertionAdapter<TableCountries>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TableCountries` (`Country`,`CountryCode`,`Slug`,`NewConfirmed`,`TotalConfirmed`,`NewDeaths`,`TotalDeaths`,`NewRecovered`,`TotalRecovered`,`Date`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TableCountries value) {
        if (value.getCountry() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCountry());
        }
        if (value.getCountryCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountryCode());
        }
        if (value.getSlug() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSlug());
        }
        stmt.bindLong(4, value.getNewConfirmed());
        stmt.bindLong(5, value.getTotalConfirmed());
        stmt.bindLong(6, value.getNewDeaths());
        stmt.bindLong(7, value.getTotalDeaths());
        stmt.bindLong(8, value.getNewRecovered());
        stmt.bindLong(9, value.getTotalRecovered());
        if (value.getDate() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDate());
        }
      }
    };
  }

  @Override
  public void insertAll(final List<TableCountries> coronaInfo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTableCountries.insert(coronaInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<TableCountries>> getAll() {
    final String _sql = "select * from tablecountries";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tablecountries"}, false, new Callable<List<TableCountries>>() {
      @Override
      public List<TableCountries> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "Country");
          final int _cursorIndexOfCountryCode = CursorUtil.getColumnIndexOrThrow(_cursor, "CountryCode");
          final int _cursorIndexOfSlug = CursorUtil.getColumnIndexOrThrow(_cursor, "Slug");
          final int _cursorIndexOfNewConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "NewConfirmed");
          final int _cursorIndexOfTotalConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "TotalConfirmed");
          final int _cursorIndexOfNewDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "NewDeaths");
          final int _cursorIndexOfTotalDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "TotalDeaths");
          final int _cursorIndexOfNewRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "NewRecovered");
          final int _cursorIndexOfTotalRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "TotalRecovered");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "Date");
          final List<TableCountries> _result = new ArrayList<TableCountries>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TableCountries _item;
            final String _tmpCountry;
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            final String _tmpCountryCode;
            _tmpCountryCode = _cursor.getString(_cursorIndexOfCountryCode);
            final String _tmpSlug;
            _tmpSlug = _cursor.getString(_cursorIndexOfSlug);
            final long _tmpNewConfirmed;
            _tmpNewConfirmed = _cursor.getLong(_cursorIndexOfNewConfirmed);
            final long _tmpTotalConfirmed;
            _tmpTotalConfirmed = _cursor.getLong(_cursorIndexOfTotalConfirmed);
            final long _tmpNewDeaths;
            _tmpNewDeaths = _cursor.getLong(_cursorIndexOfNewDeaths);
            final long _tmpTotalDeaths;
            _tmpTotalDeaths = _cursor.getLong(_cursorIndexOfTotalDeaths);
            final long _tmpNewRecovered;
            _tmpNewRecovered = _cursor.getLong(_cursorIndexOfNewRecovered);
            final long _tmpTotalRecovered;
            _tmpTotalRecovered = _cursor.getLong(_cursorIndexOfTotalRecovered);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            _item = new TableCountries(_tmpCountry,_tmpCountryCode,_tmpSlug,_tmpNewConfirmed,_tmpTotalConfirmed,_tmpNewDeaths,_tmpTotalDeaths,_tmpNewRecovered,_tmpTotalRecovered,_tmpDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
