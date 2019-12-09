package com.mukeshapps.android_mvvm_retrofit_recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.mukeshapps.android_mvvm_retrofit_recyclerview.R;
import com.mukeshapps.android_mvvm_retrofit_recyclerview.model.Article;
import java.util.ArrayList;


/**
 * Adapter class to set the view of list data.
 * Fetch data from model class and set data in each view using ViewHolder
 */
public class MovieArticleAdapter extends RecyclerView.Adapter<MovieArticleAdapter.ViewHolder> {

    private Context context;
    ArrayList<Article> articleArrayList;

    public MovieArticleAdapter(Context context, ArrayList<Article> articleArrayList) {
        this.context = context;
        this.articleArrayList = articleArrayList;
    }

    @NonNull
    @Override
    public MovieArticleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_each_row_movie_article,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieArticleAdapter.ViewHolder viewHolder, int i) {

        //Get object of each list
        Article article=articleArrayList.get(i);

        //Set text data
        viewHolder.tvTitle.setText(article.getTitle());
        viewHolder.tvAuthorAndPublishedAt.setText("-"+article.getAuthor() +" | "+"Piblishetd At: "+article.getPublishedAt());
        viewHolder.tvDescription.setText(article.getDescription());

        //Load image data using Glide/Picasso
        Glide.with(context)
                .load(article.getUrlToImage())
                .into(viewHolder.imgViewCover);
    }

    @Override
    public int getItemCount() {
        return articleArrayList.size();
    }

    /**
     * View holder class to keep the view items
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imgViewCover;
        private final TextView tvTitle;
        private final TextView tvAuthorAndPublishedAt;
        private final TextView tvDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgViewCover=(ImageView) itemView.findViewById(R.id.imgViewCover);
            tvTitle=(TextView) itemView.findViewById(R.id.tvTitle);
            tvAuthorAndPublishedAt=(TextView) itemView.findViewById(R.id.tvAuthorAndPublishedAt);
            tvDescription=(TextView) itemView.findViewById(R.id.tvDescription);
        }
    }
}
