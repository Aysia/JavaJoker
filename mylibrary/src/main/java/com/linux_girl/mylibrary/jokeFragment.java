package com.linux_girl.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class jokeFragment extends Fragment {
    public jokeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_joke, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.joke_text);

        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokeActivity.JOKE_KEY);
        TextView jokeTextView = (TextView) rootView.findViewById(R.id.joke_text);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }

        return rootView;
    }
}
