package TaskCodeCombat;

public class SingleListExample {
    public static void main(String[] args) {
        SingleList singleList = new SingleList();
        singleList.add(5);
        singleList.print();
    }

    static class SingleList {
        private Node head;

        public SingleList() {
            head = null;
        }

        public void add(Integer data) {
            Node newElement = new Node(data);
            newElement.next = head;
            head = newElement;
        }

        public void print() {
            Node singleList = head;
            while (singleList != null) {
                System.out.println(singleList.data);
                singleList = singleList.next;
            }

        }
    }

    static class Node {
        int data;
        Node next;

        public Node(Integer data) {
            this.data = data;
        }
    }
}

