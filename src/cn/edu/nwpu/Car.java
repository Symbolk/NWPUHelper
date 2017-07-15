package cn.edu.nwpu;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class Car extends TabActivity
{
	//����TabHost����
	TabHost mTabHost;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//ȡ��TabHost����
		mTabHost = getTabHost();
	    
		/* ΪTabHost��ӱ�ǩ */
		//�½�һ��newTabSpec(newTabSpec)
		//�������ǩ��ͼ��(setIndicator)
		//��������(setContent)
	    mTabHost.addTab(mTabHost.newTabSpec("��һ������")
	    		.setIndicator("��һ������",getResources().getDrawable(R.drawable.ic_action_refresh))
	    		.setContent(R.id.imageview1));
	    mTabHost.addTab(mTabHost.newTabSpec("���������ռ��ڼ���")
	    		.setIndicator("���������ռ��ڼ���",getResources().getDrawable(R.drawable.ic_action_refresh))
	    		.setContent(R.id.imageview2));
	    
	    //���õ�ǰ��ʾ��һ����ǩ
	    mTabHost.setCurrentTab(0);
	    
	    //��ǩ�л��¼�����setOnTabChangedListener 
	    mTabHost.setOnTabChangedListener(new OnTabChangeListener()
	    {
	    	// TODO Auto-generated method stub
            @Override
            public void onTabChanged(String tabId) 
            {
  	    	  	/*Dialog dialog = new AlertDialog.Builder(Car.this)
  	    	  			.setTitle("��ʾ")
  	    	  			.setMessage("��ǰѡ�У�"+tabId+"��ǩ")
  	    	  			.setPositiveButton("ȷ��",
  	    	  			new DialogInterface.OnClickListener() 
  	    	  			{
  	    	  				public void onClick(DialogInterface dialog, int whichButton)
  	    	  				{
  	    	  					dialog.cancel();
  	    	  				}
  	    	  			}).create();//������ť
	    	  
  	    	  	dialog.show();*/
            }            
        });
	}
}
