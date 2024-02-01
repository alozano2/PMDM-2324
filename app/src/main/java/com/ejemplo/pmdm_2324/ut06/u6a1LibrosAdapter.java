package com.ejemplo.pmdm_2324.ut06;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.ejemplo.pmdm_2324.R;

import java.util.ArrayList;

public class u6a1LibrosAdapter extends RecyclerView.Adapter<u6a1LibrosAdapter.ViewHolder>  {
    private ArrayList<u6a1Libros> datos;

    public interface ItemClickListener {
        void onClick(View view, int position, u6a1Libros producto);
    }
    private ItemClickListener clickListener;
    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final TextView titulo;
        private final TextView autor;
        private final TextView editorial;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            titulo = (TextView) view.findViewById(R.id.ut06tituloLibro);
            autor = (TextView) view.findViewById(R.id.ut06autorLibro);
            editorial = (TextView) view.findViewById(R.id.ut06editorialLibro);
            view.setOnClickListener(this);
        }

        public void setInfo(String nombre_libro, String autor_libro, String editorial_libro) {
            titulo.setText(nombre_libro);
            autor.setText(autor_libro);
            editorial.setText(editorial_libro);
        }

        @Override
        public void onClick(View view) {
            // Si tengo un manejador de evento lo propago con el índice
            if (clickListener != null) clickListener.onClick(view, getAdapterPosition(), datos.get(getAdapterPosition()));
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public u6a1LibrosAdapter(ArrayList<u6a1Libros> dataSet) {
        datos = new ArrayList<u6a1Libros>();
        add(dataSet);
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_libros, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        u6a1Libros e = datos.get(position);
        viewHolder.setInfo(e.getTitulo(),e.getAutor(), e.getEditorial());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void add(ArrayList<u6a1Libros> dataSet){
        datos.addAll(dataSet);
        notifyDataSetChanged();
    }
}
