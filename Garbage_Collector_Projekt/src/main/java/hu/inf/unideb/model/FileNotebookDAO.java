package hu.inf.unideb.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileNotebookDAO implements NotebookDAO{

    private List<Notebook> notebooks;

    public FileNotebookDAO()
    {
        try(FileInputStream fis = new FileInputStream("notebooks.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);)
        {
            notebooks = (List<Notebook>) ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            notebooks = new ArrayList<>();
        }
    }

    private void serialize(){
        try (FileOutputStream fos = new FileOutputStream("notebooks.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);)
        {
            oos.writeObject(notebooks);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void saveNotebook(Notebook a)
    {
        if(!notebooks.contains(a)) {
            notebooks.add(a);
            serialize();
        }
    }

    @Override
    public void deleteNotebook(Notebook a)
    {
        notebooks.remove(a);
        serialize();
    }

    @Override
    public void updateNotebook(Notebook a)
    {
        notebooks.remove(a);
        notebooks.add(a);
        serialize();
    }

    public List<Notebook> getNotebook()
    {
        return notebooks;
    }

    @Override
    public void close() throws Exception
    {
        serialize();
    }
}
