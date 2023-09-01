package com.jaejae.cafe_jaerim;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class StudyCafeAdapter extends ArrayAdapter<StudyCafeData> {
    private Context context;
    private int resource;
    private ArrayList<StudyCafeData> objects;
    private LayoutInflater inflate;
    private StudyCafeAdapter.ViewHolder viewHolder;

    public StudyCafeAdapter(@NonNull Context context, int resource, @NonNull ArrayList<StudyCafeData> objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.context = context;
        this.resource = resource;
        this.inflate = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public StudyCafeData getItem(int i) {
        return objects.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource,parent,false);

        final Context context = parent.getContext();

        viewHolder = (ViewHolder)convertView.getTag();

        View itemLayout = convertView;
        if(itemLayout == null){    // 어댑터뷰가 재사용할 뷰를 넘겨주지 않은 경우에만 새로운 뷰를 생성
//            LayoutInflater layoutInflater = LayoutInflater.from(context);
//            convertView = layoutInflater.inflate(resource,parent,false);
            itemLayout = inflate.inflate(R.layout.activity_cafe_list,null);

            viewHolder = new ViewHolder();
            viewHolder.iv_image = itemLayout.findViewById(R.id.iv_image);
            viewHolder.tv_name = itemLayout.findViewById(R.id.tv_name);
            viewHolder.tv_wifi = itemLayout.findViewById(R.id.tv_wifi);
            viewHolder.tv_socket = itemLayout.findViewById(R.id.tv_socket);
            viewHolder.tv_restroom = itemLayout.findViewById(R.id.tv_restroom);
            itemLayout.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)itemLayout.getTag();
        }
        ImageView iv_image = itemLayout.findViewById(R.id.iv_image);
        TextView tv_name = itemLayout.findViewById(R.id.tv_name);
        TextView tv_wifi = itemLayout.findViewById(R.id.tv_wifi);
        TextView tv_socket = itemLayout.findViewById(R.id.tv_socket);
        TextView tv_restroom = itemLayout.findViewById(R.id.tv_restroom);

        iv_image.setImageResource(getItem(position).getImage());
        tv_name.setText(getItem(position).getName());
        tv_wifi.setText(getItem(position).getWifi());
        tv_socket.setText(getItem(position).getSocket());
        tv_restroom.setText(getItem(position).getRestroom());

//        viewHolder.label.setText(arraylist.get(position));
        return itemLayout;
    }

    class ViewHolder{
        public ImageView iv_image;
        public TextView tv_name;
        public TextView tv_wifi;
        public TextView tv_socket;
        public TextView tv_restroom;
    }
}
