/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }

        System.out.println("User with most likes:" + max + "\n" + users.get(maxId));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override
            public int compare(Comment c1, Comment c2) {
                return c2.getLikes() - c1.getLikes();
            }
        });

        System.out.println("5 most liked comments:");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
    
    public void getTopFiveInactiveUsers() {
        getUsersBasedOnActivity("Inactive");
    }
    
    public void getTopFiveProactiveUsers() {
        getUsersBasedOnActivity("Proactive");
    }
    
    private void getUsersBasedOnActivity(String activityType) {
        
        //Calculate the likes count for each user
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        System.out.println("Likes count: "+ userLikesCount);
        
        //Calculate the posts count for each user
        Map<Integer, Integer> userPostsCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        for (Post post: posts.values()) {            
            if(userPostsCount.containsKey(post.getUserId())) {
                userPostsCount.put(post.getUserId(), userPostsCount.get(post.getUserId())+1);
            }
            else {
                userPostsCount.put(post.getUserId(), 1);
            }
        }
        System.out.println("Posts count: "+ userPostsCount);
        
        //Calculate the comments count for each user
        Map<Integer, Integer> userCommentsCount = new HashMap<>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        for (Comment comment: comments.values()) {
            
            if(userCommentsCount.containsKey(comment.getUserId())) {
                userCommentsCount.put(comment.getUserId(), userCommentsCount.get(comment.getUserId())+1);
            }
            else {
                userCommentsCount.put(comment.getUserId(), 1);
            }
        }
        System.out.println("Comments count: "+ userCommentsCount);
        
        //Calculate the overall count: likes+posts+comments for each user
        HashMap<Integer, Integer> userOverallCount = new HashMap<>();
        for(int i=0;i<10;i++) {
            int likeCount = userLikesCount.containsKey(i) ? userLikesCount.get(i) : 0;
            int postCount = userPostsCount.containsKey(i) ? userPostsCount.get(i) : 0;
            int commentCount = userCommentsCount.containsKey(i) ? userCommentsCount.get(i) : 0;

            int totalCount = likeCount+postCount+commentCount;
            userOverallCount.put(i, totalCount);
        }
        System.out.println("Overall count: "+userOverallCount);
        
        //Convert map to list to sort using comparator
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer>>(userOverallCount.entrySet()); 
  
        // Sort the list in ascending order for inactive users and descending order for proactive users
        if(activityType.equals("Inactive")) {
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
                public int compare(Map.Entry<Integer, Integer> o1,  
                                   Map.Entry<Integer, Integer> o2) 
                {
                    //in the map, key is userId and value is count; hence sort the list based on map's values
                    return (o1.getValue()).compareTo(o2.getValue()); 
                } 
            }); 
        }
        else {
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
                public int compare(Map.Entry<Integer, Integer> o1,  
                                   Map.Entry<Integer, Integer> o2) 
                { 
                    //in the map, key is userId and value is count; hence sort the list based on map's values
                    return (o2.getValue()).compareTo(o1.getValue()); 
                } 
            });
        }
          
        // put data from sorted list to linked hashmap (linked hasmap retains the order) 
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        HashMap<Integer, User> topFiveUsers = new LinkedHashMap<Integer,User> ();
        for (Map.Entry<Integer, Integer> aa : list) { 
            if(temp.size()<5) {
                temp.put(aa.getKey(), aa.getValue()); 
                topFiveUsers.put(aa.getKey(), users.get(aa.getKey()));
            }
        }
        
        //Display the end result
        System.out.println("Sorted count: "+temp);
        System.out.println("Top 5 "+activityType+" user details: "+topFiveUsers);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
            
    }
       
    //average number of likes per comment
    public void getAverageLikesPerComment(){
        Map<Integer,Comment> comments=DataStore.getInstance().getComments();
        int likes=0;
        int noOfComments=0;
        for(Comment comment:comments.values()){
            noOfComments++;
            likes+=comment.getLikes();
        }
        int average=likes/noOfComments;
        System.out.println("The average likes per comment is "+average);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
    
    //find the post with maximum comments
    public void getMaximumCommentsPost(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        //Map<Post,Integer> commentCount=new HashMap<>();
        int maxcommentCount=0;
        for(Post post:posts.values()){
            if(post.getComments().size() > maxcommentCount){
                maxcommentCount=post.getComments().size();
            }
        }
        System.out.println("The maximum commented post with "+maxcommentCount+" comments is/are: ");
        for(Post post:posts.values()){
            if(post.getComments().size() == maxcommentCount){
                System.out.println(post);
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
    
    //top 5 inactive users based on total comments they created
    public void getInactiveUsersBasedOnComments(){
        Map<Integer,User> users=DataStore.getInstance().getUsers();
        List<User> userList=new ArrayList<>();
        for(User user:users.values()){
            userList.add(user);
        }
        Comparator<User> userComparator=new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
               return Integer.compare(o1.getComments().size(), o2.getComments().size());
            }
        };
        Collections.sort(userList,userComparator);
        System.out.println("The top 5 inactive users based on total comments they created are: ");
        for(int i=0;i<5;i++){
            System.out.println(userList.get(i));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
    
    
    
     /**
     * The post with the most liked comments point 2
     */
    public void displayPostWithMostLikedComments(){
        
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Comparator<Comment> userComparator=new Comparator<Comment>() {
            @Override
            public int compare(Comment o1, Comment o2) {
               return Integer.compare(o2.getLikes(), o1.getLikes());
            }
        };
        Collections.sort(commentList,userComparator);
        
        int maxLikedCount = commentList.get(0).getLikes();
        
        Comment maxLikedComment = commentList.get(0);
        
        System.out.println("Post with most liked comment is/are: ");

        for(Comment c : commentList){
            if(maxLikedCount == c.getLikes()){
                System.out.println("Post Id: "+c.getPostId());
                System.out.println("Likes Number: "+c.getLikes());
                System.out.println("Posting User Id: "+c.getUserId());
                System.out.println("Contains comments: ");
                
                for(Comment comment : DataStore.getInstance().getPosts().get(c.getPostId()).getComments()){
                    System.out.println("Comment Id: "+comment.getId() + " with "+comment.getLikes() +" likes: " + comment.getText());
                }
            } else {
                break;
            }
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
    }
    /**
     * Top 5 inactive users based on total post numbers - point 4
     */
    public void displayTop5InactiveUsers(){
        
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
        
        Map<Integer, Integer> userPostsCount = new HashMap<>();

        for (Post post : postList) {
            userPostsCount.put(post.getUserId(), userPostsCount.getOrDefault(post.getUserId(), 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer>>(userPostsCount.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        System.out.println("Top 5 inactive users based on total posts number: ");
        
        int i = 0;

        for (Map.Entry<Integer, Integer> aa : list) { 
            
            System.out.println(DataStore.getInstance().getUsers().get(aa.getKey()) + ", Post count :" + aa.getValue()); 
            
            if(i == 4){
                break;
            }
            i++;
        } 

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
    }
        
}
