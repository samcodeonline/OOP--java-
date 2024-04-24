package com.sam.a.Enterperneur;

import java.util.ArrayList;

public class Startup implements ParentGrind, FriendAdvices {

    private ArrayList<Business> startup;

    public Startup() {
        startup = new ArrayList<Business>();
    }

    public void addStartupIdeas(Business ideaAddition) {
        startup.add(ideaAddition);
    }

    public void removeStartupIdeas(Business ideaRemoval) {
        startup.remove(ideaRemoval);
    }

    public ArrayList<Business> getStartup() {
        return startup;
    }

    static class Business {
        String mindSet;
        int numOfHoursSpentDeveloping;

        public Business(String mindSet, int numOfHoursSpentDeveloping) {
            this.mindSet = mindSet;
            this.numOfHoursSpentDeveloping = numOfHoursSpentDeveloping;
        }

        public String getMindSet() {
            return mindSet;
        }


        public int getNumOfHoursSpentDeveloping() {
            return numOfHoursSpentDeveloping;
        }

    }

    public static void main(String[] args) {
        Startup startOne = new Startup();
        System.out.println(FriendAdvices.stopExcuses());

        Business businessIdea = new Business("optimistic", 23);
        Business businessIdeaTwo = new Business("negative", 3);
        startOne.addStartupIdeas(businessIdea);
        startOne.addStartupIdeas(businessIdeaTwo);

        for (Business myIdea : startOne.getStartup()) {
            System.out.println(myIdea.getMindSet() + myIdea.getNumOfHoursSpentDeveloping());
        }

        startOne.removeStartupIdeas(businessIdeaTwo);

        System.out.println("After removal of the item two ");

        for (Business myIdea : startOne.getStartup()){
            System.out.println(myIdea.getMindSet() + myIdea.getNumOfHoursSpentDeveloping());
        }
    }
}










