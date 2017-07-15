package cn.edu.nwpu;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeFragment extends Fragment {
	private ImageView img;
	private ViewPager mViewPager;
	private static final String[] titles = {"One","Two","Three","Four","Five"};
	private static final String[] contents={
		"������������7��7�յ磨���� ���� ��Ӱ���� ���Ѿ���7��3�����磬������ҵ��ѧ�Զ���ѧԺ�˲�����������ʽ�ߵ�һ��������̳�ڳ���У�����У�Ҳ���������׸�ѧԺ���˲��������������Թ���������У�����������˲������Ŷӵ�16λ֪��ѧ�ߣ�ѧУ�쵼�����ɡ�����Т��Ԭ��ƽ��У������½��У�ѧУ���ְ�ܲ��������ˣ����Զ���ѧԺʦ������μ��˽�����ʽ���Զ���ѧԺ��ί����ǻ����ֽ�����ʽ��",
		"������������7��2�յ磨���� ���� ��Ӱ���� ���Ѿ� ���ӣ�7��2�����磬�й�������������ҵ��ѧ��ʮ���δ�����Բ������˸�����̣�������У�����ʻ�������ʤ����Ļ������2ʱ30�֣������ϯ�����鳤֣�������ִ��ѡ�١��Ⱥ���ͨ�����ѡ�ٰ취���ܼ�Ʊ�ˡ����ܼ�Ʊ�ˡ���Ʊ�����������ܼ�Ʊ������ͬ־�������£����ܼ�Ʊ�˺ͼ�Ʊ�˼ල�£����������޼������ѡ�ٵķ�ʽ��ѡ���й�������������ҵ��ѧ��ʮ����ίԱ����й�������������ҵ��ѧ���ɼ��ίԱ�ᡣ",
		"������������7��1�յ磨���� ������ ��Ӱ���� ���Ѿ� ���ӣ��й�������������ҵ��ѧ��ʮ���δ�����7��1������������У�����ʻ�������¡�ؿ�Ļ�����ε�������������ҵ��ѧ�ڼӿ콨��ѧ����ɫ����������һ����ѧ�������ٿ���һ�γ�ǰ���󡢼��������Ĵ�ᣬ�ؽ���ѧУ�ĸĸ﷢չ�͵��Ľ�����ҵ������Ҫ����Զ��Ӱ�졣    ���ʻ������ĵ�������ң�����ׯ�϶����ҡ���ϯ̨�Ļ����Ľ�ɫ������ʮ�����޺����ӳ�����������ԡ���Ϊ�ӿ콨��ѧ����ɫ�������ں��պ��캽�����������ش�Ӱ�������һ����ѧ��Ŭ���ܶ����ľ޷��������ڻ᳡�ĺ��Ϸ����Եø�����Ŀ������ȫУ����λ��267��������ѧУ�ĸ﷢չ�͵��Ľ����ơ�",
		"�����Ϊ����2008���ʮһ�ε������ٿ���������ʮһ�쵳ί�ڹ�ҵ����Ϣ�������顢�й�����ʡί����ȷ�쵼�£�����᳹��ʵ����ʮ�ߴ�ʮ�˴����ϰ��ƽ�����ϵ����Ҫ���������Կ�ѧ��չ��Ϊָ������ֵ��Ľ����������������ѧ���򣬳�ַ��ӵ�ί��ѧУ��ҵ��չ�е��쵼�������ã��Ž����ȫУ������Ա�͹��ʦ��Ա��������Χ�ƽ������֪����ˮƽ�о��ʹ�ѧ��Ŀ�꣬������ں�ʽ��չ��·�����˼�롢��ĸ��ץ�����������ȡ��ȫ����ɡ�ʮһ�塱�滮��˳��ʵʩ��ʮ���塱�滮��������ɼ�ͨ����ҵ����Ϣ������һ�����š����������������湤����ȡ�����µĽ�չ��ѧУ��ҵ��չ�����²������ۺϰ�ѧʵ��Ծ����̨�ס����Ե�ʮһ�쵳ί�Ĺ������Ը߶ȿ϶���",
		"������ҵ��ѧ�����ڹŶ����������ҹ�Ψһһ����ͬʱ��չ���ա����졢�������̽����Ϳ�ѧ�о�Ϊ��ɫ���Թ���Ϊ�����ܡ��ġ�������Э����չ���о��͡�����ԺͿ���ʽ�Ŀ�ѧ������ѧ��������ҵ����Ϣ������ѧУ���С��������㡱��Уѵ�����������ʵ������̤ʵ��������ʵ�����ش��¡�����ʵһ�£���У�磬Ϊ�ҹ������Ƽ���ҵ�͹��񾭼ý��������˾޴��ס�����70����Ľ��裬ѧУ������ҵȡ�ó��㷢չ������λ������ߡ�1960�걻����Ժȷ��Ϊȫ���ص��ѧ�������塱�������塱��������Ժ��Ϊ�ص㽨���ȫ��15����ѧ֮һ�������塱����������ҡ�211���̡�����裻��ʮ�塱������ҡ�985���̡��ص㽨�裬��ȫ�����������о���Ժ�͹��Ҵ�ѧ�Ƽ�԰�ĸ�У֮һ��"
	};
/*	private Integer[]	mImageIds = 
		{ 						
				R.drawable.news1, 
				R.drawable.news2, 
				R.drawable.news3, 
				R.drawable.news4, 
				R.drawable.news5, 	
		};*/
	private List<ContentBean> list = new ArrayList<ContentBean>();
	private ContentFragmentPagerAdapter mAdapter;
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
//        img =(ImageView)rootView.findViewById(R.id.img);
        initData();
        findView(rootView);
        
        return rootView;
    }

	private void initData() {
		
		for(int i=0;i<titles.length;i++){
			
			ContentBean cb = new ContentBean();
			cb.setTitle(titles[i]);
			cb.setContent(contents[i]);
//			cb.setImg(R.drawable.news1);			
			list.add(cb);
		}
	}

	private void findView(View rootView) {
		
		mViewPager = (ViewPager) rootView.findViewById(R.id.mViewPager);
		mAdapter = new ContentFragmentPagerAdapter(getActivity().getSupportFragmentManager(),list);
		mViewPager.setAdapter(mAdapter);
	}
	
	@Override
	public void onStart() {
		
		if(mAdapter!=null){
			mAdapter.notifyDataSetChanged();
		}
		
		super.onStart();
	}
}
