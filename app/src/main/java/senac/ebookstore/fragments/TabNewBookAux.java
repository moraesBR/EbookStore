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

import senac.ebookstore.R;
import senac.ebookstore.models.Ebook;
import senac.ebookstore.models.Genre;

public class TabNewBookAux extends Fragment {

    TextView txtTitulo, txtIsbn, txtUrlCapa, txtAutor, txtSinopse;
    Spinner spTipo;
    Button btnRegistrar;

    View.OnClickListener buttonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            getFragmentManager().beginTransaction().hide(getFragmentManager().findFragmentByTag("6")).show(getFragmentManager().findFragmentByTag("5")).commit();

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newbookaux, container, false);
        FragmentActivity fragmentActivity = getActivity();
        btnRegistrar = view.findViewById(R.id.btnNovoRegistrar);

        btnRegistrar.setOnClickListener(buttonOnClickListener);

        return view;
    }
}
