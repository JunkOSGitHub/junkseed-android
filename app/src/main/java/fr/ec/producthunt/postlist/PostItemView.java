package fr.ec.producthunt.postlist;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import fr.ec.producthunt.R;

@EViewGroup(R.layout.post_item)
public class PostItemView extends LinearLayout {

    @ViewById(R.id.nameView)
    TextView nameView;

    @ViewById(R.id.idView)
    TextView idView;

    @ViewById(R.id.taglineView)
    TextView taglineView;

    public PostItemView(Context context) {
        super(context);
    }

    public void bind(Post post) {
        nameView.setText(post.getName());
        idView.setText(String.valueOf(post.getId()));
        taglineView.setText(post.getTagline());
    }
}