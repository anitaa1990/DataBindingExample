package com.an.databinding.recyclerview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.an.databinding.BR;
import com.an.databinding.R;
import com.an.databinding.model.StudentProfile;

import java.util.List;

public class DataBinding4Adapter extends RecyclerView.Adapter<BindingViewHolder> {

    private LayoutInflater layoutInflater;
    private List<StudentProfile> studentProfileList;
    public DataBinding4Adapter(Context context, List<StudentProfile> studentProfileList) {
        this.studentProfileList = studentProfileList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BindingViewHolder(DataBindingUtil.inflate(layoutInflater,
                R.layout.item_user, parent, false));
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        StudentProfile studentProfile = getItem(position);
        holder.getBinding().setVariable(BR.studentProfile, studentProfile);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return studentProfileList.size();
    }

    public StudentProfile getItem(int position) {
        return studentProfileList.get(position);
    }
}
