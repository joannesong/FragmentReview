package nyc.c4q.fragmentinclass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NextFragment extends Fragment {

    View rootView;
    TextView textView;

    public NextFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_next, container, false);
        textView = (TextView) rootView.findViewById(R.id.nextText);

        Bundle bundle = getArguments();
        String text = bundle.getString("text");
        textView.setText(text);
        return rootView;
    }

}
