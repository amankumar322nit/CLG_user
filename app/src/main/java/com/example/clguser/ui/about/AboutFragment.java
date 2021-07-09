package com.example.clguser.ui.about;

import android.os.Bundle;



import com.example.clguser.R;





        import android.os.Bundle;

        import androidx.fragment.app.Fragment;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;

        import com.bumptech.glide.Glide;

        import java.util.ArrayList;
        import java.util.List;

        import androidx.viewpager.widget.ViewPager;



public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp, "Computer Science", "Computer Science and Engineering started in year 2015. At present intake sheet in I-year is 30 student, and in lateral entry is 6."));
        list.add(new BranchModel(R.drawable.ic_mech, "Mechanical Production", "Mechanical Engineering (Production) started in year 2013. At present intake sheet in I-year is 30 student, and in lateral entry is 6."));

        adapter = new BranchAdapter( getContext(), list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/my-clg-app.appspot.com/o/Gallery%2F%5BB%404906f4cjpg?alt=media&token=c33587d9-dddd-4c36-96a3-bfcebafa024e")
                .into(imageView);

        return  view;
    }
}