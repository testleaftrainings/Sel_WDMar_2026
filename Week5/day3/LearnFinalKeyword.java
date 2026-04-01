package week5.day3;

//cannot inherit from final LearnFinalKeyword
public final class LearnFinalKeyword {
 // The blank final field browserName may not have been initialized   
 final String browserName="safari"; // variable browserName cannot be reinitialized
 public final void browserProfile(){ 
    // sub classess cannot override the core logic
    // browserName="chrome"; // The final field LearnFinalKeyword.browserName cannot be assigned
    System.out.println("Guest");
 }
public static void main(String[] args) {
    LearnFinalKeyword object = new LearnFinalKeyword();
    System.out.println(object.browserName);
    object.browserProfile();
}


}
