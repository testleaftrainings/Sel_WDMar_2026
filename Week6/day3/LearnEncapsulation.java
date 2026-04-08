package week6;

public class LearnEncapsulation {
    private String browserType; // accessibility is restricted within the current class

     public String getBrowserType() {
        return browserType;
    }

    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    public static void main(String[] args) {
        LearnEncapsulation le = new LearnEncapsulation();
        le.setBrowserType("edge");
        System.out.println(le.getBrowserType());
        
    }

   

}
