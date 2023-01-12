package org.example;

public class Main {
    public static void main(String[] args) {

        User u= new User();
        u.setUserName("Alexa");
        u.setFavSport("Asian world cup");
        u.setFavTeam("India");
        u.setScores(11060);
        u.setQualifiers("Australia, India");

        User u1= new User();
        u1.setUserName("Alen");
        u1.setFavSport("Racing");
        u1.setFavTeam("Formula1");
        u1.setQualifiers("Formula1,NASCAR");

        System.out.println("User Name:"+u.getUserName());
        System.out.println("User Favourite Sport:"+u.getFavSport());
        System.out.println("User Favourite Team:"+u.getFavTeam());
        System.out.println("Scores of Team:"+u.getScores());
        System.out.println("Qualified Teams for Final:"+u.getQualifiers());
        System.out.println("User Name:"+u1.getUserName());
        System.out.println("User Favourite Sport:"+u1.getFavSport());
        System.out.println("User Favourite Team:"+u1.getFavTeam());
        System.out.println("Qualified Teams for Final:"+u1.getQualifiers());

    }
}