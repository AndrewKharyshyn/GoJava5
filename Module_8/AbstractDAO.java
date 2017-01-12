package Module_8;

import java.util.List;

interface AbstractDAO <T>{

    void save (T val);
    void delete(T t);
    void deleteAll(List T);
    void saveAll(List T);
    List <T> getList(List list);
    void deleteByld(long id);
    T get(long id);
}
