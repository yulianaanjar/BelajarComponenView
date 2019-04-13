package anjaryuliana.ya.gmail.belajarcomponenview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class dataanjar extends AppCompatActivity {
    ListView list;
    //ListView adalah tampilan beberapa item dalam bentuk list yang dapat di scroll secara vertikal.
    // Setiap item akan otomatis dimasukkan kedalam list menggunakan Adapter yang datanya di ambil dari
    // array/database/json/dsb.
            String[] maintitle ={
            "Yuli","Panji",
            "Awal","Syaiful",
            "Yandre","Judin",
            "Ramri","Gerti",
    };

    String[] subtitle ={
            "anjaryuliana.ya@gmail.com","sobaripanji8@gmail.com",
            "awluddin240797@gmail.com","syaifullhannani00@gmail.com",
            "andrewgandy27@gmail.com","sirojudinag@gmail.com",
            "ramrialwaaliyanta09@gmail.com", "gertianagl@gmail.com",
    };

    Integer[] imgid= new Integer[]{
            R.drawable.download_1, R.drawable.download_2,
            R.drawable.download_3, R.drawable.download_4,
            R.drawable.download_5, R.drawable.download_6,
            R.drawable.download_7, R.drawable.download_8,
    };
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataanjar);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(), "Place Your First Option Code", Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.
                            LENGTH_SHORT).show();
                }

                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
