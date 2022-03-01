package Greedy;
import java.util.*;

class meeting{
    int start;
    int end;
    int pos;
    meeting(int start,int end,int pos){
        this.start = start;
        this.end = end;
        this.pos=pos;
    }
}

class meetingComparator implements Comparator<meeting>{
    @Override
    public int compare(meeting a,meeting b){
        if(a.end==b.end)
            return a.start-b.start;
        return a.end-b.end;
    }
}

public class Solution {
    public static int maximumMeetings(int[] start, int[] end) { 
        List<Integer> ans = new ArrayList<>();
        if(start.length==0){
            ans.add(0);
            return ans.size();
        }        
        List<meeting> meetings = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            meetings.add(new meeting(start[i],end[i],i+1));
        }
        Collections.sort(meetings,new meetingComparator());
        meeting curMeeting = meetings.get(0);
        ans.add(1);
        for(int i=1;i<meetings.size();i++){
            if(meetings.get(i).start>curMeeting.end){
                curMeeting = meetings.get(i);
                System.out.println("meet : "+curMeeting.start+" "+curMeeting.end);
                ans.add(curMeeting.pos);
            }
        }
        return ans.size();
    }

    public static void main(String[] args) {
        int start[] = {0,7,1,4,8};
        int end[] = {2,9,5,9,10};
        int res = maximumMeetings(start, end);
       System.out.println(res);
    }
    
}