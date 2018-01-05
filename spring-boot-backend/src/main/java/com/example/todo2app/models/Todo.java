package com.example.todo2app.models;

import java.util.Date;
import javax.validation.constraints.Size;

import com.example.todo2app.Todo2appApplication;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.apache.log4j.Logger;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="todos")
//The @JsonIgnoreProperties annotation is used to ignore createdAt field during deserialization. 
//We don’t want clients to send the createdAt value. If they send a value for this field, we’ll simply ignore it.

@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Todo {
	final static Logger logger = Logger.getLogger(Todo2appApplication.class);
	
    @Id
    private String id;
    
    //Also, We make sure that the todo’s title is not blank by annotating it with @NotBlank annotation.
    @NotBlank
    @Size(max=100)
    //We have annotated title with @Indexed annotation and marked it as unique. This creates a unique index on title field.
    @Indexed(unique=true)
    private String title;
    
    private String description = "You owe to set description";
    
    private Boolean completed = false;
    
    private Date createdAt = new Date();
    
    public Todo() {
    	
        super();
        logger.info("Todo :: ctor ");
    }
    
    public Todo(String title) {
    	
        this.title = title;
        logger.info("Todo :: ctor " + title );
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getCompleted() {
        return completed;
    }
    
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s, title='%s', completed='%s']",
                id, title, completed);
    }
}