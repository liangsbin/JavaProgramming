public class Student implements Comparable{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            if(this.score > ((Student) o).score)
                return -1;
            else if(this.score == ((Student) o).score)
                return 0;
            else
                return 1;
        }
        return 0;
    }
}
