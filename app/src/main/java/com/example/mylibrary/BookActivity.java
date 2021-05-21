package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class BookActivity extends AppCompatActivity {

    private Button btnAddCurrent, btnAddWantToRead, btnAddAlreadyRead, btnAddToFavorites;
    private ImageView bookImage;
    private TextView txtDescBook, fieldLongDescBook, fieldBookName, fieldAuthor, fieldPages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

        String longDescription = "En japonés, la letra q y el número 9 son homófonos, los dos se pronuncian kyu, " +
                "de manera que 1Q84 es, sin serlo, 1984, una fecha de ecos orwellianos. Esa variación en la grafía refleja " +
                "la sutil alteración del mundo en que habitan los personajes de esta novela, que es, también sin serlo, el Japón de 1984. " +
                "En ese mundo en apariencia normal y reconocible se mueven Aomame, una mujer independiente, instructora en un " +
                "gimnasio, y Tengo, un profesor de matemáticas. Ambos rondan los treinta años, ambos llevan vidas solitarias " +
                "y ambos perciben a su modo leves desajustes en su entorno, que los conducirán de manera inexorable a un destino común. " +
                "Y ambos son más de lo que parecen: la bella Aomame es una asesina; el anodino Tengo, un aspirante a novelista al que " +
                "su editor ha encargado un trabajo relacionado con La crisálida del aire, una enigmática obra dictada por una esquiva adolescente." +
                " Y, como telón de fondo de la historia, el universo de las sectas religiosas, el maltrato y la corrupción, un universo enrarecido " +
                "que el narrador escarba con precisión orwelliana.";

        //TODO: Get the incoming data from RecylcerView here
        Book newBook = new Book(
                1,
                233,
                "1Q84",
                "X1",
                "https://copertine.hoepli.it/hoepli/xxl/978/8483/9788483835999.jpg",
                "A work of maddening brilliance",
                longDescription);

        setData(newBook);
    }

    private void setData(Book book){
        fieldBookName.setText(book.getName());
        fieldAuthor.setText(book.getAuthor());
        fieldPages.setText(String.valueOf(book.getPages()));
        fieldLongDescBook.setText(book.getLongDesc());
        Glide.with(this)
                .asBitmap()
                .load(book.getImageUrl())
                .into(bookImage);

    }

    private void initViews(){
        btnAddCurrent = findViewById(R.id.btnAddCurrent);
        btnAddWantToRead = findViewById(R.id.btnAddWantToRead);
        btnAddAlreadyRead = findViewById(R.id.btnAddAlreadyRead);
        btnAddToFavorites = findViewById(R.id.btnAddToFavorites);
        bookImage = findViewById(R.id.bookImage);

        fieldBookName = findViewById(R.id.textBookName);
        fieldAuthor = findViewById(R.id.textAuthorName);
        fieldPages = findViewById(R.id.textBookPages);

        txtDescBook = findViewById(R.id.txtDescriptionBook);
        fieldLongDescBook = findViewById(R.id.txtLongDescriptionBook);



    }

}