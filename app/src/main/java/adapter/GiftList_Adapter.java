package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wolfsoft.giftapp.OB1;
import com.wolfsoft.giftapp.R;
import com.wolfsoft.giftapp.Shop_Home;
import com.wolfsoft.giftapp.Single_Product;

import java.util.ArrayList;

import model.GiftlistModel;

/**
 * Created by wolfsoft4 on 14/8/18.
 */

public class GiftList_Adapter extends RecyclerView.Adapter<GiftList_Adapter.ViewHolder> {
    Context context;
    private ArrayList<GiftlistModel> giftlistModelArrayList;

    public GiftList_Adapter(Context context, ArrayList<GiftlistModel> giftlistModelArrayList) {
        this.context = context;
        this.giftlistModelArrayList = giftlistModelArrayList;
    }

    @Override
    public GiftList_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gift_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GiftList_Adapter.ViewHolder holder, final int position) {
        holder.title.setText(giftlistModelArrayList.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    Intent i = new Intent(context, OB1.class);
                    context.startActivity(i);}

                else if(position==1){
                    Intent i = new Intent(context, Single_Product.class);
                    context.startActivity(i);}

                else if(position==2){
                    Intent i = new Intent(context, Shop_Home.class);
                    context.startActivity(i);}


            }
        });

    }

    @Override
    public int getItemCount() {
        return giftlistModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);
        }
    }
}
