package com.example.mplayer.ui;

import android.app.Activity;
import android.os.Bundle;

import com.android.music.R;
import com.example.mplayer.utils.MusicUtils;

public class MusicBrowserActivity extends Activity implements MusicUtils.Defs {

	public MusicBrowserActivity() {
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		int activeTab = MusicUtils.getIntPref(this, "activetab", R.id.artisttab);

	}

}
