package LeetCode;

/*21. Merge Two Sorted Lists*/

class MergeTwoSortedLists extends ClassLoader {

    public static void main(String[] args) {
        SingleList list1 = new SingleList();
        SingleList list2 = new SingleList();
        SingleList list3 = new SingleList();
        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);
        list1.print();
        list2.print();

    }

    static class SingleList {
        ListNode head;
        ListNode tail;

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            while (list1 != null || list1 != null) {
                if (list2 == null || (list1 != null && list1.val < list2.val)) {
                    tail.next = list1;
                    tail = list1;
                    list1 = list1.next;
                }
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
            return head.next;
        }


        void add(int i) {
            ListNode nodeNew = new ListNode(i);
            if (head == null) {
                head = nodeNew;
                tail = nodeNew;
            }
            tail.next = nodeNew;
            tail = nodeNew;
        }

        void print() {
            ListNode listNode = head;
            while (listNode != null) {
                System.out.println(listNode.val);
                listNode = listNode.next;
            }
        }

        static class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }


    }
}