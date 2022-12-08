package tn.devops.services;
import tn.devops.entities.Research;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.devops.repository.IResearchRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ResearchManagement implements IResearchManagement{
    @Autowired
    IResearchRepository repo;
    @Override
    public int addResearch(Research r) {
        repo.save(r);
        return r.getId();
    }

    @Override
    public void deleteResearch(int id) {
        repo.deleteById(id);
    }

    @Override
    public String updateResearchTitle(int id, String title) {
        try {
            Research r = repo.findById(id).orElse(null);
            r.setTitle(title);
            repo.save(r);
            return r.getTitle();
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown! No research found.");
        }
        return ("no research found");
    }

    @Override
    public String updateResearchTopic(int id, String topic) {
        try {
            Research r = repo.findById(id).orElse(null);
            r.setTopic(topic);
            repo.save(r);
            return r.getTopic();
        } catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }
        return ("no research found");
    }

    @Override
    public Research findResearchId(int id) {
        Research r = repo.findById(id).orElse(null);
        return r;
    }

    @Override
    public List<Research> getListPerson() {
        return null;
    }
}
