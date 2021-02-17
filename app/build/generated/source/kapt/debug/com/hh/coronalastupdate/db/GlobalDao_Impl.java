package com.hh.coronalastupdate.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hh.coronalastupdate.models.Global;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GlobalDao_Impl implements GlobalDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TableGlobal> __insertionAdapterOfTableGlobal;

  public GlobalDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTableGlobal = new EntityInsertionAdapter<TableGlobal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TableGlobal` (`Id`,`NewConfirmed`,`TotalConfirmed`,`NewDeaths`,`TotalDeaths`,`NewRecovered`,`TotalRecovered`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TableGlobal value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getNewConfirmed());
        stmt.bindLong(3, value.getTotalConfirmed());
        stmt.bindLong(4, value.getNewDeaths());
        stmt.bindLong(5, value.getTotalDeaths());
        stmt.bindLong(6, value.getNewRecovered());
        stmt.bindLong(7, value.getTotalRecovered());
      }
    };
  }

  @Override
  public void insertAllGlobal(final TableGlobal tableGlobal) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTableGlobal.insert(tableGlobal);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<Global> getAllGlobal() {
    final String _sql = "select * from tableglobal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tableglobal"}, false, new Callable<Global>() {
      @Override
      public Global call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfNewConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "NewConfirmed");
          final int _cursorIndexOfTotalConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "TotalConfirmed");
          final int _cursorIndexOfNewDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "NewDeaths");
          final int _cursorIndexOfTotalDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "TotalDeaths");
          final int _cursorIndexOfNewRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "NewRecovered");
          final int _cursorIndexOfTotalRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "TotalRecovered");
          final Global _result;
          if(_cursor.moveToFirst()) {
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
            _result = new Global(_tmpNewConfirmed,_tmpTotalConfirmed,_tmpNewDeaths,_tmpTotalDeaths,_tmpNewRecovered,_tmpTotalRecovered);
          } else {
            _result = null;
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
