/**
 *
 * @author Ousseynou
 */
package entites;


public class Permission {
    private int id;
    private String permission_description;

    public Permission() {
    }

    public Permission(int id, String permission_description) {
        this.id = id;
        this.permission_description = permission_description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermission_description() {
        return permission_description;
    }

    public void setPermission_description(String permission_description) {
        this.permission_description = permission_description;
    }

    @Override
    public String toString() {
        return "Permission{" + "id=" + id + ", permission_description=" + permission_description + '}';
    }
    
    
    
    
}
