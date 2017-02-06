package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zhangyu.eventbusdemo.MessageEvent;
import com.zhangyu.eventbusdemo.R;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


/**
 * Created by Administrator on 2016/9/5.
 */
public class PurchaseCarFragment extends Fragment {


    private static final String[] strs = new String[] {
            "first", "second", "third", "fourth", "fifth"
    };

    ListView purchase_list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentpurchase, null);
        //  return View.inflate(getActivity(), R.layout.fragmentpurchase, null);

        initView(view);
        return view;
    }

    private void initView(View view) {
        purchase_list = (ListView) view.findViewById(R.id.purchase_list);//得到ListView对象的引用 /*为ListView设置Adapter来绑定数据*/
        purchase_list.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strs));
    }


    @Override
    public void setMenuVisibility(boolean menuVisible) {
        // TODO Auto-generated method stub
        super.setMenuVisibility(menuVisible);
        if(this.getView()!=null){
            this.getView().setVisibility(menuVisible? View.VISIBLE: View.GONE);
        }
    }



}
