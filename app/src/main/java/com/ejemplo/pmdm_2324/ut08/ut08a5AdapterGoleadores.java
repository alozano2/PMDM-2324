package com.ejemplo.pmdm_2324.ut08;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ejemplo.pmdm_2324.R;
import com.ejemplo.pmdm_2324.ut06.u6a1Libros;

import java.util.ArrayList;

public class ut08a5AdapterGoleadores extends RecyclerView.Adapter<ut08a5AdapterGoleadores.ViewHolder> {
    private ArrayList<ut08a5ClaseGoleadores> goleadores;

    public interface ItemClickListener{
        void onClick(View view, int position, ut08a5ClaseGoleadores producto);
    }
    private ItemClickListener clickListener;

    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final TextView nombre;
        private final TextView apellido;

        public ViewHolder (View view){
            super(view);
            nombre = (TextView) view.findViewById(R.id.ut08a5nombre);
            apellido = (TextView) view.findViewById(R.id.ut08a5apellido);
            view.setOnClickListener(this);
        }

        public void setInfo(String nombre_jugador, String apellido_jugador) {
            nombre.setText(nombre_jugador);
            apellido.setText(apellido_jugador);
        }

        public void onClick(View view) {
            // Si tengo un manejador de evento lo propago con el índice
            if (clickListener != null) clickListener.onClick(view, getAdapterPosition(), goleadores.get(getAdapterPosition()));
        }
    }

    public ut08a5AdapterGoleadores(ArrayList<ut08a5ClaseGoleadores> dataSet) {
        goleadores = new ArrayList<ut08a5ClaseGoleadores>();
        add(dataSet);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_jugadores, viewGroup, false);

        return new ut08a5AdapterGoleadores.ViewHolder(view);
    }

    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        ut08a5ClaseGoleadores e = goleadores.get(position);
        viewHolder.setInfo(e.nombre, e.getApellido());
    }

    public int getItemCount() {
        return goleadores.size();
    }

    public void add(ArrayList<ut08a5ClaseGoleadores> dataSet){
        goleadores.addAll(dataSet);
        notifyDataSetChanged();
    }
}
