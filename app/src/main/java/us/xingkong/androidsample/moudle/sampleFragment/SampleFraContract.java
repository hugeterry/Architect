package us.xingkong.androidsample.moudle.sampleFragment;


import us.xingkong.androidsample.base.BasePresenter;
import us.xingkong.androidsample.base.BaseView;

/**
 * @author hugeterry(http://hugeterry.cn)
 */
public interface SampleFraContract {
    interface View extends BaseView<Presenter> {
    }

    interface Presenter extends BasePresenter {
    }
}
