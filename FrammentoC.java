package it.dsgroup.di.mp.frammenticiclodivita;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FrammentoC extends android.app.Fragment {


    private void log(String str) {
        Log.d("MYDEBUG","FrammentoC: "+str);
    }

    public FrammentoC() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Activity a) {
        super.onAttach(a);
        log("onAttach");

    }

    @Override
    public void onCreate(Bundle s) {
        super.onCreate(s);
        log("onCreate");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        log("onCreateView");
        View v = inflater.inflate(R.layout.fragment_frammento_c, container, false);
        final Button scrivi = (Button) v.findViewById(R.id.button);
        final TextView testo = (TextView) v.findViewById(R.id.testo);

        scrivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo.setText("Buonanotte");
            }
        });
        return v;
    }


    @Override
    public void onActivityCreated(Bundle s) {
        super.onActivityCreated(s);
        log("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        log("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        log("onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        log("onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        log("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        log("onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        log("onDetach");
    }



}
