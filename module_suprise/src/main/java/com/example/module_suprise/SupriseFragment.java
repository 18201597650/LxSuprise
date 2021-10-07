package com.example.module_suprise;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.export_suprise.router.SupriseRouterTable;

/**
 * Time:2021/10/7
 * Author:liuxiong
 * Description:
 */
@Route(path = SupriseRouterTable.PATH_FRAGMENT_SUPRISE)
public class SupriseFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private Button mBtnJumpDetail;

    public SupriseFragment() {
        // Required empty public constructor
    }

    public static SupriseFragment newInstance(String param1, String param2) {
        SupriseFragment fragment = new SupriseFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_suprise, container, false);
        mBtnJumpDetail=view.findViewById(R.id.mBtnJumpDetail);
        mBtnJumpDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SupriseDetailActivity.jump(getActivity());
            }
        });
        return view;
    }
}
