package com.technologynorth.rosera.popularmoviess1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rosera on 03/05/16.
 */
public class MovieAdapter extends ArrayAdapter<Movie> {

    Activity            mActivity;
    ArrayList<Movie>    mMovies;

    public MovieAdapter(Activity context, ArrayList<Movie> movies) {
        super(context, 0, movies);

        this.mActivity = context;
        this.mMovies = movies;
    }

    // ViewHolder pattern
    private static class ViewHolder {
        ImageView mImageViewFilm;
    }


    @Override
    public int getCount() {
        return mMovies.size();
    }

    @Override
    public Movie getItem(int position) {
        return mMovies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder  filmViewHolder;
        View gridView;

        LayoutInflater inflater = (LayoutInflater)
                mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null) {
            gridView = new View(mActivity);

            gridView = inflater.inflate(R.layout.gridview_image, null);
            gridView.setLayoutParams(new GridView.LayoutParams(350,475));
            ImageView imageView = (ImageView)gridView.findViewById(R.id.imageViewMovie);
            TextView textView = (TextView)gridView.findViewById(R.id.textViewMovie);

            imageView.setImageResource(R.drawable.antman);
            textView.setText("Antman");
        }
        else {
            gridView = (View)view;
        }

        // TODO: Implement the ViewHolder pattern - see GridView bookmark StackOverflow
//        if (view == null) {
//            view = LayoutInflater.from(mActivity).inflate(R.layout.gridview_image, null);
//            view.setLayoutParams(new GridView.LayoutParams(350,475));
//
//            filmViewHolder = new ViewHolder();
//
//            filmViewHolder.mImageViewFilm   = (ImageView) view.findViewById(R.id.imageViewMovie);
//            view.setTag(filmViewHolder);
//        } else {
//            filmViewHolder = (ViewHolder) view.getTag();
//        }


//        if (mMovies.get(position) != null) {
//            filmViewHolder.mImageViewFilm.setImageResource(R.drawable.antman);
////            ImageView imageView = new ImageView(mActivity);
//
//            // Set the information
//  //          imageView.setImageResource(R.drawable.antman);
//        }

        return gridView;
    }
}
