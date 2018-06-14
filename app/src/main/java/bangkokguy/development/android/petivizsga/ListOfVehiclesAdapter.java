package bangkokguy.development.android.petivizsga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bangkokguy on 2018.06.14.;
 */

public class ListOfVehiclesAdapter extends ArrayAdapter<Vehicle> {

    private final ArrayList<Vehicle>    items;
    private final Context               context;
    private final LayoutInflater        inflater;

    public ListOfVehiclesAdapter(
            Context context,
            int resource,
            ArrayList<Vehicle> mItems) {
        super(context, resource, mItems);

        this.items = mItems;
        this.context = context;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;
        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.name = (TextView)convertView.findViewById(R.id.name);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder)convertView.getTag();
        }

        Vehicle item = getItem(position);
        if (item != null)
        {
            // This is where you set up the views.
            // This is just an example of what you could do.
            holder.name.setText(item.getManufacturer());
        }

        return convertView;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Vehicle getItem(int position) {
        return items.get(position);
    }

    public class ViewHolder {
        TextView    name;
    }
}
