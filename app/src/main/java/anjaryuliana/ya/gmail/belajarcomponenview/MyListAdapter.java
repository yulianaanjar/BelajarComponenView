package anjaryuliana.ya.gmail.belajarcomponenview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] maintitle,String[] subtitle, Integer[] imgid) {
        super(context, R.layout.mylist, maintitle);
        // TODO Auto-generated constructor stub
        // Adapter adalah jembatan antara dan AdapterView dengan data.
        // Adapter inilah yang menyediakan akses ke item data dan juga bertanggung jawab untuk membuat sebuah
        // View pada setiap item dalam kumpulan data. Selain itu Adapter juga yang mengelola data model.

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        return rowView;
    };   }