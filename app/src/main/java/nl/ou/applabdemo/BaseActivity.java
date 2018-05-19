package nl.ou.applabdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nl.ou.applablib.AutoUpdate;
import nl.ou.applablib.ChangeLogSimple;
import nl.ou.applablib.WizardFragment;

/**
 * Created by bvgastel on 18-01-2018.
 */

public class BaseActivity extends AppCompatActivity {
	private static final String VERSION = "0.1"; // als changelog weergegeven moet worden, moet je deze veranderen

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (BuildConfig.DEBUG && getIntent() != null && Intent.ACTION_MAIN.equals(getIntent().getAction()))
			AutoUpdate.checkNewVersion(this, getString(R.string.auto_update_url));

		//if (savedInstanceState == null) {
			WizardFragment wizard = WizardFragment.newInstanceIfNeeded(this, R.xml.wizard);
			if (wizard != null)
				wizard.show(getSupportFragmentManager(), "wizard");
		//}

		ChangeLogSimple cl = new ChangeLogSimple(this, R.raw.changelog, BaseActivity.VERSION);
		//if ((!cl.firstRunEver() && cl.firstRun()))
			cl.getLogDialog(0).show();

	}
}
