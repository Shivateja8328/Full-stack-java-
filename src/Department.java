
public abstract class Department {
    public abstract int getDepartmentSize();
}

class NewDepartment extends Department {
    private int departmentSize;

    public NewDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }

    public static void main(String[] args) {
        Department d = new NewDepartment(20);
        System.out.println(d.getDepartmentSize());
    }
}
