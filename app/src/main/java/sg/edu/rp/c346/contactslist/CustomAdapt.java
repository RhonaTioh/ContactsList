package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010318 on 24/7/2018.
 */

public class CustomAdapt extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ContactList> contactLists;

    public CustomAdapt(@NonNull Context context, int resource, @NonNull ArrayList<ContactList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactLists = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout_id, parent, false);
        }

        TextView tvName = row.findViewById(R.id.textViewName);
        TextView tvCode = row.findViewById(R.id.textViewCode);
        TextView tvNumber = row.findViewById(R.id.textViewNumber);

        ContactList currentItem = contactLists.get(position);

        String name = currentItem.getName();
        int code = currentItem.getCode();
        int number = currentItem.getNumber();

        tvName.setText(name);
        tvCode.setText(String.valueOf(code));
        tvNumber.setText(String.valueOf(number));

        return row;
    }
}
