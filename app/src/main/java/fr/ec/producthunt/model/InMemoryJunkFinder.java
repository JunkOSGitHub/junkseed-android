package fr.ec.producthunt.model;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

@EBean
public class InMemoryJunkFinder implements JunkFinder {
    @Override
    public List<Junk> findAll() {
        List<Junk> junkList = new ArrayList<>();
        for(int i=1;i<150;i++){
            junkList.add(new Junk("Junk "+i,"OS"));
        }
        return junkList;
    }
}
