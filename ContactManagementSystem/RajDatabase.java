package ArrayListx;

import java.util.*;

class RajDatabase {

    private ArrayList<Raj> rajx;
    private int nextId;

    public RajDatabase() {
        this.rajx = new ArrayList<>();
        this.nextId = 0;
      }

    // Create
    public void addRaj(String name, String email, String phoneno) {
        Raj raj = new Raj(nextId++, name, email, phoneno);
        rajx.add(raj);
        System.out.println("ID: " + nextId + raj);

    }

    // Read
    public Raj getRaj(int id) {
        for (Raj raj : rajx) {
            if (raj.getId() == id) {
                return raj;
            }
        }
        return null;
    }

    public List<Raj> getAllRaj() {     // sara data show karna
        return new ArrayList<>(rajx);
    }

    // Update
    public boolean updateRaj(int id, String name, String email, String phoneno) {
        Raj raj = getRaj(id);
        if (raj != null) {
            raj.setName(name);
            raj.setEmail(email);
            raj.setPhoneno(phoneno);
            System.out.println("Updated: " + raj);
            return true;
        }
        return false;
    }

    // Delete
    public boolean deleteRaj(int id) {
        Raj raj = getRaj(id);
        if (raj != null) {
            rajx.remove(raj);
            System.out.println("Deleted: " + raj);
            return true;

        }

        return false;
    }

}
