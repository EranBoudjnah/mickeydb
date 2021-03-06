/*
 * Generated by Mickey DB
 */
package com.justeat.example.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.justeat.mickeydb.MickeyOpenHelper;
import com.justeat.mickeydb.Migration;

import com.justeat.example.db.migrations.DefaultTakeawaysDBMigrationInitial;

public abstract class AbstractTakeawaysDBOpenHelper extends MickeyOpenHelper {
	private static final String DATABASE_NAME = "TakeawaysDB.db";

	public static final int VERSION = 1;

	public interface Sources {
		String TAKEAWAYS = "takeaways";
	}

	public AbstractTakeawaysDBOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, VERSION);
	}

	public AbstractTakeawaysDBOpenHelper(Context context, String name) {
		super(context, name, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		applyMigrations(db, 0, VERSION);
	}
	

	@Override
	protected Migration createMigration(int version) {
		switch(version) {
			case 0:
				return createTakeawaysDBMigrationInitial();
			default:
				throw new IllegalStateException("No migration for version " + version);
		}
	}
	
	protected Migration createTakeawaysDBMigrationInitial() {
		return new DefaultTakeawaysDBMigrationInitial();
	}
}
