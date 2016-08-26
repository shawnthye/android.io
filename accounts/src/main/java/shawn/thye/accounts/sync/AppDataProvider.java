/*
 * Created by shawnthye on 26/08/2016.
 */

package shawn.thye.accounts.sync;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

public class AppDataProvider extends ContentProvider {
    @Override public boolean onCreate() {
        //TODO: 
        return true;
    }

    @Nullable @Override public Cursor query(Uri uri, String[] projection, String selection,
            String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Nullable @Override public String getType(Uri uri) {
        return null;
    }

    @Nullable @Override public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override public int update(Uri uri, ContentValues values, String selection,
            String[] selectionArgs) {
        return 0;
    }
}
