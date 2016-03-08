package fr.ec.producthunt;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import fr.ec.producthunt.postlist.PostList;

@Rest(rootUrl = "https://api.producthunt.com/v1/", converters = { GsonHttpMessageConverter.class })
public interface RestClient {
    @Get("/posts?access_token=cd567777bbbfa3108bc701cbcd8b944bab23841dee7b83c39ea8e330972ac08c")
    PostList getPosts();
}
