package us.xingkong.androidsample.moudle.sample;


import us.xingkong.androidsample.base.BasePresenter;
import us.xingkong.androidsample.base.BaseView;

/**
 * @author hugeterry(http://hugeterry.cn)
 */
public interface SampleContract {

    interface View extends BaseView<Presenter> {
    }

    interface Presenter extends BasePresenter {

    }
}
