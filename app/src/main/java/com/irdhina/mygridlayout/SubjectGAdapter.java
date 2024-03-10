package com.irdhina.mygridlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
public class SubjectGAdapter extends ArrayAdapter<SubjectModal> {
    public SubjectGAdapter(@NonNull Context context, ArrayList<SubjectModal> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
        }

        SubjectModal subjModel = getItem(position);
        TextView courseTV = listItemView.findViewById(R.id.idTVCourse);
        ImageView courseIV = listItemView.findViewById(R.id.idIVcourse);

        if (subjModel != null) {
            courseTV.setText(subjModel.getSubj_name());
            courseIV.setImageResource(subjModel.getImgid());
        }

        return listItemView;
    }
}
