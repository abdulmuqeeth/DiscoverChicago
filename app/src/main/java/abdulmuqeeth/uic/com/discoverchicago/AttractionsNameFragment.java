package abdulmuqeeth.uic.com.discoverchicago;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AttractionsNameFragment extends ListFragment {


    public interface ListSelectionListener{
        public void onListSelection(int index);
    }

    private ListSelectionListener mListener = null;

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);
        try{
            mListener = (ListSelectionListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString() + "must implement ListSelectionListener");
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
