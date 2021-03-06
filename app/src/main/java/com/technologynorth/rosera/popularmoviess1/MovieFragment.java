package com.technologynorth.rosera.popularmoviess1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MovieFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MovieFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MovieFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    // TODO: Add variables
//    private ArrayAdapter<Movie> mMovieAdapter       = null;
    private GridView            mGridViewMovies     = null;
    private ArrayList<Movie>    mMovieInformation   = null;
    private boolean mPopulate = false;

    public MovieFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MovieFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MovieFragment newInstance(String param1, String param2) {
        MovieFragment fragment = new MovieFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        // Todo: Allocate memory for the film information
        if (mMovieInformation == null) {
//            mMovieInformation.clear();
            mMovieInformation = new ArrayList<Movie>();
        }
    }


    private void setMovieList() {

        mMovieInformation.add(new Movie("Antman", "2015", "TBC", "TBC"));
        mMovieInformation.add(new Movie("Civil War", "2016", "TBC", "TBC"));
        mMovieInformation.add(new Movie("Star Wars", "1978", "TBC", "TBC"));
        mMovieInformation.add(new Movie("Matrix", "1999", "TBC", "TBC"));
        mMovieInformation.add(new Movie("Pulp Fiction", "1994", "TBC", "TBC"));
        mMovieInformation.add(new Movie("Antman", "2015", "TBC", "TBC"));
        mMovieInformation.add(new Movie("Civil War", "2016", "TBC", "TBC"));
        mMovieInformation.add(new Movie("Star Wars", "1978", "TBC", "TBC"));
        mMovieInformation.add(new Movie("Matrix", "1999", "TBC", "TBC"));
        mMovieInformation.add(new Movie("Pulp Fiction", "1994", "TBC", "TBC"));

        mPopulate = true;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_movie, container, false);

        // TODO: Get GridView reference
        mGridViewMovies = (GridView) rootView.findViewById(R.id.gridViewMovie);

        // TODO: Populate the adapter
//        mMovieAdapter = new MovieAdapter(getActivity(), mMovieInformation);
        if (mPopulate == false) {
            setMovieList();
        }

        // TODO: Set the Adapter with the content
        mGridViewMovies.setAdapter(new MovieAdapter(getActivity(), mMovieInformation));

        // TODO: Add an onItemClick method
        mGridViewMovies.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Image " + position, Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
