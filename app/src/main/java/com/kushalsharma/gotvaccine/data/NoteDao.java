package com.kushalsharma.gotvaccine.data;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.kushalsharma.gotvaccine.Note;

import java.util.List;

@Dao
public interface NoteDao {
//CRUD
    @Insert()
    void insert(com.kushalsharma.gotvaccine.Note note);

    @Delete()
    void delete( com.kushalsharma.gotvaccine.Note note);

    @Update
    void update(com.kushalsharma.gotvaccine.Note note);

    @Query("DELETE FROM Notes_Table " )
    void deleteAllNotes();

    @Query("SELECT * FROM Notes_Table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();
}
