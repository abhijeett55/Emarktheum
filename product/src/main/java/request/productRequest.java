package request;

import java.util.List;

public class productRequest {
    private String label;
    private String title;
    private String location;
    private int surface;
    private double price;
    private String description;
    private boolean sold;
    private boolean verified;
    private String userId;
    private List<String> images;
    private entities.category category;
    private String sellerAddress;

    public productRequest(String label, String title, String location, int surface, double price, String description, boolean sold, boolean verified, String userId, List<String> images, entities.category category ,String sellerAddress) {
        super();
        this.label = label;
        this.title = title;
        this.location = location;
        this.surface = surface;
        this.price = price;
        this.description = description;
        this.sold = sold;
        this.verified = verified;
        this.userId = userId;
        this.images = images;
        this.category = category;
        this.sellerAddress = sellerAddress;
    }


    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(Sting sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public List<String> getImages() {
        return images;
    }

    public List<String> getImages(List<String> images) {
        this.images = images;
    }


    //getters and setters



}


