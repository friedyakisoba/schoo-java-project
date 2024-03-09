public class HNode implements HNodeI {

    private House house;
    private HNode next;

    public HNode() {

        this.house = null;
        this.next = null;

    }

    @Override
    public void setHouse(House house) {

        this.house = house;

    }

    @Override
    public House getHouse() {

        return house;
   
    }

    @Override
    public void setNext(HNode next) {
        
        this.next = next;
   
    }

    @Override
    public HNode getNext() {
        
        return next;

    }

    public String toString() {

        return "HNode{"+
                "house=" + house +
                ", next=" + next +
                '}';
    }
    
}
