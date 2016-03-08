package fr.ec.producthunt.junklist;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import fr.ec.producthunt.R;

@EViewGroup(R.layout.junk_item)
public class JunkItemView extends LinearLayout {

    @ViewById
    TextView firstNameView;

    @ViewById
    TextView lastNameView;

    public JunkItemView(Context context) {
        super(context);
    }

    public void bind(Junk junk) {
        firstNameView.setText(junk.firstName);
        lastNameView.setText(junk.lastName);
    }
}