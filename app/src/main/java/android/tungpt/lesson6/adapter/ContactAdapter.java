package android.tungpt.lesson6.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.tungpt.lesson6.model.Contact;
import android.tungpt.lesson6.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.viewHolder> {

    private Context mContext;
    private ArrayList<Contact> mContacts;

    public ContactAdapter(Context context, ArrayList<Contact> contactModelList) {
        this.mContext = context;
        this.mContacts = contactModelList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(mContext).inflate
                (R.layout.item_contact, viewGroup, false);
        viewHolder holder = new viewHolder(mView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.bindData(mContacts.get(i));
    }

    @Override
    public int getItemCount() {
        return mContacts != null ? mContacts.size() : 0;
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        private TextView mTextViewName;
        private TextView mTextViewNumber;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewName = itemView.findViewById(R.id.text_phone_name);
            mTextViewNumber = itemView.findViewById(R.id.text_phone_number);
        }

        public void bindData(Contact contactModels) {
            if (contactModels != null) {
                mTextViewName.setText(contactModels.getName());
                mTextViewNumber.setText(contactModels.getPhone());
            }
        }
    }
}
