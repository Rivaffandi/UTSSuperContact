package user.contact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    KontakAdapter adapter;
    List<KontakModel> kontakModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        adapter = new KontakAdapter(this, kontakModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        isiData();
    }
    private void isiData(){
        KontakModel model = new KontakModel("Jalaludin", "Jalalkun@gmail.com", "084345259");
        kontakModels.add(model);

        adapter.notifyDataSetChanged();
    }
}
