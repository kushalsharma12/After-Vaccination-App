package com.kushalsharma.gotvaccine;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.kushalsharma.gotvaccine.util.NoteReopsitory;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private NoteReopsitory reopsitory;
    private LiveData<List<Note>> allNotes;



    public NoteViewModel(@NonNull Application application) {
        super(application);
        reopsitory = new NoteReopsitory(application);
        allNotes = reopsitory.getAllNotes();
    }
    public void insert(Note note){
        reopsitory.insert(note);
    }
    public void delete(Note note){
        reopsitory.delete(note);
    }
    public void update(Note note){
        reopsitory.update(note);
    }
    public void deleteAll(){
        reopsitory.deleteAll();
    }
    public LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }
}
