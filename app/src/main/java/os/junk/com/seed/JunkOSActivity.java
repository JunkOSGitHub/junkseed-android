package os.junk.com.seed;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.activity_junk_os)
@OptionsMenu(R.menu.menu_junk_os)
public class JunkOSActivity extends AppCompatActivity {
    // INJECT VIEWS
    @ViewById(R.id.toolbar)
    Toolbar toolbar;
    @ViewById(R.id.fab)
    FloatingActionButton fab;

    // STRING RESOURCES
    @StringRes(R.string.junk_os_greetings)
    String junk_os_greetings;

    // ACTION LISTENERS
    @Click(R.id.fab)
    void onFabClick(View view){
        Snackbar.make(view, junk_os_greetings, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
    @OptionsItem(R.id.action_settings)
    boolean onSettingClick(){
        Log.d(JUNK_OS_ACTIVITY_LOG,"Settings Click");
        return true;
    }

    // INIT
    @AfterViews
    void init(){
        setSupportActionBar(toolbar);
    }

    private static final String JUNK_OS_ACTIVITY_LOG = "JunkOSActivity";
}
