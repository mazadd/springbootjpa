package com.mayahii.spring.boot.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by root on 31/08/16.
 */
@Entity
@Table(name="entry_forum")
public class Forum implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="entry_id")
    private long id;
    @Column(name="entry_text")
    private String text;
    @Column(name="entry_parent")
    private int parent;
    @Column(name="date", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column(name="entry_likes")
    private int likes;
    @Column(name="entry_dislikes")
    private int dislikes;
    
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public int getParent() {
        return parent;
    }
    
    public void setParent(int parent) {
        this.parent = parent;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public int getLikes() {
        return likes;
    }
    
    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public int getDislikes() {
        return dislikes;
    }
    
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
    
    public Forum(){
        
    }
}
