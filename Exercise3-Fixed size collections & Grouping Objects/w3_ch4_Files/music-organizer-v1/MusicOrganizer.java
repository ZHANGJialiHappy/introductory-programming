import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer {
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer() {
        files = new ArrayList<>();
    }

    /**
     * Add a file to the collection.
     * 
     * @param filename The file to be added.
     */
    public void addFile(String filename) {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * 
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }

    /**
     * List a file from the collection.
     * 
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        if (validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        } else {
            System.out.println("error");
        }
    }

    /**
     * Remove a file from the collection.
     * 
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if (validIndex(index)) {
            files.remove(index);
        } else
            System.out.println("error");
    }

    public String items() {
        if (files.size() < 5) {
            return "error";
        } else {
            return files.get(4);
        }
    }

    public void dates() {
        if (files.size() < 3) {
            return;
        } else {
            files.remove(2);
        }
    }

    public String getIndex(String item) {
        if (files.contains(item)) {
            // System.out.println(files.indexOf(item));
            return Integer.toString(files.indexOf(item));
        } else {
            return "no this item.";
        }
    }

    public void checkIndex(int index) {
        if (files.size() == 0)
            System.out.println("it's an empty file");
        else {
            if (index < 0 || index > files.size() - 1) {
                System.out.println("the valid range is between 0 and " + (files.size() - 1));
            } else {
                return;
            }
        }
    }

    public boolean validIndex(int index) {
        if (files.size() == 0) {
            System.out.println("it's an empty file");
            return false;

        } else {
            if (index < 0 || index > files.size() - 1) {
                return false;
            } else {
                return true;
            }
        }
    }
}
