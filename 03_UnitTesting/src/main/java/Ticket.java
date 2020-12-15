public class Ticket {

    private final String title;
    private final int seat;

    public Ticket(String title, int seat) {
        this.title = title;
        this.seat = seat;
    }

    public String getTitle() {

        return title;
    }

    public int getSeat() {

        return seat;
    }



    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Ticket t = (Ticket) obj;

        return title.equals(t.title) && Float.compare(t.seat , seat) ==0;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + title.hashCode();
        hash = 31 * hash + seat;

        return hash;

    }
}
