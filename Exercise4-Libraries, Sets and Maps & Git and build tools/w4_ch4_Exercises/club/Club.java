import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Club {
    // Define any necessary fields here ...
    private ArrayList<Membership> members;

    /**
     * Constructor for objects of class Club
     */
    public Club() {
        members = new ArrayList<>();
        // Initialise any fields here ...

    }

    /**
     * Add a new member to the club's list of members.
     * 
     * @param member The member object to be added.
     */
    public void join(Membership member) {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers() {
        return members.size();
    }

    public ArrayList<Membership> removeMembers(int month) {
        Iterator<Membership> itr = members.iterator();
        while (itr.hasNext()) {
            Membership member = itr.next();
            if (member.getMonth() == month) {
                itr.remove();
            }
        }
        return members;
    }

    public ArrayList<Membership> purge(int month, int year) {
        ArrayList<Membership> purgeMembers = new ArrayList<>();
        if (month < 1 || month > 12) {
            System.out.println("error");
            return purgeMembers;
        } else {
            for (Membership member : members) {
                if (member.getMonth() == month && member.getYear() == year) {
                    purgeMembers.add(member);
                }
            }
            return purgeMembers;
        }
    }

}
