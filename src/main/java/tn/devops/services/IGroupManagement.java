package tn.devops.services;

import tn.devops.entities.Group;

public interface IGroupManagement {
    public void addGroup(Group g);
    public void deleteGroup(int id);
    public void updateGroupName(int id, String name);
    public void updateGroupCapacity(int id, int capacity);

}
