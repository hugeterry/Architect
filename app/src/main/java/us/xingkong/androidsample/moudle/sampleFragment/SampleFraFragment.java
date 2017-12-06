package us.xingkong.androidsample.moudle.sampleFragment;

import android.os.Bundle;
import android.view.View;

import us.xingkong.androidsample.R;
import us.xingkong.androidsample.base.BaseFragment;

/**
 * @author hugeterry(http://hugeterry.cn)
 */
public class SampleFraFragment extends BaseFragment<SampleFraContract.Presenter> implements SampleFraContract.View {


    @Override
    protected SampleFraContract.Presenter createPresenter() {
        return new SampleFraPresenter(this);
    }

    @Override
    protected int bindLayout() {
        return R.layout.fragment_show;
    }

    @Override
    protected void prepareData(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View rootView) {


    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }


    @Override
    protected void initEvent() {

    }

}
