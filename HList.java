public class HList implements HListI {
    private HNode head;

    public HList() {

        head = null;

    }

    @Override
    public void addHouse(House h) {

        HNode newNode = new HNode();
        newNode.setHouse(h);

        if (head == null) {
            head = newNode;
        } else {
            HNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();

            }
            current.setNext(newNode);
        }

    }

    @Override
    public void removeHouse(int mls) {
        HNode current = head;
        HNode prev = null;

        while (current != null && current.getHouse().getMls() != mls) {
            prev = current;
            current = current.getNext();

        }

        if (current != null) {
            if (prev == null) {
                head = current.getNext();
            } else {
                prev.setNext(current.getNext());
            }
        } else {
            System.out.println("House With MLS" + mls + "Not Found.");
        }

    }

    @Override
    public void printAll() {
        HNode current = head;

        while (current != null) {
            System.out.println(current.getHouse());
            current = current.getNext();
        }

    }

    @Override
    public void printLower(double price) {

        HNode current = head;

        while (current != null) {
            if (current.getHouse().getPrice() < price) {
                System.out.println(current.getHouse());

            }

            current = current.getNext();

        }

    }

    public boolean containsMLS(int mls) {
        HNode current = head;

        while (current != null) {
            if (current.getHouse().getMls() == mls) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

}
