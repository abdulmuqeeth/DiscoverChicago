package abdulmuqeeth.uic.com.discoverchicago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import abdulmuqeeth.uic.com.discoverchicago.AttractionsNameFragment.ListSelectionListener;

public class AttractionsActivity extends AppCompatActivity implements
        ListSelectionListener {

    static String[] mTitleArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTitleArray = getResources().getStringArray(R.array.Attractions);

        setContentView(R.layout.activity_attractions);
    }

    @Override
    public void onListSelection(int index) {
        //TODO implent onListSelection
    }
}
