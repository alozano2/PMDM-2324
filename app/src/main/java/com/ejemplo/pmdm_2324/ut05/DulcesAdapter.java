package com.ejemplo.pmdm_2324.ut05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ejemplo.pmdm_2324.R;

import java.util.ArrayList;
import java.util.Arrays;

public class DulcesAdapter extends RecyclerView.Adapter<DulcesAdapter.ViewHolder> {

    private ArrayList<u5a2DulceNavidad> datos;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nombre;
        private final TextView frutosSecos;
        private final TextView calorias;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            nombre = (TextView) view.findViewById(R.id.ut05NombrePastel);
            frutosSecos = (TextView) view.findViewById(R.id.ut05frutosSecos);
            calorias = (TextView) view.findViewById(R.id.ut05Calorias);
        }

        public TextView getTextNombre() {
            return nombre;
        }

        public TextView getTextFrutosSecos() {
            return frutosSecos;
        }
        public TextView getTextCalorias() {
            return calorias;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public DulcesAdapter(u5a2DulceNavidad[] dataSet) {
        datos = new ArrayList<u5a2DulceNavidad>();
        add(dataSet);
    }

    // Create new views (invoked by the layout manager)
    @Override
    public DulcesAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_pasteles, viewGroup, false);

        return new DulcesAdapter.ViewHolder(view);
    }

    public void onBindViewHolder(DulcesAdapter.ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextNombre().setText(datos.get(position).nombre);
        viewHolder.getTextFrutosSecos().setText(datos.get(position).frutosSecos);
        viewHolder.getTextCalorias().setText(datos.get(position).caloria);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void add(u5a2DulceNavidad[] dataSet){
        datos.addAll(Arrays.asList(dataSet));
        notifyDataSetChanged();
    }
}
