package fr.ec.producthunt.postlist;

import android.util.Log;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.rest.RestService;

import java.util.ArrayList;
import java.util.List;

import fr.ec.producthunt.RestClient;

@EBean
public class RestPostFinder implements PostFinder {
    @RestService
    RestClient client;

    @Override
    public List<Post> findAll() {
        List<Post> posts = client.getPosts().getPosts();
        for(Post post : posts){
            Log.d("RestPostFinder",post.toString());
        }
        return posts;
    }
}
