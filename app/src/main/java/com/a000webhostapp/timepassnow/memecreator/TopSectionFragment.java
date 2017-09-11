package com.a000webhostapp.timepassnow.memecreator;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {

    TopSectionListener activityCommander;

    public interface TopSectionListener{

        public void  CreateMeme(String top,String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try{
            activityCommander = (TopSectionListener)activity;
        }
        catch(ClassCastException e)
        {
            throw new ClassCastException(activity.toString());
        }

    }



    EditText first;
    EditText second;
    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.top_section_fragment,container,false);

        first = v.findViewById(R.id.first);
        second = v.findViewById(R.id.second);
        button = v.findViewById(R.id.button);

        button.setOnClickListener(

                new View.OnClickListener(){
                    public void onClick(View view)
                    {
                            buttonClicked(view);
                    }
                }
         );



        return v;



    }

    public void buttonClicked(View newView)
    {
        activityCommander.CreateMeme(first.getText().toString(),second.getText().toString());

    }
}
