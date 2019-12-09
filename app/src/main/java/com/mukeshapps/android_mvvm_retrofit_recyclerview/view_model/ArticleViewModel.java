package com.mukeshapps.android_mvvm_retrofit_recyclerview.view_model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.mukeshapps.android_mvvm_retrofit_recyclerview.repository.ArticleRepository;
import com.mukeshapps.android_mvvm_retrofit_recyclerview.response.ArticleResponse;

/**
 * ViewModel for Articles
 */
public class ArticleViewModel extends AndroidViewModel {

    private ArticleRepository articleRepository;
    private LiveData<ArticleResponse> articleResponseLiveData; //observable data

    public ArticleViewModel(@NonNull Application application) {
        super(application);

        //TODO: Add your API keys here.
        articleRepository = new ArticleRepository();
        //this.articleResponseLiveData = articleRepository.getMovieArticles("movies", "API Key");
    }

    /**
     * Get this LiveData from anywhere
     * @return List of @ArticleResponse objects
     */
    public LiveData<ArticleResponse> getArticleResponseLiveData() {
        return articleResponseLiveData;
    }
}
