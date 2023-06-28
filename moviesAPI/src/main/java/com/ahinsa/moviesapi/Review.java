package com.ahinsa.moviesapi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.security.PrivateKey;
import java.util.List;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {


    @Id
    private ObjectId id;
    private String body;
    private String reviewID;

    public Review(String body, String reviewID) {
        this.body = body;
        this.reviewID= reviewID;
    }

}
