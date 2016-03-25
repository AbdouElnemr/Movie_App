package elnemr.com.phase1.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import elnemr.com.phase1.R;
import elnemr.com.phase1.row;

/**
 * Created by root on 3/25/16.
 */
public class IMageAdapter extends ArrayAdapter<row> {

    Context mycontext;

    public IMageAdapter(Context context, int resource, List<row> therow) {
        super(context, resource, therow);
        this.mycontext = context;
    }

    private class ViewHolder {
        ImageView imageView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        row row = getItem(position);
        LayoutInflater layoutInflater = (LayoutInflater) mycontext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.image, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();


        holder.imageView.setImageResource(row.getImageid());

        return convertView;
    }

}
