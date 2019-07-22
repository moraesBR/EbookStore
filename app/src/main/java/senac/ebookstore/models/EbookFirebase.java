package senac.ebookstore.models;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class EbookFirebase {
    private List<Ebook> ebooks;
    private FirebaseDatabase database;
    private DatabaseReference myRef;

    public EbookFirebase(String urlDB){
        this.database = FirebaseDatabase.getInstance(urlDB);
    }
}
