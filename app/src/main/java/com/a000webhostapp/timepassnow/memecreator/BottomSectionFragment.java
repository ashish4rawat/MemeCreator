package com.a000webhostapp.timepassnow.memecreator;


//import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

public class BottomSectionFragment extends Fragment{

    private static TextView firstText;
    private  static TextView secondText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.botton_section_fragment,container,false);


        firstText = (TextView)v.findViewById(R.id.firstText);
        secondText = (TextView)v.findViewById(R.id.secondText);
        return v;
    }

    public void setMemeText(String top , String bottom)
    {
        firstText.setText(top);
        secondText.setText(bottom);

    }




}


