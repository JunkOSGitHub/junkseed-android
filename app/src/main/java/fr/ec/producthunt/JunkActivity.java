package fr.ec.producthunt;

import android.app.Activity;
import android.widget.ListView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import fr.ec.producthunt.model.Junk;
import fr.ec.producthunt.model.JunkListAdapter;

@EActivity(R.layout.activity_junk)
@OptionsMenu(R.menu.menu_junk)
public class JunkActivity extends Activity {
    @ViewById
    ListView junkList;

    @Bean
    JunkListAdapter adapter;

    @AfterViews
    void bindAdapter() {
        junkList.setAdapter(adapter);
    }

    @ItemClick
    void junkListItemClicked(Junk junk) {
        Toast.makeText(this, junk.getFirstName() + " " + junk.getLastName(), Toast.LENGTH_SHORT).show();
    }
}
