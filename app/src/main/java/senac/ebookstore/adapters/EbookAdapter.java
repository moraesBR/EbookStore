package senac.ebookstore.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import senac.ebookstore.R;
import senac.ebookstore.models.Ebook;

public class EbookAdapter extends RecyclerView.Adapter<EbookAdapter.EbookViewHolder> {
    private List<Ebook> ebooks;
    private Context context;

    public EbookAdapter(List<Ebook> ebooks, Context context) {
        this.ebooks = ebooks;
        this.context = context;
    }

    @NonNull
    @Override
    public EbookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_ebooks,parent,false);
        return new EbookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EbookViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return ebooks.size();
    }

    class EbookViewHolder extends RecyclerView.ViewHolder{

        public EbookViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
