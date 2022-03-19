package com.examplesky.vnoteappv;

import androidx.cardview.widget.CardView;

import com.examplesky.vnoteappv.model.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
