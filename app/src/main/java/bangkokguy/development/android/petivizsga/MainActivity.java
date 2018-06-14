package bangkokguy.development.android.petivizsga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Vehicle> vehicles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vehicles = new ArrayList<>();

        vehicles.add(1,
                new Subway(
                        "mann",
                        100,
                        4,
                        100,
                        1,
                        1));
    }
}
