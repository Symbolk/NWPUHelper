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
	//声明TabHost对象
	TabHost mTabHost;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//取得TabHost对象
		mTabHost = getTabHost();
	    
		/* 为TabHost添加标签 */
		//新建一个newTabSpec(newTabSpec)
		//设置其标签和图标(setIndicator)
		//设置内容(setContent)
	    mTabHost.addTab(mTabHost.newTabSpec("周一至周五")
	    		.setIndicator("周一至周五",getResources().getDrawable(R.drawable.ic_action_refresh))
	    		.setContent(R.id.imageview1));
	    mTabHost.addTab(mTabHost.newTabSpec("周六、周日及节假日")
	    		.setIndicator("周六、周日及节假日",getResources().getDrawable(R.drawable.ic_action_refresh))
	    		.setContent(R.id.imageview2));
	    
	    //设置当前显示哪一个标签
	    mTabHost.setCurrentTab(0);
	    
	    //标签切换事件处理，setOnTabChangedListener 
	    mTabHost.setOnTabChangedListener(new OnTabChangeListener()
	    {
	    	// TODO Auto-generated method stub
            @Override
            public void onTabChanged(String tabId) 
            {
  	    	  	/*Dialog dialog = new AlertDialog.Builder(Car.this)
  	    	  			.setTitle("提示")
  	    	  			.setMessage("当前选中："+tabId+"标签")
  	    	  			.setPositiveButton("确定",
  	    	  			new DialogInterface.OnClickListener() 
  	    	  			{
  	    	  				public void onClick(DialogInterface dialog, int whichButton)
  	    	  				{
  	    	  					dialog.cancel();
  	    	  				}
  	    	  			}).create();//创建按钮
	    	  
  	    	  	dialog.show();*/
            }            
        });
	}
}
