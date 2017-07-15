package cn.edu.nwpu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsFragment extends Fragment {
	
//	private ImageView img;
	private TextView txt;
	public NewsFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_news, container, false);
         txt=(TextView)rootView.findViewById(R.id.textView12);
//         img=(ImageView)rootView.findViewById(R.id.imageView12);
//         img.setImageResource(R.drawable.look);
         txt.setText(R.string.intr);
        return rootView;
    }
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
	}
	public void onCreate(Bundle savedInstanceState) {

		setHasOptionsMenu(true);
	
		super.onCreate(savedInstanceState);
	}
}
