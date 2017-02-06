package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhangyu.eventbusdemo.NewMessageEvent;
import com.zhangyu.eventbusdemo.R;

import org.greenrobot.eventbus.EventBus;


/**
 * Created by Administrator on 2016/9/5.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    private TextView jumpto_puraseFragment;
    private TextView jumpto_sellFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = View.inflate(getActivity(), R.layout.fragmenthome, null);
//        EventBus.getDefault().register(getActivity());
        jumpto_puraseFragment = (TextView) view.findViewById(R.id.jumpto_puraseFragment);
        jumpto_sellFragment= (TextView) view.findViewById(R.id.jumpto_sellFragment);
        jumpto_puraseFragment.setOnClickListener(this);
        jumpto_sellFragment.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.jumpto_puraseFragment:
                EventBus.getDefault().post(
                        new NewMessageEvent("1"));
                //   Toast.makeText(getActivity(), "3333333333333", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jumpto_sellFragment:

                EventBus.getDefault().post(
                        new NewMessageEvent("2"));
                break;

        }
    }


    @Override
    public void setMenuVisibility(boolean menuVisible) {
        // TODO Auto-generated method stub
        super.setMenuVisibility(menuVisible);
        if (this.getView() != null) {
            this.getView().setVisibility(menuVisible ? View.VISIBLE : View.GONE);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(getActivity());//反注册EventBus
    }
}
