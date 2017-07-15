package cn.edu.nwpu;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class AboutFragment extends Fragment {
	
	public AboutFragment(){}
	private Button submit;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);
         submit=(Button)rootView.findViewById(R.id.button1);
         final Context context=rootView.getContext();
         submit.setOnClickListener(new Button.OnClickListener(){
        	
        	 public void onClick(View v){
        		 Toast.makeText(context, "¸ÐÐ»ÄúµÄÆÀ·Ö£¡",Toast.LENGTH_SHORT).show();
        	 }
         });
        return rootView;
    }
}
