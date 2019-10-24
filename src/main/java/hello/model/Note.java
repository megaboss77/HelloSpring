package hello.model;

import org.springframework.data.annotation.Id;

public class Note{

    public Note(String topic,String description, String content){
        this.topic = topic;
        this.description = description;
        this.content = content;
    }
    @Id
    private String id;
    private String topic;
    private String description;
    private String content;


    public String getId(){
        return this.id;
    }

    public String getTopic(){
        return this.topic;
    }
    public String getDescription(){
        return this.description;
    }
    public String getContent(){
        return this.content;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }
}