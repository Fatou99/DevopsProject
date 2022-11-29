package tn.devops.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.devops.entities.Group;
import tn.devops.repository.IGroupRepository;

@Service
public class GroupManagement {

    @Autowired
    IGroupRepository repo;

    public void addGroup(Group g){
        repo.save(g);
    }
    public void deleteGroup(int id){
        repo.deleteById((id));
    }
    public void updateGroupName(int id, String name){
        Group g = repo.findById(id).orElse(null);
        g.setName(name);
        repo.save(g);
    }
    public void updateGroupCapacity(int id, int capacity){
        Group g = repo.findById(id).orElse(null);
        g.setCapacity(capacity);
        repo.save(g);
    }

}
