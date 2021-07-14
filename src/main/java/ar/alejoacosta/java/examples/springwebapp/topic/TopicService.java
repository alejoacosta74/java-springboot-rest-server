package ar.alejoacosta.java.examples.springwebapp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    /*
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("id1", "Genesis", "Selling England"),
                new Topic("id2", "Pink Floyd", "Dark side of the moon"),
                new Topic("id3", "Charly Garcia", "Modern Clics")
        ));

     */
    @Autowired
    private TopicRepository topicRepository;


      public List<Topic>  getAllTopics(){
          List<Topic> topics = new ArrayList<>();
          topicRepository.findAll().forEach(topics::add);
          return topics;
      }

      public Topic getTopic(String id) {
          //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
          return topicRepository.findById(id).get();
      }

      public void addTopic (Topic topic){
          topicRepository.save(topic);
      }

      public void updateTopic (String id, Topic topic){
          topicRepository.save(topic);
          /*
          for (int i=0; i < topics.size(); i++){
              if (topics.get(i).getId().equals(id)){
                  topics.set(i, topic);
                  return;
              }
          }
           */
      }

      public void deleteTopic (String id){
          //topics.removeIf(topic -> topic.getId().equals(id));
          topicRepository.deleteById(id);
      }

}
