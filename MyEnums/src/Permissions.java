/**
 * Created by Nikita Kurtin on 21/08/2017.
 */
public enum Permissions {
    GUEST, USER, MODERATOR, ADMIN;
    //instance variable (stored property)
    private int postLimits;
    //instance methods
    public void setPostLimits(int postLimits){
        this.postLimits = postLimits;
    }
    public int getPostLimits(){
        return this.postLimits;
    }
}
