package fr.ec.producthunt.junklist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.List;

@EBean
public class JunkListAdapter extends BaseAdapter {

    List<Junk> junks;

    @Bean(InMemoryJunkFinder.class)
    JunkFinder junkFinder;

    @RootContext
    Context context;

    @AfterInject
    void initAdapter() {
        junks = junkFinder.findAll();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        JunkItemView junkItemView;
        if (convertView == null) {
            junkItemView = JunkItemView_.build(context);
        } else {
            junkItemView = (JunkItemView) convertView;
        }

        junkItemView.bind(getItem(position));

        return junkItemView;
    }

    @Override
    public int getCount() {
        return junks.size();
    }

    @Override
    public Junk getItem(int position) {
        return junks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}