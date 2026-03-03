class Stud {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

class thisKeyword {
    public static void main(String[] args) {
        Stud st1 = new Stud();
        st1.setId(3121);
        st1.setName("Sami");

        Stud st2 = new Stud();
        st2.setId(3122);
        st2.setName("Mukeet");

        System.out.println(st1.getId() + " " + st1.getName());
        System.out.println(st2.getId() + " " + st2.getName());
    }
}