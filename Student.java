//MIZANALI PANJWANI - 19BCG10070

class Student {
    private String name;
    private String id;
    private double GPA;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

class Undergrad extends Student {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Undergrad{" +
                "year=" + year +
                '}';
    }
}

class Graduate extends Student {
    private String thesisTitle;

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "thesisTitle='" + thesisTitle + '\'' +
                '}';
    }
}
