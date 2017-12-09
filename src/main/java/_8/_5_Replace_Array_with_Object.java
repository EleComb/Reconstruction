package _8;

/**
 * 以对象取代数组
 * */
public class _5_Replace_Array_with_Object {

    public void test() {
        Performance row = new Performance();
        row.setName("Liverpool");
        row.setWins("15");
    }

    class Performance {
        String name;
        String wins;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWins() {
            return wins;
        }

        public void setWins(String wins) {
            this.wins = wins;
        }
    }

}
