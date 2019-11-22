package applicationtest.delle1.example.com.logreg;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MessageFragment extends Fragment {
    private FragmentAListener listener;
    private Button b1,b2,b3;

    public interface FragmentAListener {
        void onInputASent(CharSequence input);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_message, container, false);

        b1 = v.findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn1();

            }
        });
        b2 = v.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn2();

            }
        });
        b3 = v.findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBtn3();

            }
        });
        return v;
    }

    public void openBtn1(){

        Intent i = new Intent(getActivity().getBaseContext(),
                cours.class);
        getActivity().startActivity(i);
    }
    public void openBtn2(){

        Intent i = new Intent(getActivity().getBaseContext(),
                niveau1.class);
        getActivity().startActivity(i);
    }
    public void openBtn3(){

        Intent i = new Intent(getActivity().getBaseContext(),
                niveau2.class);
        getActivity().startActivity(i);
    }

}
