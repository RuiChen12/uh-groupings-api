package APICalls;

/**
 * Created by zac on 12/12/16.
 */
public class GrouperFunction {
    String userName;
    String grouping;

    public GrouperFunction(String userName, String grouping){
        this.userName = userName;
        this.grouping = grouping;
    }

    public String getUserName(){
        return userName;
    }

    public String getGrouping(){
        return grouping;
    }

}
