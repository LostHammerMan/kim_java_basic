package section1;

import java.util.ArrayList;
import java.util.List;

public class MovieReviewMain {

    public static void main(String[] args) {

        List<MovieReview> reviews = new ArrayList<>();

        MovieReview movie1 = new MovieReview("인셉션", "인생은 무한 루프");
        MovieReview movie2 = new MovieReview("어바웃 타임", "인생은 시간 영화");

        reviews.add(movie1);
        reviews.add(movie2);

        for (MovieReview movieReviews : reviews){
            System.out.println("영화 제목: " + movieReviews.title + " 리뷰: " + movieReviews.review);
        }
    }
}
