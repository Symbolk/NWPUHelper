package cn.edu.nwpu;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HintFragment extends Fragment {
	private ListView listView;

	public HintFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		setHasOptionsMenu(true);

		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_hint, container,
				false);
		listView = (ListView) rootView.findViewById(R.id.listView1);
		init();
		return rootView;
	}

	private void init() {
		List<String> items = new ArrayList<String>();
		items.add("������ҳ��http://www.nwpu.edu.cn/");
		items.add(" ����ӭ�£�http://yingxin.nwpu.edu.cn");
		items.add("�����ķ�BBS��http://bbs.nwpu.edu.cn/portal.php");
		items.add("�ѹ�ӢBtվ��http://pt.stuclub.cn/");		
		items.add("�����Ż���http://portal.nwpu.edu.cn/dcp/");
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				this.getActivity(), android.R.layout.simple_list_item_1, items);
		listView.setAdapter(adapter);
	}


	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
	}

}
