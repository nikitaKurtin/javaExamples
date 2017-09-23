package gof.structural.composite;

import java.util.ArrayList;

/**
 * Composite Class
 * each Family Member hold collection of descendants of the same type
 */
class FamilyMember {
    private ArrayList<FamilyMember> descendants;

    private String mFirstName;
    private String mLastName;
    private int generation;

    FamilyMember(String firstName, String lastName) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.generation = 1;
        descendants = new ArrayList<>();
    }

    void addDescendant(FamilyMember descendant) {
        descendants.add(descendant);
        descendant.generation = this.generation + 1;
    }

    void showFamily() {
        System.out.println("Presenting " + mFirstName + " " + mLastName + " + Descendants:");
        showFamily(generation);
    }

    /**
     * Composite method
     */
    private void showFamily(int startingGeneration) {
        StringBuilder sb = new StringBuilder();
        for (int i = startingGeneration; i < generation; i++) //add tab for each generation
            sb.append('\t');
        sb.append(mFirstName).append(' ').append(mLastName);
        System.out.println(sb);
        for (FamilyMember fm : descendants)
            fm.showFamily(startingGeneration);
    }
}
