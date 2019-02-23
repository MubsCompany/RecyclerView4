package com.example.recyclerview4;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.BarangViewHolder>  {
Context context;

public BarangAdapter(Context context) {
    this.context = context;
    }

    String[] arrayname = {"Travel charger / casan oppo 3 g ori 99","dell inspiron 5468 i5#windows 10 ori#vga... ","charger fast charging xiaomi travel charger","charger free power bank super slim + kabel usb","Apple MacBook Pro 15-Inch (2018)","Huawei MateBook X Pro is a speedy, long-lasting premium notebook"};
    String[] arrayharga = {"Rp 21.000","Rp 8.700.000","Rp 22.000","Rp 22.000","Rp 17.500.000","Rp 22.000.000"};
    int[] arraygambar = {R.drawable.charger,R.drawable.dell,R.drawable.secondcharger,R.drawable.thirdcharger,R.drawable.macbookforsale,R.drawable.matebookforsale};

    @NonNull
    @Override
    public BarangViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new BarangViewHolder( LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.tampilan_list,viewGroup,false ) );
    }

    @Override
    public void onBindViewHolder(@NonNull BarangViewHolder barangViewHolder, int i) {
barangViewHolder.tvnama.setText( arrayname[i] );
barangViewHolder.tvharga.setText( arrayharga[i] );
barangViewHolder.imgbarang.setImageResource( arraygambar[i] );
barangViewHolder.itemView.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent( context,DetaiActivity.class );
        context.startActivity( i );
    }
} );


    }

    @Override
    public int getItemCount() {
        return arrayname.length;
    }


    public class BarangViewHolder extends RecyclerView.ViewHolder {
        TextView tvnama;
        TextView tvharga;
        ImageView imgbarang;

        public BarangViewHolder(@NonNull View itemView) {
            super( itemView );

            tvnama = itemView.findViewById( R.id.tv_merk );
            tvharga = itemView.findViewById( R.id.tv_harga );
            imgbarang = itemView.findViewById( R.id.img_barang );
        }
    }
}
