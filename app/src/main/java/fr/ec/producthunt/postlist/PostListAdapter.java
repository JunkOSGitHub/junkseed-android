package fr.ec.producthunt.postlist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.UiThread;

import java.util.ArrayList;
import java.util.List;

@EBean
public class PostListAdapter extends BaseAdapter {

    List<Post> posts = new ArrayList<>();

    @Bean(RestPostFinder.class)
    PostFinder postFinder;

    @RootContext
    Context context;

    @AfterInject
    @Background
    void initAdapter() {
        posts = postFinder.findAll();
        updateView();
    }

    @UiThread
    void updateView(){
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        PostItemView postItemView;
        if (convertView == null) {
            postItemView = PostItemView_.build(context);
        } else {
            postItemView = (PostItemView) convertView;
        }

        postItemView.bind(getItem(position));

        return postItemView;
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Post getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}