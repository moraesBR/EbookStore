package senac.ebookstore.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import senac.ebookstore.R;
import senac.ebookstore.models.Ebook;
import senac.ebookstore.models.Genre;

public class TabNewBook extends Fragment {

    TextView txtTitulo, txtIsbn, txtUrlCapa, txtAutor, txtSinopse;
    Spinner spTipo;
    Button btnRegistrar;

    View.OnClickListener buttonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Ebook ebook = new Ebook();
            ebook.setTitle(txtTitulo.getText().toString());
            //Log.e("FRAGMENT",Genre.valueOf(spTipo.getSelectedItem().toString().toUpperCase()).toString());
            ebook.setGenre(Genre.valueOf(spTipo.getSelectedItem().toString().toUpperCase()));
            ebook.setIsbn(txtIsbn.getText().toString());
            ebook.setResume(txtSinopse.getText().toString());
            ebook.addAuthor(txtAutor.getText().toString());
            ebook.setUrlImage(txtUrlCapa.getText().toString());

            Log.e("FRAGMENT",ebook.toString());

            /*FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("ebook-" + ebook.getIsbn());

            myRef.setValue(ebook);*/
            getFragmentManager().beginTransaction().hide(getFragmentManager().findFragmentByTag("5")).show(getFragmentManager().findFragmentByTag("1")).commit();
            //getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Home()).commit();
        }
    };


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newbook,container,false);
        FragmentActivity fragmentActivity = getActivity();
        txtTitulo    = view.findViewById(R.id.titleEbook);
        txtIsbn      = view.findViewById(R.id.isbnEbook);
        txtUrlCapa   = view.findViewById(R.id.coverEbook);
        txtAutor     = view.findViewById(R.id.authorsEbook);
        txtSinopse   = view.findViewById(R.id.resumeEbook);
        spTipo       = view.findViewById(R.id.genreEbook);
        btnRegistrar = view.findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(buttonOnClickListener);

        return view;
    }
}
