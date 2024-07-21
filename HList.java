public class HList implements HListI {
    private HNode head;

    @Override
    public void addHouse(House h) {
        HNode newNode = new HNode();
        newNode.setHouse(h);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public void removeHouse(int mls) {
        HNode current = head;
        HNode previous = null;

        while (current != null && current.getHouse().getMls() != mls) {
            previous = current;
            current = current.getNext();
        }

        if (current != null) {
            if (previous != null) {
                previous.setNext(current.getNext());
            } else {
                head = current.getNext();
            }
        } else {
            System.out.println("House with MLS " + mls + " not found.");
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
