package hu.inf.unideb.model;

import java.util.List;

public interface NotebookDAO extends AutoCloseable{

    public void saveNotebook(Notebook a);

    public void deleteNotebook(Notebook a);

    public void updateNotebook(Notebook a);

    public List<Notebook> getNotebook();

    public default void saveJoin(JoinTable join)
    {
        throw new UnsupportedOperationException();
    }
}
