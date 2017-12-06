package us.xingkong.androidsample.moudle.sampleFragment;


import us.xingkong.androidsample.base.BasePresenterImpl;

/**
 * @author hugeterry(http://hugeterry.cn)
 */

public class SampleFraPresenter extends BasePresenterImpl implements SampleFraContract.Presenter {

    private final SampleFraContract.View mView;
    public SampleFraPresenter(SampleFraContract.View view) {
        mView = view;
        this.mView.setPresenter(this);
    }

}
