package com.jude.joy.model.server;

import com.jude.joy.model.bean.ImageJoyPage;
import com.jude.joy.model.bean.TextJoy;
import com.jude.joy.model.bean.TextJoyPage;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ServiceAPI {
//    String BASEURL = "http://apis.baidu.com/showapi_open_bus/";
    String BASEURL = "http://m.yp.mo/macauzine/api/";
    @GET("showapi_joke/joke_text")
    Observable<TextJoyPage> getTextJoyList(@Query("page")int page);

    @GET("showapi_joke/joke_pic")
    Observable<ImageJoyPage> getImageJoyList(@Query("page")int page);

    @GET("article.php")
    Observable<TextJoy> getTestJoyList(@Query("t")String t, @Query("pageID")int pageID, @Query("catchnum")int catchnum);
}