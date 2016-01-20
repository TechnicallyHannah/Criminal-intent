package com.example.a712948.criminal_intent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * @author Hannah Paulson
 * @since 1/4/16.
 */
public class CrimeListFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private CrimeAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime_list, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();
        return view;
    }

    private class CrimeHolder extends RecyclerView.ViewHolder {
        public TextView mTitleView;
        public TextView mDateView;
        public CheckBox mCheckBox;


        public CrimeHolder(View itemView) {
            super(itemView);

            mTitleView = (TextView) itemView.findViewById(R.id.list_item_title_view);
            mDateView = (TextView) itemView.findViewById(R.id.list_item_crime_date);
            mCheckBox = (CheckBox) itemView.findViewById(R.id.list_item_check_box);
        }
    }

    private void updateUI() {
        CrimeLab crimeLab = CrimeLab.getCrimeLab(getActivity());
        List<Crime> crimes = crimeLab.getCrimes();

        mAdapter = new CrimeAdapter(crimes);
        mRecyclerView.setAdapter(mAdapter);
    }

    private class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder> {
        private List<Crime> mCrimes;

        public CrimeAdapter(List<Crime> crimes) {
            mCrimes = crimes;
        }

        @Override
        public CrimeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_crime, parent, false);
            return new CrimeHolder(view);
        }

        @Override
        public void onBindViewHolder(CrimeHolder holder, int position) {
            Crime crime = mCrimes.get(position);
            holder.mTextView.setText(crime.getTitle());
        }

        @Override
        public int getItemCount() {
            return mCrimes.size();
        }
    }

}
