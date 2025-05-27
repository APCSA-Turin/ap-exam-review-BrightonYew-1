import java.util.ArrayList;

public class ReviewCollector {
    // NOTE: these instance variables were made public to enable test code
    public ArrayList<ProductReview> reviewList;
    public ArrayList<String> productList;

    /** Constructs a ReviewCollector object and initializes the instance variables. */
    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    /** Adds a new review to the collection of reviews, as described in part (a). */
    public void addReview(ProductReview prodReview) {
        /* to be implemented in part (a) */
reviewList.add(prodReview);
boolean found = false;
for (int i = 0; i < productList.size(); i++) {
	if (productList.get(i).equals(prodReview.getName())) {
    	found = true;
    }
}

if (!found) {
	productList.add(prodReview.getName());
}

    }

    /** Returns the number of good reviews for a given product name, as described in part (b). */
    public int getNumGoodReviews(String prodName) {
        /* to be implemented in part (b) */
        int count = 0;
        for (int i = 0; i < reviewList.size(); i++) {
            if (reviewList.get(i).getReview().indexOf("best") != -1) {
                count++;
            }
        }
        return count;

    }
}

